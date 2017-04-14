package Classes.ToolsFolder;

import java.util.ArrayList;

public class WhiteWalkers {

	private int ghedmat = 8000;
	private String detailsOfWhiteWalkers;

	private ArrayList<WhiteWalker> whiteWalkers = new ArrayList<WhiteWalker>();
	private ArrayList<Ankabut> ankabuts = new ArrayList<Ankabut>();
	
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
			ankabuts.add(new Ankabut());
			whiteWalkers.add(new WhiteWalker());
		}
	}
	
	public String removeWhiteWalker(int number) {
		String res = "";
		if(number < whiteWalkers.size()) {
			int bWWalker = whiteWalkers.size() - number;
			while(whiteWalkers.size() > bWWalker) {
				whiteWalkers.remove(0);
			}
			res = new StringBuilder().append(number).toString();
		}
		else {
			res = "All(" + new StringBuilder().append(whiteWalkers.size()).toString() + ")";
			while(whiteWalkers.size() > 0) {
				whiteWalkers.remove(0);
			}
		}
		return res;
	}
	
	public String getDetails() {
		return detailsOfWhiteWalkers.toString();
	}
	
	public int getWhiteWalkersNumber() {
		return whiteWalkers.size();
	}
	
	private void addAnkabut(int number) {
		for(int i=0; i<number; i++)
			ankabuts.add(new Ankabut());
	}
	
	public void removeAnkabut(int number) {
		int bAn = ankabuts.size()  - number;
		if(bAn > 0)
		while(ankabuts.size() > bAn) {
			ankabuts.remove(0);
		}
		else
			while(ankabuts.size() >0)
				ankabuts.remove(0);
	}
	
	public int getAnkabutsNumber() {
		return ankabuts.size();
	}
}
