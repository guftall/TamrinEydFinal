package Classes.ToolsFolder;

import Classes.ToolsFolder.Tools.Vazife;

public class Soldier extends Person {
	
	private Vazife vazife;

	public Vazife getVazife() {
		return vazife;
	}

	public void setVazife(Vazife vazife) {
		this.vazife = vazife;
	}

	public Soldier() {
		this("no nam", "no fAmily");
	}
	
	public Soldier(String name, String family) {
		super(name, family);
		// TODO Auto-generated constructor stub
	}
	
	public Soldier(Vazife vazife) {
		this();
		setVazife(vazife);
	}

}
