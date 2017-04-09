package Classes.KhandansFolder;

import Classes.HousesFolder.Ghale;
import Classes.HousesFolder.KesterlyRuckGhale;
import Classes.HousesFolder.WinterFellGhale;
import Classes.ToolsFolder.KhandanPerson;
import Classes.ToolsFolder.Tools;

public class Lenister extends Khandan {

	public Lenister(KhandanPerson father, KhandanPerson mother, String shoar, String nemad, int ghedmat) {
		super(father, mother, shoar, nemad, ghedmat);
		// TODO Auto-generated constructor stub
		setGhale(new KesterlyRuckGhale());
		setMyKhandan(Tools.Khandanha.Lenister);
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
