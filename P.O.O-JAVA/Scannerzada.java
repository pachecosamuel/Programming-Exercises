package reviewCap10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scannerzada {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o seu salário: ");
			double salario = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Erro! Vc digitou uma letra");
		} finally {
			System.out.println();
		}
		
		
		
		/*int nInt = sc.nextInt();
		byte nByte = sc.nextByte();
		long nLong = sc.nextLong();
		boolean nBool = sc.nextBoolean();
		float nFloat = sc.nextFloat();
		double nDouble = sc.nextDouble();*/
		
		
	}

}
