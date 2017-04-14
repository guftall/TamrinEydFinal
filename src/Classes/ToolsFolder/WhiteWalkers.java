package Classes.ToolsFolder;

import java.util.ArrayList;

public class WhiteWalkers {

	private int ghedmat = 8000;
	private String detailsOfWhiteWalkers;
	
	private ArrayList<WhiteWalker> whiteWalkers = new ArrayList<WhiteWalker>();
	
	private final String location;
	private final String king;
	
	public WhiteWalkers() {
		
		detailsOfWhiteWalkers = "tavasote Farzandane Jangal sakhte shode and.\n";
		detailsOfWhiteWalkers+= "baraye mohafezat az farzandane jangal dar moghabele ensanha.\n";
		detailsOfWhiteWalkers+= "be vasileye jaduye siyah sakhte shode and.\n";
		detailsOfWhiteWalkers+= "Faghat be vasileye shishe ejdeha ya steel vaLriyai mimirand.";
		
		
		
		location = "Vestrus - Sarzamine Yakh zade";
		king = "Padeshahe Shab";
	}
	
	public String getLocation() {
		return location.toString();
	}
	
	public String getKing() {
		return king.toString();
	}
	
	public void addWhiteWalker(int number) {
		for(int i=0; i<number; i++) {
			
			whiteWalkers.add(new WhiteWalker());
		}
	}
	
	public String getDetails() {
		return detailsOfWhiteWalkers.toString();
	}
	
}
