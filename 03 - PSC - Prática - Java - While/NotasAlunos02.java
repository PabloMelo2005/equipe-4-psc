package notasaluno;

import java.util.Scanner;

public class NotasAlunos02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int matricula;
        
        do {
            System.out.println("Informe a matrícula do aluno (ou uma matrícula negativa para sair): ");
            matricula = scanner.nextInt();
            
            if (matricula < 0) {
                break;
            }
            
            System.out.println("Informe a primeira nota do aluno: ");
            double nota1 = scanner.nextDouble();
            
            System.out.println("Informe a segunda nota do aluno: ");
            double nota2 = scanner.nextDouble();
            
            System.out.println("Informe a terceira nota do aluno: ");
            double nota3 = scanner.nextDouble();
            
            double media = (nota1 + nota2 + nota3) / 3;
            
            if (media >= 70) {
                System.out.println("Aluno aprovado.");
            } else if (media >= 60) {
                System.out.println("Aluno em recuperação.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            
        } while (matricula >= 0);
        
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}