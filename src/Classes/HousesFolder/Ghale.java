package Classes.HousesFolder;

import Classes.ToolsFolder.Anbar;
import Classes.ToolsFolder.SarbazKhane;
import Classes.ToolsFolder.Tools.Khandanha;
import Classes.ToolsFolder.Tools.VaziyateGhale;

public class Ghale {
	
	private SarbazKhane sarbazKhane;
	private Anbar anbar;
	
	public final String name;
	public final String location;
	public final Khandanha khandan;
	
	private VaziyateGhale vaziyat;
	public int tedadeJamiyateKol;
	
	
	public Ghale(String name, String location, Khandanha khandan) {
		this.name = name;
		this.location = location;
		this.khandan = khandan;
		
		sarbazKhane = new SarbazKhane();
		anbar = new Anbar();
		setVaziyat(VaziyateGhale.Azad);
	}

	public void increaseJamiyat(int number) {
		tedadeJamiyateKol += number;
	}
	public void decreaseJamiyat(int number) {
		tedadeJamiyateKol -= number;
	}

	public SarbazKhane getSarbazKhane() {
		return sarbazKhane;
	}

	public Anbar getAnbar() {
		return anbar;
	}

	public VaziyateGhale getVaziyat() {
		return vaziyat;
	}

	public void setVaziyat(VaziyateGhale vaziyat) {
		this.vaziyat = vaziyat;
	}

}
