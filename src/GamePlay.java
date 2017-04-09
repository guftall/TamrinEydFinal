import Classes.HousesFolder.WinterFellGhale;
import Classes.KhandansFolder.Stark;
import Classes.ToolsFolder.Gorg;
import Classes.ToolsFolder.KhandanPerson;

public class GamePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stark stark = new Stark(new KhandanPerson("", ""), new KhandanPerson("", ""), "", "", 100);
		
		if(stark.heyvans.size() == 0)
			stark.heyvans.add(new Gorg());
		
		stark.heyvans.get(0).move();
		
	}

}
