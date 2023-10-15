package matriz;

import java.util.Scanner;

public class Ativ02Matriz {
	private double[][] matriz1 = new double[2][2], matriz2 = new double[2][2], matriz_resultante = new double [2][2];
	Scanner sc;
	
	public Ativ02Matriz() {
		sc = new Scanner(System.in);
	}

	public void addElementosMatriz1() {

		System.out.println("Informe os números que deseja adicionar à primeira matriz(Até 4): ");

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				matriz1[i][j] = sc.nextDouble();

	}
	
	public void addElementosMatriz2() {

		System.out.println("Informe os números que deseja adicionar à segunda matriz(Até 4): ");

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				matriz2[i][j] = sc.nextDouble();

	}
	
	public void somaMatrizes() {
		
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				matriz_resultante[i][j] = matriz1[i][j] + matriz2[i][j];
	}

	public void exibicaoMatrizResultante() {
		int i, j;

		System.out.println("\n MATRIZ RESULTANTE \n");

		for (i = 0; i < 2; i++) {
			System.out.print("------------- \n");
			System.out.print("| ");
			for (j = 0; j < 2; j++) {
				System.out.print(matriz_resultante[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.print("------------- \n");

	}

}
