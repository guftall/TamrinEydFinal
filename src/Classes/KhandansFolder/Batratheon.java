package Classes.KhandansFolder;

import Classes.HousesFolder.Ghale;
import Classes.HousesFolder.StormAndGhale;
import Classes.ToolsFolder.KhandanPerson;
import Classes.ToolsFolder.Tools;

public class Batratheon extends Khandan {
	
	public Batratheon() {
		this(new KhandanPerson("Robert", "Baratheon"), new KhandanPerson("Sersi", "Lenister"),
							"Khashm Az Ane Mast", "Gavazn", 300);

		setGhale(new StormAndGhale());
	}

	public Batratheon(KhandanPerson father, KhandanPerson mother, String shoar, String nemad, int ghedmat) {
		super(father, mother, shoar, nemad, ghedmat);

	}

	@Override
	protected void setGhale(Ghale ghale) {
		// TODO Auto-generated method stub
		this.ghale = ghale;
	}
	
	public void FelanKarKeMethodeshTuyeStormAndHast() {
		StormAndGhale stormAndGhale = (StormAndGhale) ghale;
		
		stormAndGhale.stormAndMethod();
	}

	@Override
	public void reveiveSarbaz(int number) {
		// TODO Auto-generated method stub
		ghale.getSarbazKhane().addSarbaz(number);
	}



}
