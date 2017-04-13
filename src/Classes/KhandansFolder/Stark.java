package Classes.KhandansFolder;

import java.util.ArrayList;

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
		
		
		
	}
	
	private Stark(KhandanPerson father, KhandanPerson mother, String shoar, String nemad, int ghedmat) {
		super(father, mother, shoar, nemad, ghedmat);
		amuyeKhandan = new KhandanPerson("Benjen", "Stark");
	}


	public KhandanPerson getAmuyeKhandan() {
		return amuyeKhandan;
	}

	@Override
	public void setGhale(Ghale ghale) {
		// TODO Auto-generated method stub
		this.ghale = ghale;
	}


	@Override
	public void reveiveSarbaz(int number) {
		// TODO Auto-generated method stub
		
	}

}
