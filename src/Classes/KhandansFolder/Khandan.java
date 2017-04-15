package Classes.KhandansFolder;

import java.util.ArrayList;
import java.util.Random;

import Classes.HousesFolder.Ghale;
import Classes.HousesFolder.WinterFellGhale;
import Classes.ToolsFolder.Kala;
import Classes.ToolsFolder.KhandanPerson;
import Classes.ToolsFolder.Tools;
import Classes.ToolsFolder.Tools.NoeKala;

public abstract class Khandan {
	
	private final KhandanPerson khandanFather;
	private final KhandanPerson khandanMother;
	
	private final String shoar;
	private final String nemad;
	private final int ghedmat;
	
	protected ArrayList<KhandanPerson> khandanChildren = new ArrayList<KhandanPerson>();
	private ArrayList<Tools.Khandanha> motahedan = new ArrayList<Tools.Khandanha>();
	
	protected Ghale ghale;
	
	
	public Khandan(KhandanPerson father, KhandanPerson mother,String shoar, String nemad, int ghedmat) {
		
		this.khandanFather = father;
		this.khandanMother= mother;
		
		this.nemad = nemad;
		this.shoar = shoar;
		this.ghedmat = ghedmat;
	}


	protected abstract void setGhale(Ghale ghale);
	protected abstract void setChildrens();

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
			khandan.reveiveSarbaz(number);
		
	}
	public void reveiveSarbaz(int number) {
		ghale.getSarbazKhane().addSarbaz(number);
	}
	
	// فرستادن کالا
	public ArrayList<Kala> sendKala(int number, NoeKala noeKala) {
		int kda = ghale.getAnbar().getTedadeKala(noeKala);
		if(kda >= number) {
			// can send Kala
			
			ArrayList<Kala> res = new ArrayList<Kala>();
			
			for(int i=0; i<number; i++) {
				res.add(ghale.getAnbar().getKala(noeKala));
			}
			return res;
		}
		else if(kda < number) {
			// can not send kala
		}
		return new ArrayList<Kala>();
	}
	
	public void receiveKala(ArrayList<Kala> kalas) {
		for (Kala kala : kalas) {
			ghale.getAnbar().addKala(kala);
		}
	}
	

	
	// جنگ
	public void startWarWith(Khandan khandan) {
		khandan.receiveWar(this); // ارسال خاندان من برای وار با خاندا دریافت شده در پارامتر
	}
	
	public void receiveWar(Khandan enemy) {
		
		String modafe = this.ghale.khandan.toString();
		String motajavez = enemy.ghale.khandan.toString();
		
		System.out.println("War Details:");
		
		// اضافه کردن تعداد تصادفی سرباز به قلعه خودم برای دفاع
		Random random = new Random();
		ghale.getSarbazKhane().addSarbaz(random.nextInt(1500));
		
		System.out.println(modafe+ " Have "+ this.ghale.getSarbazKhane().getSarbazHaNumber()+ " Sarbaz.");
		System.out.println(motajavez+ " Have "+ enemy.ghale.getSarbazKhane().getSarbazHaNumber()+ " Sarbaz.\n");
		
		
		int mySN = ghale.getSarbazKhane().getSarbazHaNumber();
		int enSN = enemy.ghale.getSarbazKhane().getSarbazHaNumber();
		if(mySN > enSN) {
			// Borde Man
			System.out.println(modafe+ "(modafe) Piruz shod.");
			System.out.println(motajavez + "(motajavez) Shekast Khord");
		}
		else if(mySN < enSN) {
			// shekaste Man
			
			// خالی کردن انبار من

			ArrayList<Kala> kalahayeMan = ghale.getAnbar().getAllKala();
			for (Kala kala : kalahayeMan) {
				enemy.ghale.getAnbar().addKala(kala);
			}
			
			System.out.println(modafe + "(modafe) Shekast Khord." + this.ghale.getAnbar().getTedadeAllKala()+ " Kala gharat Shod.");
			System.out.println(motajavez + "(motajavez) Piruz Shod.");
			this.ghale.getAnbar().removeAllKala();
		}
		else {
			// Solh
			motahedan.add(enemy.ghale.khandan);
			enemy.addMotahed(this.ghale.khandan);
			System.out.println("Beyne "+ modafe + " Va "+ motajavez+ "(motajavez) Solh ijad shod.alan motahed Astand");
		}
	}
	
	public Ghale getGhale() {
		return ghale;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ghale.khandan.toString();
	}


}
