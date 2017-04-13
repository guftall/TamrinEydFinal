package Classes.KhandansFolder;

import java.util.ArrayList;
import java.util.Random;

import Classes.HousesFolder.Ghale;
import Classes.HousesFolder.WinterFellGhale;
import Classes.ToolsFolder.Gorg;
import Classes.ToolsFolder.Heyvan;
import Classes.ToolsFolder.KhandanPerson;
import Classes.ToolsFolder.Tools;
import Classes.ToolsFolder.Tools.Khandanha;

public class Stark extends Khandan {
	
	private final KhandanPerson amuyeKhandan;

	public Stark() {
		this(new KhandanPerson("Lord Edard", "Stark"), new KhandanPerson("Banu katlin", "Tali"),
								"Zemestan dar rah ast", "Gorg", 8000 );
		// TODO Auto-generated constructor stub
		setGhale(new WinterFellGhale());
		ghale.increaseJamiyat(9 + ghale.getSarbazKhane().getSarbazHaNumber());
	}
	
	public WinterFellGhale getGhale() {
		return (WinterFellGhale) ghale;
	}
	
	private Stark(KhandanPerson father, KhandanPerson mother, String shoar, String nemad, int ghedmat) {
		super(father, mother, shoar, nemad, ghedmat);
		amuyeKhandan = new KhandanPerson("Benjen", "Stark");
	}


	public KhandanPerson getAmuyeKhandan() {
		return amuyeKhandan;
	}

	@Override
	protected void setGhale(Ghale ghale) {
		// TODO Auto-generated method stub
		this.ghale = ghale;
	}


	@Override
	public void reveiveSarbaz(int number) {
		// TODO Auto-generated method stub
		
	}
	
	/*		Explain 	*/
	public void createGorg() {
		Gorg gorg = null;
		Random random = new Random();
		switch (random.nextInt(9)) {
		case 0:
			gorg = new Gorg(getKhandanFather());
			break;
		case 1:
			gorg = new Gorg(getKhandanMother());
			break;
		case 2:
			gorg = new Gorg(getAmuyeKhandan());
			break;
		case 3:
			gorg = new  Gorg(khandanChildren.get(0));
			break;
		case 4:
			gorg = new Gorg(khandanChildren.get(2));
			break;
		case 5:
			gorg = new Gorg(khandanChildren.get(1));
			break;
		case 6:
			gorg = new Gorg(khandanChildren.get(4));
			break;
		case 7:
			gorg = new Gorg(khandanChildren.get(3));
			break;
		case 8:
			gorg = new Gorg(khandanChildren.get(5));
			break;
		}
		getGhale().createGorg(gorg);
		
	}
	

}
