package Classes.HousesFolder;

import java.util.ArrayList;

import Classes.KhandansFolder.Khandan;
import Classes.KhandansFolder.Stark;
import Classes.ToolsFolder.Asb;
import Classes.ToolsFolder.GhaleSagMethods;
import Classes.ToolsFolder.Gorg;
import Classes.ToolsFolder.Sag;
import Classes.ToolsFolder.Tools.Khandanha;

public class WinterFellGhale extends Ghale implements GhaleSagMethods {
	

	
	private ArrayList<Gorg> gorgs = new ArrayList<Gorg>();
	public ArrayList<Sag> sags = new ArrayList<Sag>();
	
	
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
	
	public ArrayList<Gorg> getGorgs(){
		return gorgs;
	}

	public void addSag(int number) {
		// TODO Auto-generated method stub
		for(int i=0; i<number; i++)
				sags.add(new Sag());
	}

	public void removeSag(int number) {
		// TODO Auto-generated method stub
		int bSags = sags.size() - number;
		while(sags.size() > bSags)
			sags.remove(0);
	}
	

}
