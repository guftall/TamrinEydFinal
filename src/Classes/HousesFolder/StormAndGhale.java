package Classes.HousesFolder;

import java.util.ArrayList;

import Classes.ToolsFolder.GhaleSagMethods;
import Classes.ToolsFolder.Sag;
import Classes.ToolsFolder.Tools.Khandanha;

public class StormAndGhale extends Ghale implements GhaleSagMethods {
	

	public ArrayList<Sag> sags = new ArrayList<Sag>();

	public StormAndGhale() {
		super("Storm And", "Markaze Vestrus", Khandanha.Batratheon);
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
