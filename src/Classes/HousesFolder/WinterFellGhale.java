package Classes.HousesFolder;

import java.util.ArrayList;

import Classes.ToolsFolder.Gorg;
import Classes.ToolsFolder.Tools.Khandanha;

public class WinterFellGhale extends Ghale {
	

	
	public ArrayList<Gorg> gorgs = new ArrayList<Gorg>();
	
	
	public void createGorg(Gorg gorg) {
		gorgs.add(gorg);
	}
	
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
