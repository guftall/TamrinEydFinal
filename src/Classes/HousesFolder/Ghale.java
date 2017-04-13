package Classes.HousesFolder;

import Classes.ToolsFolder.Anbar;
import Classes.ToolsFolder.SarbazKhane;
import Classes.ToolsFolder.Tools.Khandanha;

public class Ghale {
	
	private SarbazKhane sarbazKhane;
	private Anbar anbar;
	
	public final String name;
	public final String location;
	public final Khandanha khandan;
	
	
	
	public Ghale(String name, String location, Khandanha khandan) {
		this.name = name;
		this.location = location;
		this.khandan = khandan;
		
		sarbazKhane = new SarbazKhane();
	}

	public SarbazKhane getSarbazKhane() {
		return sarbazKhane;
	}

	public Anbar getAnbar() {
		return anbar;
	}

	public void setAnbar(Anbar anbar) {
		this.anbar = anbar;
	}

}
