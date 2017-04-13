package Classes.KhandansFolder;

import java.util.ArrayList;
import java.util.Random;

import Classes.HousesFolder.Ghale;
import Classes.HousesFolder.WinterFellGhale;
import Classes.ToolsFolder.KhandanPerson;
import Classes.ToolsFolder.Tools;

public abstract class Khandan {
	
	private final KhandanPerson khandanFather;
	private final KhandanPerson khandanMother;
	
	private final String shoar;
	private final String nemad;
	private final int ghedmat;
	
	private ArrayList<KhandanPerson> khandanChildren;
	private ArrayList<Tools.Khandanha> motahedan;
	
	private Tools.Khandanha myKhandan;
	
	public Ghale ghale;
	
	
	public Khandan(KhandanPerson father, KhandanPerson mother,String shoar, String nemad, int ghedmat) {
		
		this.khandanFather = father;
		this.khandanMother= mother;
		
		this.nemad = nemad;
		this.shoar = shoar;
		this.ghedmat = ghedmat;
	}


	public abstract void setGhale(Ghale ghale);


	public int getGhedmat() {
		return ghedmat;
	}



	public String getNemad() {
		return nemad;
	}



	public String getShoar() {
		return shoar;
	}



	public KhandanPerson getKhandanMother() {
		return khandanMother;
	}



	public KhandanPerson getKhandanFather() {
		return khandanFather;
	}


	// اضافه و حذف کردن متحدان
	public ArrayList<Tools.Khandanha> getMotahedan() {
		return motahedan;
	}

	public void addMotahed(Tools.Khandanha motahed) {
		this.motahedan.add(motahed);
	}
	
	public void removeMotahed(Tools.Khandanha khandan) {
		this.motahedan.remove(khandan);
	}
	
	// فرستادن نیروی نظامی به خاندان دیگر
	public void sendSarbaz(int number, Khandan khandan) {
		
		// باید سرباز بسازد
		for(int i=0; i<number; i++)
			khandan.reveiveSarbaz(number);
		
	}
	public abstract void reveiveSarbaz(int number);
	
	// فرستادن کالا
	public void sendKala(int number, Khandan khandan) {
		int kda = ghale.getAnbar().getTedadeKala();
		if(kda >= number) {
			// can send Kala
			ghale.getAnbar().removeKala(number);
			khandan.receiveKala(number);
		}
		else if(kda < number) {
			// can not send kala
		}
	}
	
	public void receiveKala(int number) {
		ghale.getAnbar().addKala(number);
	}

	
	// جنگ
	public void startWarWith(Khandan khandan) {
		khandan.receiveWar(this); // ارسال خاندان من برای وار با خاندا دریافت شده در پارامتر
	}
	
	public void receiveWar(Khandan enemy) {
		
		// اضافه کردن تعداد تصادفی سرباز به قلعه خودم برای دفاع
		Random random = new Random();
		ghale.getSarbazKhane().addSarbaz(random.nextInt(1500));
		
		int mySN = ghale.getSarbazKhane().getSarbazHaNumber();
		int enSN = enemy.ghale.getSarbazKhane().getSarbazHaNumber();
		if(mySN > enSN) {
			// Borde Man
		}
		else if(mySN < enSN) {
			// shekaste Man
			
			// خالی کردن انبار من
			enemy.ghale.getAnbar().addKala(this.ghale.getAnbar().getTedadeKala());
			this.ghale.getAnbar().removeAllKala();
		}
		else {
			// Solh
			motahedan.add(enemy.getMyKhandan());
			enemy.addMotahed(this.getMyKhandan());
		}
	}


	public Tools.Khandanha getMyKhandan() {
		return myKhandan;
	}


	public void setMyKhandan(Tools.Khandanha myKhandan) {
		this.myKhandan = myKhandan;
	}

}
