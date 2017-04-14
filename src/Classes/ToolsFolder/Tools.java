package Classes.ToolsFolder;

import java.util.ArrayList;

public class Tools {
	
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
		Targrin
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
		Chub
	}
	
	public enum VaziyateGhale{
		Azad,
		TasarofShode,
		DarHaleJang
	}

}
