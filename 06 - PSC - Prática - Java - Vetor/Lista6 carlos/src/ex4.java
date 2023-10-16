import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        // Impressão dos números nas posições pares
        System.out.println("Números nas posições pares:");
        for (int i = 0; i < 10; i += 2) {
            System.out.print(numeros[i] + " ");
        }
    }
}
