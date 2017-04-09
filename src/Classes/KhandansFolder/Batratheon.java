package Classes.KhandansFolder;

import Classes.HousesFolder.Ghale;
import Classes.HousesFolder.StormAndGhale;
import Classes.ToolsFolder.KhandanPerson;

public class Batratheon extends Khandan {

	public Batratheon(KhandanPerson father, KhandanPerson mother, String shoar, String nemad, int ghedmat) {
		super(father, mother, shoar, nemad, ghedmat);
		// TODO Auto-generated constructor stub
		setGhale(new StormAndGhale());
	}

	@Override
	public void setGhale(Ghale ghale) {
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
