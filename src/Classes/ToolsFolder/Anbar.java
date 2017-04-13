package Classes.ToolsFolder;

import java.util.Random;

public class Anbar {

	private int tedadeKala;
	
	public Anbar() {
		
		Random random = new Random();
		
		setTedadeKala(random.nextInt(2300));
	}

	public int getTedadeKala() {
		return tedadeKala;
	}

	public void setTedadeKala(int tedadeKala) {
		this.tedadeKala = tedadeKala;
	}
	
	public void addKala(int number) {
		for(int i=0; i<number; i++) {
			++tedadeKala;
		}
	}
	
	public void removeKala(int number) {
		for(int i=0; i<number; i++)
			--tedadeKala;
	}
	
	public void removeAllKala() {
		tedadeKala = 0;
	}
}
