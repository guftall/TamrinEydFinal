package Classes.KhandansFolder;

import java.util.ArrayList;

import Classes.HousesFolder.Ghale;
import Classes.HousesFolder.MirinGhale;
import Classes.ToolsFolder.Heyvan;
import Classes.ToolsFolder.KhandanPerson;
import Classes.ToolsFolder.Tools;

public class Targrin extends Khandan {

	
	public Targrin() {
		this(new KhandanPerson("Aeris", "Targrin", null), new KhandanPerson("Raela", "Targrin", null),
								"Khun va Atash", "Ejdehaye Se SAare Ghermez", 500);
		setChildrens();
		setGhale(new MirinGhale());
		khandanChildren.get(3).addHeyvan(getGhale().getEjdehas().get(0));
		khandanChildren.get(3).addHeyvan(getGhale().getEjdehas().get(1));
		khandanChildren.get(3).addHeyvan(getGhale().getEjdehas().get(2));
		
		ghale.increaseJamiyat(6 + ghale.getSarbazKhane().getSarbazHaNumber());
	}
	
	private Targrin(KhandanPerson father, KhandanPerson mother, String shoar, String nemad, int ghedmat) {
		super(father, mother, shoar, nemad, ghedmat);
		// TODO Auto-generated constructor stub
		
	}

	
	public MirinGhale getGhale() {
		return (MirinGhale) ghale;
	}

	@Override
	protected void setGhale(Ghale ghale) {
		// TODO Auto-generated method stub
		this.ghale = ghale;
	}


	@Override
	public void reveiveSarbaz(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void setChildrens() {
		// TODO Auto-generated method stub
		khandanChildren.add(new KhandanPerson("Rigar", "Targrin", getKhandanFather()));
		khandanChildren.add(new KhandanPerson("Eliya", "Targrin", getKhandanFather()));
		khandanChildren.add(new KhandanPerson("Visris", "Targrin", getKhandanFather()));
		khandanChildren.add(new KhandanPerson("Denris", "Targrin", getKhandanFather()));
	}
	
	@Override
	public void startWarWith(Khandan khandan) {
		MirinGhale mGhale = (MirinGhale) ghale;
		if(mGhale.isUseEjdehas()) {
			// war with victory
		}
		else {
			
		}
	}
}
