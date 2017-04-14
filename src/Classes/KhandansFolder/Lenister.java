package Classes.KhandansFolder;

import Classes.HousesFolder.Ghale;
import Classes.HousesFolder.KesterlyRuckGhale;
import Classes.HousesFolder.WinterFellGhale;
import Classes.ToolsFolder.KhandanPerson;
import Classes.ToolsFolder.Tools;

public class Lenister extends Khandan {
	
	public Lenister() {
		this(new KhandanPerson("Lord TauYen", "Lenister"), new KhandanPerson("Juana", "Lenister"),
								"Ghoresh Mara Beshnow", "Shir", 5000);
		
		setGhale(new KesterlyRuckGhale());
		ghale.increaseJamiyat(5 + ghale.getSarbazKhane().getSarbazHaNumber());
	}

	private Lenister(KhandanPerson father, KhandanPerson mother, String shoar, String nemad, int ghedmat) {
		super(father, mother, shoar, nemad, ghedmat);

	}
	
	public KesterlyRuckGhale getGhale() {
		return (KesterlyRuckGhale) ghale;
	}

	@Override
	protected void setGhale(Ghale ghale) {
			this.ghale = ghale;
		
	}

	@Override
	public void reveiveSarbaz(int number) {

		
	}

	@Override
	protected void setChildrens() {
		// TODO Auto-generated method stub
		khandanChildren.add(new KhandanPerson("Sersi", "Lenister"));
		khandanChildren.add(new KhandanPerson("TauYen", "Lenister"));
		khandanChildren.add(new KhandanPerson("Jimy", "Lenister"));
	}

}
