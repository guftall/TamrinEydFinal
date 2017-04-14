package Classes.ToolsFolder;

import Classes.ToolsFolder.Tools.NoeKala;

public class Kala {

	private NoeKala noeKala;
	
	public Kala() {
		this(NoeKala.Gandom);
	}
	
	public Kala(NoeKala noeKala) {
		this.noeKala = noeKala;
	}
	
	public NoeKala getNoeKala() {
		return noeKala;
	}
	
}
