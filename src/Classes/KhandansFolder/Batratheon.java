package Classes.KhandansFolder;

import Classes.HousesFolder.Ghale;
import Classes.HousesFolder.StormAndGhale;
import Classes.ToolsFolder.KhandanPerson;
import Classes.ToolsFolder.Tools;

public class Batratheon extends Khandan {
	
	public Batratheon() {
		this(new KhandanPerson("Robert", "Baratheon", null),
			new KhandanPerson("Sersi", "Lenister",new KhandanPerson("Lord TauYen", "Lenister", null)),
							"Khashm Az Ane Mast", "Gavazn", 300);

		setGhale(new StormAndGhale());
		ghale.increaseJamiyat(5 + ghale.getSarbazKhane().getSarbazHaNumber());
	}

	public Batratheon(KhandanPerson father, KhandanPerson mother, String shoar, String nemad, int ghedmat) {
		super(father, mother, shoar, nemad, ghedmat);

	}
	
	public StormAndGhale getGhale() {
		return (StormAndGhale) ghale;
	}

	@Override
	protected void setGhale(Ghale ghale) {
		// TODO Auto-generated method stub
		this.ghale = ghale;
	}
	
	

	@Override
	public void reveiveSarbaz(int number) {
		// TODO Auto-generated method stub
		ghale.getSarbazKhane().addSarbaz(number);
	}

	@Override
	protected void setChildrens() {
		// TODO Auto-generated method stub
		khandanChildren.add(new KhandanPerson("Jefri", "Baratheon", getKhandanFather()));
		khandanChildren.add(new KhandanPerson("Mirsela", "Baratheon", getKhandanFather()));
		khandanChildren.add(new KhandanPerson("Tomen", "Baratheon", getKhandanFather()));
	}



}
