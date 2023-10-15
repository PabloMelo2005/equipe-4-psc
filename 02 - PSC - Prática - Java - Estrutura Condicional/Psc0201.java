import java.util.Scanner;

public class Psc0201 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota:");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Digite a segunda nota:");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2)/2.0;
		
		System.out.println("Media:" + media);
		
		if (media >= 7.0) {
			
			System.out.println("Situacao: Aprovado");
		}else {
			
			System.out.println("Situacao: Reprovado");
		}
		
		scanner.close();
	}
}
