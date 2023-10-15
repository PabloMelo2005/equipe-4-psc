package notasalunos;

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeAlunos90 = 0;
        int quantidadeReprovados = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;
        int totalAlunos = 0;
        
        System.out.println("Digite a nota final do aluno (ou uma nota negativa para sair): ");
        double nota = scanner.nextDouble();
        
        while (nota >= 0) {
            System.out.println("Digite o total de faltas do aluno: ");
            int faltas = scanner.nextInt();
            
            totalAlunos++;
            somaNotas += nota;
            
            if (nota >= 90) {
                quantidadeAlunos90++;
            }
            
            if (nota < 70 || faltas >= 20) {
                quantidadeReprovados++;
            }
            
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            
            if (nota < menorNota) {
                menorNota = nota;
            }
            
            System.out.println("Digite a nota final do próximo aluno (ou uma nota negativa para sair): ");
            nota = scanner.nextDouble();
        }
        
        scanner.close();
        
        if (totalAlunos > 0) {
            double mediaNotas = somaNotas / totalAlunos;
            
            System.out.println("Quantidade de alunos com nota maior ou igual a 90: " + quantidadeAlunos90);
            System.out.println("Quantidade de alunos reprovados por nota ou falta: " + quantidadeReprovados);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média de notas da turma: " + mediaNotas);
        } else {
            System.out.println("Nenhum aluno foi registrado.");
        }
    }
}