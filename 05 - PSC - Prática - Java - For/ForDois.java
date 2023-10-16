package activities;

import java.util.Scanner;

public class ForDois {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número inteiro positivo: ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe o segundo número inteiro positivo: ");
        int numero2 = scanner.nextInt();

      
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        System.out.println("Números inteiros entre " + numero1 + " e " + numero2 + ":");

        for (int i = numero1 + 1; i < numero2; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
