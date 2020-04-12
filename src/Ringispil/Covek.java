package Ringispil;

public class Covek {

	/*
	 * Voznja poseduje naziv(g/s), cenu(g/s) i niz ljudi koji sede u njojLjudi mogu
	 * da se dodaju ili uklone sa voznje. Kreira se sa zadatimbrojem sedista. Voznja
	 * moze da se naplati.
	 */

	/*
	 * Ringispil je voznja koja poseduje 5 sedista za ljude i trajanje voznje.Cena
	 * ringispila je 200din
	 */

	/*
	 * Covek poseduje naziv i novac(d,o/get).Naziv se postavlja prilikom kreiranja
	 * coveka i moze da se dohvati.Novac moze da se doda i oduzme.
	 */

	private String naziv;
	private int novac;

	public Covek(String naziv) {
		this.naziv = naziv;
		novac = 0; // ovo ni ne moramo da navodimo, jer je int po difoltu nula
	}
	
	public Covek(String naziv, int novac) {
		this.naziv = naziv;
		this.novac = novac;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getNovac() {
		return novac;
	}

	public void dodajNovac(int iznos) {
		if (iznos > 0)
			this.novac += iznos;
	}

	public boolean oduzmiNovac(int iznos) {
		if (iznos >0 && iznos <= this.novac) {
			this.novac -= iznos;
			return true;
		}
		return false;
	}

	
	public String toString() {
		return "Covek [naziv=" + naziv + ", novac=" + novac + "]";
	}
	
	
}
