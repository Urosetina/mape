package model;

public class Osoba {
	
	
	private String ime;
	private String prezime;
	private String jmbg;
	
	public Osoba() {}
	
	public Osoba(String ime, String prezime, String jmbg) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}

	
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	
	
	
	
	
	
	
	
	
	

}
