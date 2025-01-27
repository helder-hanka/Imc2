package presentation;

import java.util.Scanner;

import metier.Imc;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		double poids = validerValeur(scanner,"Veullez entrer votre poids en Kg: ");
		double taille = validerValeur(scanner, "Veillez entrer votre tailles en Métre: ");
		
		Imc imc = new Imc(taille, poids);
		System.out.print(imc.afficheImc());
		
		scanner.close();

	}
	
	
	private static double validerValeur(Scanner scanner, String message) {
		System.out.print(message);
		
		while(!scanner.hasNextDouble()) {
			System.out.print("Entrée invalide Le poid :"+message);
			scanner.next();
		}
		
		return scanner.nextDouble();
	}
	

}
