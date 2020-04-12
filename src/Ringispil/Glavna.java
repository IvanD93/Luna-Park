package Ringispil;

public class Glavna {

	public static void main(String[] args) {


		Ringispil r1= new Ringispil(10);
		r1.dodajCoveka(new Covek("Mirko"));
		r1.dodajCoveka(new Covek("Pera", 500));
		Covek maja= new Covek("Maja",1000);
		r1.dodajCoveka(maja);
		r1.naplata();
//		Voznja v1 = new Voznja("Ringispil", 200, 5);
		
		System.out.println(maja.getNovac());
		
		System.out.println(r1);

	}

}
