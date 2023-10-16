import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			double[] numeros = new double[10];
			
			System.out.println("Digite 10 números reais:");
			for (int i = 0; i < 10; i++) {
			    numeros[i] = scanner.nextDouble();
			}

			// Determinando o menor e o maior número
			double menor = numeros[0];
			double maior = numeros[0];
			for (int i = 1; i < 10; i++) {
			    if (numeros[i] < menor) {
			        menor = numeros[i];
			    }
			    if (numeros[i] > maior) {
			        maior = numeros[i];
			    }
			}

			// Impressão do vetor
			System.out.println("Vetor completo:");
			for (double num : numeros) {
			    System.out.print(num + " ");
			}
			System.out.println();

			// Impressão do menor e maior número
			System.out.println("Menor número: " + menor);
			System.out.println("Maior número: " + maior);
		}
    }
}
