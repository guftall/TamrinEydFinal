package Classes.HousesFolder;

import java.util.ArrayList;

import Classes.ToolsFolder.Ejdeha;
import Classes.ToolsFolder.Tools.Khandanha;
import Classes.ToolsFolder.WarHeyvansMethods;

public class MirinGhale extends Ghale implements WarHeyvansMethods {
	
	private ArrayList<Ejdeha> ejdehas = new ArrayList<Ejdeha>(3);
	private int keshtis;
	private boolean useEjdehas = false;
	
	
	public MirinGhale() {
		super("Herame Bozorge Mirin", "Esus", Khandanha.Targrin);

		ejdehas.add(new Ejdeha());
		ejdehas.add(new Ejdeha());
		ejdehas.add(new Ejdeha());
	}
	
	public ArrayList<Ejdeha> getEjdehas(){
		return ejdehas;
	}
	
	public void addKeshti(int number) {
		keshtis += number;
	}


	public void repairHeyvan() {
		// TODO Auto-generated method stub
		for(int i=0; i<ejdehas.size(); i++)
		{
			if(ejdehas.get(i).ghodrat < 350) {
				if(ejdehas.get(i).ghodrat >= 300)
					ejdehas.get(i).ghodrat = 350;
				else
					ejdehas.get(i).ghodrat += 50;
			}
		}
	}
	
	public void rahaKardaneEjdehasDarJang(boolean useEjdehas) {
		this.setUseEjdehas(useEjdehas);
	}

	public boolean isUseEjdehas() {
		return useEjdehas;
	}

	public void setUseEjdehas(boolean useEjdehas) {
		this.useEjdehas = useEjdehas;
	}

}
