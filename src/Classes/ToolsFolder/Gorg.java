package Classes.ToolsFolder;

public class Gorg extends Heyvan {

	
	private KhandanPerson manMaleKiAm;
	
	public Gorg() {
		
	}
	
	public Gorg(KhandanPerson manMaleKiAm) {
		this.manMaleKiAm = manMaleKiAm;
	}

	public void ghoRRRRResh() {
		System.out.println("Ghoresh Kardam");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Davidan");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Voooo Gazesh Bigirammmmm");
	}

	public KhandanPerson getManMaleKiAm() {
		return manMaleKiAm;
	}

	public void setManMaleKiAm(KhandanPerson manMaleKiAm) {
		this.manMaleKiAm = manMaleKiAm;
	}
}
