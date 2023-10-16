import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] matrizResultado = new int[2][2];

        // Leitura da matriz A
        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Elemento A[%d][%d]: ", i, j);
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Leitura da matriz B
        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Elemento B[%d][%d]: ", i, j);
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Soma das matrizes
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Apresentação da matriz resultante
        System.out.println("Matriz resultante da soma:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
