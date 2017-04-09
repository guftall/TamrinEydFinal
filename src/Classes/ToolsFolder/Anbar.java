package Classes.ToolsFolder;

public class Anbar {

	private int tedadeKala;

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
