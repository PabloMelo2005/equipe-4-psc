import java.util.Scanner;

public class pratica05_ex6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cont = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um numero: "+ i +": ");
		
			int idade = input.nextInt();
			cont += idade;
		}
		input.close();
		
		double media = (double) cont / 10;
		System.out.println("A média das idades informadas é: "+ media);
		}
		
}
