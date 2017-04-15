package Classes.ToolsFolder;

import java.util.ArrayList;

import Classes.HousesFolder.MirinGhale;
import Classes.HousesFolder.WinterFellGhale;
import Classes.KhandansFolder.Khandan;

public class Tools {
	

	public static void JangeKhandanHaBaWhiteWalkers(Khandan[] khandans, WhiteWalkers whiteWalkers) {
		
		int deadWWalkers = 0;
		int koleSarbazHayeValriyaiDar = 0;
		System.out.println("War details:");
		
		for(int i=0; i<khandans.length; i++) {
			int j = getShamshirHayeWalriyai(khandans[i]);
			koleSarbazHayeValriyaiDar += khandans[i].getGhale().getSarbazKhane().getSarbazHayeValriyaiDarNumber();
			System.out.println(khandans[i]+ " Have "+ khandans[i].getGhale().getSarbazKhane().getSarbazHaNumber() + " Soldier And "+ j+ " shamshire Valriyai!");
			deadWWalkers += j;
		}
		System.out.println("\nWhiteWalkers have "+ whiteWalkers.getWhiteWalkersNumber()+ " whiteWalker.");
		System.out.println("And "+ whiteWalkers.getAnkabutsNumber()+ " Ankabut");
		
		
		String deadWWalkersRes =  whiteWalkers.removeWhiteWalker(deadWWalkers);
		System.out.println("\n" +deadWWalkersRes + " WhiteWalker Killed.\n");
		
		
		// jange heyvanat
		int gorgs = 0;
		int ejdehas = 0;
		
		int deadAnkabuts = 0;

		for(Khandan khandan : khandans) {
			if(khandan.getGhale() instanceof WinterFellGhale) {
				
				WinterFellGhale wFellGhale = (WinterFellGhale)khandan.getGhale();
				gorgs = wFellGhale.getGorgs().size();
				int deadGorgs = (whiteWalkers.getAnkabutsNumber()/5);
				int zakhmiGorgs = deadGorgs * 2;

				if(deadGorgs <= wFellGhale.getGorgs().size()) {
					for(int i=0; i<deadGorgs; i++) {
						wFellGhale.getGorgs().remove(0);
					}
					
					if(zakhmiGorgs < wFellGhale.getGorgs().size()) {
						for(int i=0; i<zakhmiGorgs; i++) {
							wFellGhale.getGorgs().get(i).ghodrat -= 25;
							if(wFellGhale.getGorgs().get(i).ghodrat < 0)
								wFellGhale.getGorgs().get(i).ghodrat = 0;
						}
					}
					else {
						for(int i=0; i<wFellGhale.getGorgs().size(); i++) {
							wFellGhale.getGorgs().get(i).ghodrat -= 25;
							if(wFellGhale.getGorgs().get(i).ghodrat < 0)
								wFellGhale.getGorgs().get(i).ghodrat = 0;
							
						}
					}
					
				}else {
					while(wFellGhale.getGorgs().size() > 0)
						wFellGhale.getGorgs().remove(0);
				}
				System.out.println(wFellGhale.getGorgs().size()+ " Gorg of "+gorgs+ "  baghi Mand.");
				System.out.println(zakhmiGorgs+ " Gorg Zakhmi Shod");
				
				deadAnkabuts += gorgs / 2;
				whiteWalkers.removeAnkabut(deadAnkabuts);
				deadAnkabuts = 0;
			}
			if(khandan.getGhale() instanceof MirinGhale) {
				
				
				MirinGhale mGhale = (MirinGhale)khandan.getGhale();
				if(mGhale.isUseEjdehas()) {
					ejdehas = mGhale.getEjdehas().size();
					whiteWalkers.removeAnkabut(30);

					for(int i=0; i<whiteWalkers.getAnkabutsNumber()/10; i++) {
						for(int j=0; j<3; j++) {
							if(mGhale.getEjdehas().get(j).ghodrat > 50) {
								mGhale.getEjdehas().get(j).ghodrat -= 35;
								break;
							}
						}
						if(mGhale.getEjdehas().get(0).ghodrat<50 && mGhale.getEjdehas().get(1).ghodrat < 50 &&
								mGhale.getEjdehas().get(2).ghodrat < 50) {
							mGhale.setUseEjdehas(false);
						}
					}
					
					if(!mGhale.isUseEjdehas()) {
						System.out.println("Ejdehas Farar Kardand.");
					}
					else {
						System.out.println("Ejdehas farar NAKARDAND!\n");
					}
					
					
				}
				else {
					System.out.println("Targrin did not use Ejdehas in War.");
				}
				
			}
		}
		System.out.println(whiteWalkers.getAnkabutsNumber()+ " Ankabut Baghi mand.");
		
		
		if(whiteWalkers.getWhiteWalkersNumber() > 0) {
			int changedSarbazs = 0;
			
			for(int i=0; i<khandans.length; i++) {
				
				int khandanSarbazValriyaiha = khandans[i].getGhale().getSarbazKhane().getSarbazHayeValriyaiDarNumber();
				int changedSarbazsofthisKhandan =( khandans[i].getGhale().getSarbazKhane().getSarbazHaNumber() - khandanSarbazValriyaiha) / 2 ;
				khandans[i].getGhale().getSarbazKhane().removeSarbazValriyaiNaDar(changedSarbazsofthisKhandan);
				whiteWalkers.addWhiteWalker(changedSarbazsofthisKhandan);
				changedSarbazs += changedSarbazsofthisKhandan;
			}
			
			System.out.println(changedSarbazs + " Soldier Changed to WhiteWalker\n\n");
			
			
			

			for(int i=0; i<khandans.length; i++) {
				System.out.println(khandans[i]+ " Have "+ khandans[i].getGhale().getSarbazKhane().getSarbazHaNumber()+ " Soldier" );
				
			}
			
			
			
		}
		else {
			
		}
		
		
	}
	
	private static int getShamshirHayeWalriyai(Khandan khandan) {
		int res = 0;
		int sNumber = khandan.getGhale().getSarbazKhane().getSarbazHaNumber();
		for(int i=0; i<sNumber; i++) {
			if(khandan.getGhale().getSarbazKhane().getSarbaz(i).haveShamshirValriyai) {
				++res;
			}
		}
		return res;
	}
	
	
	
	
	
	
	
	
	
	public static void JangeEjdehaVaGorg(ArrayList<Ejdeha> ejdehas, ArrayList<Gorg> gorgs) {
		
		System.out.println("War details:");
		
		int gGhodrat = 0;
		for (Gorg gorg : gorgs) {
			gGhodrat += gorg.ghodrat;
		}
		
		int eGhodrat = 0;
		for(Ejdeha ejdeha : ejdehas) {
			eGhodrat += ejdeha.ghodrat;
		}
		if(gorgs.size() == 0) {
			System.out.println("Can not continue war, gorgs.Size() returned 0!");
			return;
		}
		

		System.out.println(gorgs.size()+ " Gorgs with total Power "+ gGhodrat);
		System.out.println(ejdehas.size()+ " Ejdehas with total Power "+ eGhodrat + "\n\n");
		
		if(eGhodrat > gGhodrat) {
			
			int deadHeyvans = eGhodrat / gGhodrat;
			if(gorgs.size() > deadHeyvans) {
				int gorgBaghimande = gorgs.size() - deadHeyvans;
				while(gorgs.size() > gorgBaghimande) {
					gorgs.remove(0);
				}
			if(gorgs.size() > 0) {
				for (Ejdeha ejdeha : ejdehas) {
					ejdeha.ghodrat -= 100;
					if(ejdeha.ghodrat < 0)
						ejdeha.ghodrat = 0;
				}
			}
			else {
				for (Ejdeha ejdeha : ejdehas) {
				ejdeha.ghodrat -= 50;
				if(ejdeha.ghodrat < 0)
					ejdeha.ghodrat = 0;
			}
			}
			}else {
				while(gorgs.size() > 0) {
					gorgs.remove(0);
				}
				
				for (Ejdeha ejdeha : ejdehas) {
					ejdeha.ghodrat -= 50;
					if(ejdeha.ghodrat < 0)
						ejdeha.ghodrat = 0;
				}
			}
			gGhodrat = 0;
			for (Gorg gorg : gorgs) {
				gGhodrat += gorg.ghodrat;
			}
			eGhodrat = 0;
			for(Ejdeha ejdeha : ejdehas) {
				eGhodrat += ejdeha.ghodrat;
			}

			System.out.println(gorgs.size()+ " Gorgs Baghi mand with total Power "+ gGhodrat);
			System.out.println(ejdehas.size()+ " Ejdehas Baghi mand with total Power "+ eGhodrat);
			
			
		}
		else if(eGhodrat < gGhodrat) {
			
			int deadHeyvans = gGhodrat / eGhodrat;
			if(deadHeyvans > ejdehas.size()) {
				for (Ejdeha ejdeha : ejdehas) {
					ejdeha.ghodrat -= 250;
					if(ejdeha.ghodrat < 0)
						ejdeha.ghodrat = 0;
				}
			}else {
				for(int i=0; i<deadHeyvans; i++) {
					ejdehas.get(i).ghodrat -= 150;
					if(ejdehas.get(i).ghodrat < 0)
						ejdehas.get(i).ghodrat = 0;
				}
				for(Gorg gorg : gorgs) {
					gorg.ghodrat -= 15;
					if(gorg.ghodrat < 0)
						gorg.ghodrat = 0;
				}
			}
		}
		else {
			
		}
		
		
	}

	public enum Khandanha {
		Stark,
		Lenister,
		Batratheon,
		Targrin,
		Arian,
		Tali,
		Feri,
		Tirel
	}
	
	public enum Vazife{
		Negahbani,
		NeyzeDar,
		AsbSavar,
		Kamandar
	}
	
	public enum NoeKala{
		Gandom,
		Nan,
		Shamshir,
		Neyze,
		Sang,
		Chub,
		Tala
	}
	
	public enum VaziyateGhale{
		Azad,
		TasarofShode,
		DarHaleJang
	}

}
