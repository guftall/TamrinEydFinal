package Classes.HousesFolder;

import java.util.ArrayList;

import Classes.ToolsFolder.Anbar;
import Classes.ToolsFolder.Asb;
import Classes.ToolsFolder.SarbazKhane;
import Classes.ToolsFolder.Tools.Khandanha;
import Classes.ToolsFolder.Tools.VaziyateGhale;

public class Ghale {
	
	private SarbazKhane sarbazKhane;
	private Anbar anbar;
	public ArrayList<Asb> asbs = new ArrayList<Asb>();
	
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
	

	
	public void addAsb(int number) {
		for(int i=0; i<number; i++)
			asbs.add(new Asb());
	}
	
	public void removeAsb(int number) {
			
		int bAsb = asbs.size() - number;
		while(asbs.size() > bAsb)
			asbs.remove(0);
	}
	
	public void addShamshirValriyai(int number) {
		if(number <= sarbazKhane.getSarbazHaNumber())
		{
			for(int i=0; i<number; i++) {
				sarbazKhane.getSarbaz(i).haveShamshirValriyai = true;
			}
		}
		else {
			for(int i=0; i<sarbazKhane.getSarbazHaNumber(); i++)
				sarbazKhane.getSarbaz(i).haveShamshirValriyai = true;
		}
	}

}
