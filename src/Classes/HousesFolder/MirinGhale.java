package Classes.HousesFolder;

import java.util.ArrayList;

import Classes.ToolsFolder.Ejdeha;
import Classes.ToolsFolder.Tools.Khandanha;

public class MirinGhale extends Ghale {
	
	private ArrayList<Ejdeha> ejdehas = new ArrayList<Ejdeha>(3);
	
	
	
	public MirinGhale() {
		super("Herame Bozorge Mirin", "Esus", Khandanha.Targrin);

		ejdehas.add(new Ejdeha());
		ejdehas.add(new Ejdeha());
		ejdehas.add(new Ejdeha());
	}
	
	public ArrayList<Ejdeha> getEjdehas(){
		return ejdehas;
	}

}
