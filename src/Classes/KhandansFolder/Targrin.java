package Classes.KhandansFolder;

import Classes.HousesFolder.Ghale;
import Classes.HousesFolder.MirinGhale;
import Classes.ToolsFolder.KhandanPerson;
import Classes.ToolsFolder.Tools;

public class Targrin extends Khandan {

	public Targrin(KhandanPerson father, KhandanPerson mother, String shoar, String nemad, int ghedmat) {
		super(father, mother, shoar, nemad, ghedmat);
		// TODO Auto-generated constructor stub
		setGhale(new MirinGhale());
		setMyKhandan(Tools.Khandanha.Targrin);
	}


	@Override
	public void setGhale(Ghale ghale) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void reveiveSarbaz(int number) {
		// TODO Auto-generated method stub
		
	}

}
