package Classes.KhandansFolder;

import java.util.ArrayList;

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
	
	protected Ghale ghale;
	
	
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
	

}
