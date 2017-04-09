package Classes.KhandansFolder;

import java.util.ArrayList;

import Classes.HousesFolder.Ghale;
import Classes.HousesFolder.WinterFellGhale;
import Classes.ToolsFolder.Heyvan;
import Classes.ToolsFolder.KhandanPerson;
import Classes.ToolsFolder.Tools;

public class Stark extends Khandan {
	
	
	public ArrayList<Heyvan> heyvans = new ArrayList<Heyvan>();
	
	

	public Stark(KhandanPerson father, KhandanPerson mother, String shoar, String nemad, int ghedmat) {
		super(father, mother, shoar, nemad, ghedmat);
		// TODO Auto-generated constructor stub
		setGhale(new WinterFellGhale());
		setMyKhandan(Tools.Khandanha.Stark);
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
