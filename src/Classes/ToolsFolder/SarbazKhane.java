package Classes.ToolsFolder;

import java.util.ArrayList;
import java.util.Random;

import Classes.ToolsFolder.Tools.Vazife;

public class SarbazKhane {
	
	private ArrayList<Soldier> sarbazHa = new ArrayList<Soldier>();
	
	public SarbazKhane() {
		addSarbaz();
	}
	
	public void addSarbaz(Vazife vazife) {
		Random random = new Random();
		addSarbaz(random.nextInt(2300), vazife);
	}
	
	public void addSarbaz(int number, Vazife vazife) {
		for(int i=0; i<number; i++)
			sarbazHa.add(new Soldier(vazife));
	}
	
	public void addSarbaz(int number) {
		for(int i=0; i<number; i++)
		sarbazHa.add(new Soldier());
	}
	
	public void addSarbaz() {
		Random random = new Random();
		addSarbaz(random.nextInt(7000));
	}
	
	public Soldier getSarbaz(int index) {
		return sarbazHa.get(index);
	}
	
	public int getSarbazHaNumber() {
		return sarbazHa.size();
	}
	
	public int getSarbazHayeValriyaiDarNumber() {
		int res = 0;
		for(int i=0; i<sarbazHa.size(); i++) {
			if(sarbazHa.get(i).haveShamshirValriyai)
				++res;
		}
		return res;
	}
	
	public void removeSarbaz() {
		Random random = new Random();
		int i;
		while(true) {
			if((i= random.nextInt(2400)) < sarbazHa.size()) {
				removeSarbaz(i);
				break;
			}
		}
	}
	
	public void removeSarbaz(int number) {
		if(number < sarbazHa.size()){
			for(int i=0; i<number; i++) {
				sarbazHa.remove(i);
			}
		}
	}
	
	
	/*		Explain		*/
	public void removeSarbaz(int number, Vazife vazife) {
		for(int i=0; i<sarbazHa.size(); i++) {
			if(sarbazHa.get(i).getVazife() == vazife) {
				sarbazHa.remove(i);
				--number;
			}
			if(number == 0)
				break;
		}
	}

	public void removeSarbaz(Vazife vazife) {
		Random random = new  Random();
		removeSarbaz(random.nextInt(2000), vazife);
	}
}
