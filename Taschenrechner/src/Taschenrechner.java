import java.util.Scanner;

public class Taschenrechner {
	
	public static void main(String[] args) {
		Scanner Eingabe = new Scanner(System.in);
		double ersteZahl;
		double zweiteZahl;
		double Ergebnis1;
		double Ergebnis2;
		double Ergebnis3;
		double Ergebnis4;
		char Operator;
		
		System.out.println("Bitte geben Sie Ihre erste Zahl ein:");
		ersteZahl = Eingabe.nextDouble();
		System.out.println("Bitte geben Sie Ihre zweite Zahl ein:");
		zweiteZahl = Eingabe.nextDouble();
		System.out.println("Bitte geben Sie Ihre einen Rechenoperator ein(+, -, *, /)");
		Operator = Eingabe.next().charAt(0);
		Ergebnis1 = ersteZahl + zweiteZahl;
		Ergebnis2 = ersteZahl - zweiteZahl;
		Ergebnis3 = ersteZahl * zweiteZahl;
		Ergebnis4 = ersteZahl / zweiteZahl;
		
		if (Operator == '+') {
			System.out.println("Das Ergebnis ist: " + Ergebnis1);
		}
		else if (Operator == '-'){
			System.out.println("Das Ergebnis ist: " + Ergebnis2);
		}
		else if (Operator == '*') {
			System.out.println("Das Ergebnis ist: " + Ergebnis3);
		}
		else if (Operator == '/') {
			System.out.println("Das Ergebnis ist: " + Ergebnis4);
		}
		else {
			System.out.println("Ihre Eingabe ist ungültig.");
		}
				
	}

}
