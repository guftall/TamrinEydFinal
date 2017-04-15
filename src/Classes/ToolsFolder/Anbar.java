package Classes.ToolsFolder;

import java.util.ArrayList;
import java.util.Random;

import Classes.ToolsFolder.Tools.NoeKala;

public class Anbar {


	private ArrayList<Kala> kalas = new ArrayList<Kala>();
	
 	public Anbar() {
		
		Random random = new Random();
		
		//addKala(random.nextInt(2300), NoeKala.Gandom);
	}

 	public int getTedadeAllKala() {
 		return kalas.size();
 	}
 	
	public int getTedadeKala(NoeKala noeKala) {
		int res = 0;
		for(int i=0; i<kalas.size(); i++) {
			if(kalas.get(i).getNoeKala() == noeKala)
				++res;
		}
		return res;
	}
	
	public Kala getKala(NoeKala noeKala) {
		kalas.remove(noeKala);
		return new Kala(noeKala);
	}

	public void addKala(Kala kala) {
		kalas.add(kala);
	}
	
	public void addKala(int number, NoeKala noeKala) {
		for(int i=0; i<number; i++) {
			kalas.add(new Kala(noeKala));
		}
	}
	
	public void removeKala(int number) {
		for(int i=0; i<number; i++)
			kalas.remove(i);
	}
	
	public void removeAllKala() {
		while(kalas.size() != 0)
		kalas.remove(0);
	}
	
	public ArrayList<Kala> getAllKala(){
		return kalas;
	}
}
