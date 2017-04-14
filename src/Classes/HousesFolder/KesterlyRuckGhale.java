package Classes.HousesFolder;

import java.util.ArrayList;

import Classes.KhandansFolder.Lenister;
import Classes.ToolsFolder.Kala;
import Classes.ToolsFolder.Tools.Khandanha;
import Classes.ToolsFolder.Tools.NoeKala;

public class KesterlyRuckGhale extends Ghale {

	public ArrayList<Kala> madaneTala = new ArrayList<Kala>();
	
	public KesterlyRuckGhale() {
		super("kesterly Ruck", "Gharbe Vestrus", Khandanha.Lenister);
	}
	
	public void bardashteTala(int number) {
		for(int i=0; i<number; i++)
			madaneTala.add(new Kala(NoeKala.Tala));
	}
	
	public ArrayList<Kala> sellTala(Lenister lenister, int number) {
		return lenister.sendKala(number, NoeKala.Tala);
	}

}
