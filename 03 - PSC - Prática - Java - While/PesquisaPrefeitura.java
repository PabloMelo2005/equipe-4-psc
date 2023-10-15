package notasaluno;

import java.util.Scanner;

public class PesquisaPrefeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaSalarios = 0;
        int somaFilhos = 0;
        int totalPessoas = 0;
        
        System.out.println("Digite o salário da pessoa (ou um salário negativo para encerrar):");
        double salario = scanner.nextDouble();
        
        while (salario >= 0) {
            System.out.println("Digite o número de filhos da pessoa:");
            int numFilhos = scanner.nextInt();
            
            somaSalarios += salario;
            somaFilhos += numFilhos;
            totalPessoas++;
            
            System.out.println("Digite o salário da próxima pessoa (ou um salário negativo para encerrar):");
            salario = scanner.nextDouble();
        }
        
        scanner.close();
        
        if (totalPessoas > 0) {
            double mediaSalarios = somaSalarios / totalPessoas;
            double mediaFilhos = (double) somaFilhos / totalPessoas;
            
            System.out.println("Média salarial da população: " + mediaSalarios);
            System.out.println("Média do número de filhos da população: " + mediaFilhos);
        } else {
            System.out.println("Nenhum dado foi registrado.");
        }
    }
}