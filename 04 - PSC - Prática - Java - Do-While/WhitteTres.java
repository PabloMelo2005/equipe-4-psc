package activities;

import java.util.Scanner;

public class WhitteTres {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            String entrada;
	            int numero1, numero2, soma;

	            do {
	                System.out.print("Informe o primeiro número: ");
	                entrada = scanner.nextLine();
	                numero1 = Integer.parseInt(entrada);

	                System.out.print("Informe o segundo número: ");
	                entrada = scanner.nextLine();
	                numero2 = Integer.parseInt(entrada);

	                soma = numero1 + numero2;
	                System.out.println("A soma é: " + soma);

	                System.out.print("Deseja continuar? (S)im ou (N)ão: ");
	                entrada = scanner.nextLine();
	            } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));

	            System.out.print("Deseja continuar? (S)im ou (N)ão: ");
	            entrada = scanner.nextLine();
	            if (entrada.equalsIgnoreCase("não") || entrada.equalsIgnoreCase("n"))
	                break;
	        }

	        scanner.close();
	        System.exit(0);
	    }
	}
