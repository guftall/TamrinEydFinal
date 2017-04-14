package Classes.ToolsFolder;

import java.util.ArrayList;

public class KhandanPerson extends Person {
	

	private KhandanPerson father;
	private ArrayList<Heyvan> heyvans = new ArrayList<Heyvan>();
	
	

	public KhandanPerson(String name, String family, KhandanPerson father) {
		super(name, family);
		// TODO Auto-generated constructor stub
		setFather(father);
	}
	

	public KhandanPerson getFather() {
		return father;
	}

	public void setFather(KhandanPerson father) {
		this.father = father;
	}

	public ArrayList<Heyvan> getHeyvans() {
		return heyvans;
	}
	
	public void addHeyvan(Heyvan heyvan) {
		heyvans.add(heyvan);
	}

}
