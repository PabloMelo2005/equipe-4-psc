import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        
        // a. Lendo a matriz
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.println("Digite o elemento da linha " + (i+1) + " e coluna " + (j+1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // a. Imprimindo a matriz
        System.out.println("Matriz original:");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // b. Imprimir elementos das posições onde o índice da linha é par e o índice da coluna é ímpar
        System.out.println("Elementos das posições de linha par e coluna ímpar:");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(i % 2 == 0 && j % 2 != 0) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println();
        }

        // c. Imprimir a matriz transposta
        System.out.println("Matriz transposta:");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }

        // d. Trocar os elementos da diagonal principal com os elementos da diagonal secundária
        for(int i = 0; i < 5; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][4-i];
            matriz[i][4-i] = temp;
        }

        // d. Imprimindo a matriz após a troca
        System.out.println("Matriz após troca da diagonal principal com diagonal secundária:");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
