import Classes.HousesFolder.KesterlyRuckGhale;
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
import Classes.ToolsFolder.Tools.Khandanha;
import Classes.ToolsFolder.Tools.NoeKala;
import Classes.ToolsFolder.Tools;

public class GamePlay {
	
	private static Stark stark;
	private static Targrin targrin;
	private static Lenister lenister;
	private static Batratheon batratheon;
	private static WhiteWalkers whiteWalkers;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stark = new Stark();
		targrin = new Targrin();
		lenister = new Lenister();
		batratheon = new Batratheon();
		whiteWalkers = new WhiteWalkers();
		
		//sendSarbaz(); // Sarbaz Misazad va mifrestad
		//sendTala();
		//animalWar();
		//addMotahed();
		//khandanhaWar();
		//warWithWhiteWalkers1();
		//warWithWhiteWalkers2();
		//warWithWhiteWalkers3();
		
	}
	
	public static void sendSarbaz() {
		stark.getGhale().getSarbazKhane().addSarbaz(100);
		targrin.getGhale().getSarbazKhane().addSarbaz(120);

		System.out.println("Stark's Soldier: "+ stark.getGhale().getSarbazKhane().getSarbazHaNumber());
		System.out.println("Targrin's Soldier: "+ targrin.getGhale().getSarbazKhane().getSarbazHaNumber());
		
		
		stark.sendSarbaz(110, targrin);
		

		System.out.println("\nStark's Soldier: "+ stark.getGhale().getSarbazKhane().getSarbazHaNumber());
		System.out.println("Targrin's Soldier: "+ targrin.getGhale().getSarbazKhane().getSarbazHaNumber());
		
	}

	public static void sendTala() {
		KesterlyRuckGhale kRuckGhale = lenister.getGhale();
		
		stark.getGhale().getAnbar().addKala(100, NoeKala.Chub);
		
		lenister.getGhale().getAnbar().addKala(120, NoeKala.Gandom);
		//lenister.getGhale().bardashteTala(75);
		
		System.out.println(stark.getGhale().getAnbar().getTedadeAllKala());
		System.out.println(lenister.getGhale().getAnbar().getTedadeAllKala() + "\n");
		
		stark.receiveKala(lenister.sendKala(50, NoeKala.Tala));

		System.out.println(stark.getGhale().getAnbar().getTedadeAllKala());
		System.out.println(lenister.getGhale().getAnbar().getTedadeAllKala());
	}

	public static void animalWar() {
		
		//for(int i=0; i<10; i++)
			//stark.getGhale().createGorg(new Gorg());
		
		Tools.JangeEjdehaVaGorg(targrin.getGhale().getEjdehas(), stark.getGhale().getGorgs());
	}

	public static void addMotahed() {
		
		for(Khandanha khandan : stark.getMotahedan()) {
			System.out.println(khandan);
		}
		
		stark.addMotahed(Khandanha.Lenister);
		
		System.out.println();
		for(Khandanha khandan : stark.getMotahedan()) {
			System.out.println(khandan);
		}
		
	}

	public static void khandanhaWar() {
		
		for(Khandanha khandan : lenister.getMotahedan()) {
			System.out.println(khandan);
		}
		System.out.println();
		
		lenister.getGhale().getAnbar().addKala(200, NoeKala.Nan);
		//lenister.getGhale().getSarbazKhane().addSarbaz(1500);
		
		batratheon.getGhale().getSarbazKhane().addSarbaz(1500);
		
		batratheon.startWarWith(lenister);

		System.out.println();
		for(Khandanha khandan : lenister.getMotahedan()) {
			System.out.println(khandan);
		}
		
	}

	public static void warWithWhiteWalkers1() {
		Khandan[] khandans = new Khandan[2];


		khandans[0] = batratheon;
		khandans[1] = targrin;
		
		targrin.getGhale().setUseEjdehas(false);
		//targrin.getGhale().setUseEjdehas(true);
		
		Tools.JangeKhandanHaBaWhiteWalkers(khandans, whiteWalkers);
		
	}
	
	public static void warWithWhiteWalkers2() {
		
		Khandan[] khandans = new Khandan[4];

		khandans[0] = stark;
		khandans[1] = batratheon;
		khandans[2] = targrin;
		khandans[3] = lenister;

		targrin.getGhale().setUseEjdehas(false);

		stark.getGhale().getSarbazKhane().addSarbaz(100);
		for(int i=0; i<120; i++)
			stark.createGorg();
		
		batratheon.getGhale().getSarbazKhane().addSarbaz(250);
		lenister.getGhale().getSarbazKhane().addSarbaz(420);
		
		Tools.JangeKhandanHaBaWhiteWalkers(khandans, whiteWalkers);
		
	}

	public static void warWithWhiteWalkers3() {
		Khandan[] khandans = new Khandan[4];

		khandans[0] = stark;
		khandans[1] = batratheon;
		khandans[2] = targrin;
		khandans[3] = lenister;
		
		whiteWalkers.addWhiteWalker(80);

		stark.getGhale().getSarbazKhane().addSarbaz(100);
		stark.getGhale().addShamshirValriyai(75);
		for(int i=0; i<100; i++)
			stark.createGorg();
		
		
		
		batratheon.getGhale().getSarbazKhane().addSarbaz(250);
		lenister.getGhale().getSarbazKhane().addSarbaz(420);
		
		//targrin.getGhale().setUseEjdehas(true);
		
		Tools.JangeKhandanHaBaWhiteWalkers(khandans, whiteWalkers);
		
		
		
	}


}
