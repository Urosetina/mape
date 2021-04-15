package mapeVezba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
	Osoba osoba3 = new Osoba("Pcelica", "Maja", "24059877153");
	
	/*System.out.println("Ime osobe je: " + osoba.getIme());
	System.out.println("Prezime osobe2 je: " + osoba2.getPrezime());*/
		
		List<Osoba> listaOsoba = new ArrayList<Osoba>();
			listaOsoba.add(osoba);
			listaOsoba.add(osoba2);
		
			listaOsoba.get(0).getIme();
			
			
		 try {
			System.out.println(listaOsoba.get(3).getIme());
		 } catch(Exception e) {
			 e.printStackTrace();
			 System.out.println("E, nije ti dobar broj indexa!");}
		 
		 
		// mapa Stringova
		
		Map<String, String> mapaImena = new HashMap<String, String>(); //inicijalizacija mape
		
			mapaImena.put("a1", "Nenad");
			mapaImena.put("s2", "Pera");
			mapaImena.put("m3", "Maja");
		
		System.out.println("Ime osobe je: " + mapaImena.get("s2"));	
		
		// mapa koja na osnovu jmbga vraca celu osobu
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite jmbg: ");
		
			String trazeniJMBG = scanner.nextLine();
			
			Map<String, Osoba> mapaOsoba = new HashMap<String, Osoba>();
			
				mapaOsoba.put(osoba.getJmbg(), osoba);
				mapaOsoba.put(osoba2.getJmbg(), osoba2);
				mapaOsoba.put(osoba3.getJmbg(), osoba3);
				
			Osoba trazenaOsoba = mapaOsoba.get(trazeniJMBG);
			
				/*if(trazenaOsoba != null) { 
					
					System.out.println("Osoba: " + trazenaOsoba.getPrezime() + " " + trazenaOsoba.getIme());
					
				}else {System.out.println("Ne postoji taj kljuc!");}
				*/	
				try {System.out.println("Osoba: " + trazenaOsoba.getPrezime() + " " + trazenaOsoba.getIme());
				}catch (IndexOutOfBoundsException e){System.out.println("Ne postoji taj kljuc!");
				}catch (NullPointerException e) {System.out.println("Vodi racuna, null pointer..");
				}catch (Exception e) {System.out.println("Neki exception je...");}
				
			
			
		
		
	
	
	
		
		
		
		
		
		
		

	}

}
