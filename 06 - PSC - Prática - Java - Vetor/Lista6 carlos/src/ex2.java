import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        
        // Leitura dos 10 números reais
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        // Impressão do vetor
        System.out.println("Vetor completo:");
        for (double num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Impressão das posições com números negativos
        System.out.println("Posições com números negativos:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                System.out.print(i + " ");
            }
        }
    }
}
