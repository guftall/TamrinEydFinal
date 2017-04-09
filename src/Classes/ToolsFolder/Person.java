package Classes.ToolsFolder;

public class Person {
	
	private String name;
	private String family;
	private int sen;

	public Person(String name, String family) {
		this.name = name;
		this.family= family;
	}

	public int getSen() {
		return sen;
	}

	public void setSen(int sen) {
		this.sen = sen;
	}
}
