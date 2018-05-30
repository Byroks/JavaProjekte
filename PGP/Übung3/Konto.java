

public class Konto {
	double kontoStand ;
	private static Konto honey;
	
	
	public Konto (double anfangsBetrag ) {
		this.kontoStand=anfangsBetrag;
	}
	
	
	double getKontoStand() {
		return kontoStand;
	}

	
	void einzahlen(double x){
		this.kontoStand+=x;
		
	}
	
	void abheben(double x ){
		this.kontoStand-=x;
	}
	
	void ueberweisenAuf ( Konto ziel, double betrag){
		ziel.kontoStand= ziel.kontoStand+betrag;
		this.kontoStand= this.kontoStand-betrag;

	}
	
	public String toString() {
		return "der Kontostand ist: "+ this.kontoStand;
	}
	
//MAIN MAIN	
	
	public static void main(String[] args) {
	
		Konto jana = new Konto(40.0);
		GiroKonto tim = new GiroKonto(50.0,10.0);
		tim.ueberweisenAuf(jana, 10);
		System.out.println(jana.toString());
		System.out.println(tim.toString());
		
	}

	}

class SparKonto extends Konto {
	double zinsSatz;
	
	
	public SparKonto(double anfangsBetrag, double zinsSatz) {
		super(anfangsBetrag);
		this.zinsSatz=zinsSatz;
		
	}
	
void zinsenAnrechnen() {
	this.kontoStand= this.kontoStand+(zinsSatz*0.01*this.kontoStand);
	
	
}

public String toString() {
	return "der Kontostand ist: "+ this.kontoStand+ " der Zinssatz lautet: "+ this.zinsSatz+"%";
}
		
}

class GiroKonto extends Konto {
	double gebuehr;

	void einzahlen(double x){
		this.kontoStand= this.kontoStand + x - this.gebuehr;
		
	}
	
	void abheben(double x ){
		this.kontoStand= this.kontoStand-x - this.gebuehr;
	}
	
	public GiroKonto(double  anfangsBetrag , double  gebuehr) {
		super(anfangsBetrag);
		this.gebuehr= gebuehr;
	}
	
	void ueberweisenAuf ( GiroKonto ziel, double betrag){
		ziel.kontoStand= ziel.kontoStand+betrag - ziel.gebuehr;
		this.kontoStand= this.kontoStand-betrag-this.gebuehr;

	}
	
	
	public String toString() {
		return "der Kontostand ist: "+ this.kontoStand+ " Die Gebühr lautet: "+ this.gebuehr;
	}	
}	

