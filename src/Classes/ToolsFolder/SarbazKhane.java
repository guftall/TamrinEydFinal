package Classes.ToolsFolder;

import java.util.Random;

public class SarbazKhane {
	
	private int sarbazHa;
	
	public SarbazKhane() {
		addSarbaz();
	}
	
	public void addSarbaz(int number) {
		sarbazHa += number;
	}
	
	public void addSarbaz() {
		Random random = new Random();
		sarbazHa += random.nextInt(7000);
	}
	
	public int getSarbazHaNumber() {
		return sarbazHa;
	}
	

}
