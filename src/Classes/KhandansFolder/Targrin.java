package Classes.KhandansFolder;

import java.util.ArrayList;

import Classes.HousesFolder.Ghale;
import Classes.HousesFolder.MirinGhale;
import Classes.ToolsFolder.Heyvan;
import Classes.ToolsFolder.KhandanPerson;
import Classes.ToolsFolder.Tools;

public class Targrin extends Khandan {

	
	public Targrin() {
		this(new KhandanPerson("Aeris", "Targrin"), new KhandanPerson("Raela", "Targrin"),
								"Khun va Atash", "Ejdehaye Se SAare Ghermez", 500);

		setGhale(new MirinGhale());
	}
	
	private Targrin(KhandanPerson father, KhandanPerson mother, String shoar, String nemad, int ghedmat) {
		super(father, mother, shoar, nemad, ghedmat);
		// TODO Auto-generated constructor stub
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
