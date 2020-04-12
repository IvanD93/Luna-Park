package Ringispil;

public class Voznja {

	/*
	 * Voznja poseduje naziv(g/s), cenu(g/s) i niz ljudi koji sede u njoj. Ljudi
	 * mogu da se dodaju ili uklone sa voznje. Kreira se sa zadatim brojem sedista.
	 * Voznja moze da se naplati.
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
	private int cena;
	private Covek[] nizLjudi;
	private int brojSedista;

	public Voznja(String naziv, int cena, int brojSedista) {
		this.naziv = naziv;
		this.cena = cena;
		nizLjudi = new Covek[brojSedista];
	}

	public boolean dodajCoveka(Covek c) {
		for (int i = 0; i < nizLjudi.length; i++) {
			if (nizLjudi[i] == null) {

				nizLjudi[i] = c;
				return true;
			}
		}
		return false;
	}

	public void naplata() {
		for (int i = 0; i < nizLjudi.length; i++) {
			if (nizLjudi[i] != null) {
				if (nizLjudi[i].oduzmiNovac(cena) == false) {
					nizLjudi[i] = null;
				}
			}
		}
	}

	public boolean ukloniCoveka(Covek c) {
		for (int i = 0; i < nizLjudi.length; i++) {
			if (nizLjudi[i] == c) {
				nizLjudi[i] = null;
				return true;
			}
		}
		return false;
	}


}
