package Classes.HousesFolder;

import java.util.ArrayList;

import Classes.KhandansFolder.Lenister;
import Classes.ToolsFolder.Kala;
import Classes.ToolsFolder.Tools.Khandanha;
import Classes.ToolsFolder.Tools.NoeKala;

public class KesterlyRuckGhale extends Ghale {

	public int zarfiyateMadaneTala = 12000000;
	
	public KesterlyRuckGhale() {
		super("kesterly Ruck", "Gharbe Vestrus", Khandanha.Lenister);
	}
	
	public void bardashteTala(int number) {
		if((zarfiyateMadaneTala - number) > 0)
		{
			zarfiyateMadaneTala -= number;
			getAnbar().addKala(number, NoeKala.Tala);
		}
	}
	
	public ArrayList<Kala> sellTala(Lenister lenister, int number) {
		return lenister.sendKala(number, NoeKala.Tala);
	}

}
