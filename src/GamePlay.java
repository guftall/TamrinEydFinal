import Classes.HousesFolder.MirinGhale;
import Classes.HousesFolder.WinterFellGhale;
import Classes.KhandansFolder.Batratheon;
import Classes.KhandansFolder.Khandan;
import Classes.KhandansFolder.Lenister;
import Classes.KhandansFolder.Stark;
import Classes.KhandansFolder.Targrin;
import Classes.ToolsFolder.Ejdeha;
import Classes.ToolsFolder.Gorg;
import Classes.ToolsFolder.KhandanPerson;
import Classes.ToolsFolder.WhiteWalkers;
import Classes.ToolsFolder.Tools;

public class GamePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhiteWalkers whiteWalkers = new WhiteWalkers();
		Tools tools = new Tools();
		Stark stark = new Stark();
		Lenister lenister = new Lenister();
		Targrin targrin = new Targrin();
		Batratheon batratheon = new Batratheon();
		
		Khandan[] khandans = new Khandan[4];
		khandans[0] = stark;
		khandans[1] = lenister;
		khandans[2] = targrin;
		khandans[3] = batratheon;
		
		
		
		
		for(int i=0; i<90; i++)
			stark.createGorg();
		
		whiteWalkers.addWhiteWalker(300);
		
		MirinGhale mGhale = (MirinGhale)
		targrin.getGhale();
		mGhale.setUseEjdehas(true);

		stark.getGhale().addShamshirValriyai(999999);
		lenister.getGhale().addShamshirValriyai(889888);
		targrin.getGhale().addShamshirValriyai(2233);
		batratheon.getGhale().addShamshirValriyai(1111);
		
		
		Tools.JangeKhandanHaBaWhiteWalkers(khandans, whiteWalkers);
		
	}

}
