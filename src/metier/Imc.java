package metier;

 public class Imc {
	private double taille;
	private double poid;
	
	public Imc(double taille, double poid) {
		this.taille=taille;
		this.poid=poid;
	}
	
	public double calcImc () {
		
		return  poid/(taille*taille);

	}
	
	public String checkImc() {
		
		double imc = calcImc();
		
		if(imc > 40) {
			return "Obésité Sévére";
		}
		if(imc > 18.5 && calcImc() < 25) {
			return "Normal";
		}
		if(imc > 25 && calcImc() < 30) {
			return "Surpoids. \n Commencé à faire du sport";
		}
		if(imc > 30 && calcImc() < 40) {
			return "Obésiteé modérée. \n Attention faite du sport";
		}
		if(imc < 18.5); {
			return "Maigre";
		}
		
	}
	
	public String afficheImc() {
		return "Voici votre IMC: "+checkImc();
	}
	
}
