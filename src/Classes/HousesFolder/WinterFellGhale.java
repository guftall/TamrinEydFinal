package Classes.HousesFolder;

import java.util.ArrayList;

import Classes.KhandansFolder.Khandan;
import Classes.KhandansFolder.Stark;
import Classes.ToolsFolder.Asb;
import Classes.ToolsFolder.Gorg;
import Classes.ToolsFolder.Sag;
import Classes.ToolsFolder.Tools.Khandanha;

public class WinterFellGhale extends Ghale {
	

	
	private ArrayList<Gorg> gorgs = new ArrayList<Gorg>();
	public ArrayList<Sag> sags = new ArrayList<Sag>();
	public ArrayList<Asb> asbs = new ArrayList<Asb>();
	
	
	public void createGorg(Gorg gorg) {
		gorgs.add(gorg);
	}
	
	/* 		Explain		*/
	public void repairGorg() {
		for(int i=0; i<gorgs.size(); i++)
		{
			if(gorgs.get(i).ghodrat < 50) {
				if(gorgs.get(i).ghodrat >= 30)
					gorgs.get(i).ghodrat = 50;
				else
					gorgs.get(i).ghodrat += 20;
			}
		}
	}
	
	
	public WinterFellGhale() {
		super("Winter Fell", "Shomale Vestrus", Khandanha.Stark);
	}
	

}
