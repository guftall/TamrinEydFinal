package Classes.KhandansFolder;

import java.util.ArrayList;

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
	
	private WinterFellGhale ghale;
	
	
	
	public Khandan(KhandanPerson father, KhandanPerson mother,String shoar, String nemad, int ghedmat) {
		
		this.khandanFather = father;
		this.khandanMother= mother;
		
		this.nemad = nemad;
		this.shoar = shoar;
		this.ghedmat = ghedmat;
	}



	public WinterFellGhale getGhale() {
		return ghale;
	}



	public void setGhale(WinterFellGhale ghale) {
		this.ghale = ghale;
	}
	

}
