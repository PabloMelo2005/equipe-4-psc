package activities;

import java.util.Scanner;

public class WhitteAtividadeDois {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	       
	            double nota;
	            do {
	                System.out.print("Informe a nota (entre 0 e 10): ");
	                nota = scanner.nextDouble();
	            } while (nota < 0 || nota > 10);

	            double salario;
	            do {
	                System.out.print("Informe o salário (maior que zero): ");
	                salario = scanner.nextDouble();
	            } while (salario <= 0);
	            char sexo;
	            do {
	                System.out.print("Informe o sexo (m ou f): ");
	                sexo = scanner.next().toLowerCase().charAt(0);
	            } while (sexo != 'm' && sexo != 'f');
	            int idade;
	            do {
	                System.out.print("Informe a idade (entre 0 e 120): ");
	                idade = scanner.nextInt();
	            } while (idade < 0 || idade > 120);

	            System.out.println("Dados informados corretamente. Sucesso!");
	            System.out.print("Deseja informar novos dados? (s/n): ");
	            char continuar = scanner.next().toLowerCase().charAt(0);
	            if (continuar == 'n') {
	                break;
	            }
	        }
	        scanner.close();
	    }
	}