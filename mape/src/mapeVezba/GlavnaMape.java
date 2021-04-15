package mapeVezba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Osoba;

public class GlavnaMape {

	public static void main(String[] args) {
	
		// pozdrav za git opet, treci put!
		
		
		/*String adresa = "Knez Mihajlova 5";
		
		char poslednjiKarakter = adresa.charAt(adresa.length()-1);
		boolean daLiJePoslednjiKarakterCifra = Character.isDigit(poslednjiKarakter);
		if(daLiJePoslednjiKarakterCifra) {System.out.println("Jeste cifra");
		}else {System.out.println("Nije cifra");}
		
	System.out.println("Heloooooooo");*/
		
	
	Osoba osoba = new Osoba();
	
	osoba.setIme("Nenad");
	osoba.setPrezime("Cvijanovic");
	osoba.setJmbg("0402987710234");
	
	Osoba osoba2 = new Osoba("Pera", "Zdera", "1204987710456");
	
	/*System.out.println("Ime osobe je: " + osoba.getIme());
	System.out.println("Prezime osobe2 je: " + osoba2.getPrezime());*/
		
		List<Osoba> listaOsoba = new ArrayList<Osoba>();
			listaOsoba.add(osoba);
			listaOsoba.add(osoba2);
		
			listaOsoba.get(0).getIme();
			
		System.out.println(listaOsoba.get(0).getIme());	
		
		Map<String, String> mapaImena = new HashMap<String, String>(); //inicijalizacija mape
		
			mapaImena.put("a1", "Nenad");
			mapaImena.put("s2", "Pera");
			mapaImena.put("m3", "Maja");
		
		System.out.println("Ime osobe je: " + mapaImena.get("s2"));	
		
		
	
	
	
		
		
		
		
		
		
		

	}

}
