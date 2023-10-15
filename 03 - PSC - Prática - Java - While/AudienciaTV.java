package notasaluno;

import java.util.Scanner;

public class AudienciaTV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] audienciaPorCanal = new int[13]; // Índices de 2 a 12 para representar os canais
        int totalPessoasAssistindo = 0;
        
        System.out.println("Digite o número do canal (2, 4, 5, 7, 12) e o número de pessoas assistindo (ou 0 para encerrar):");
        
        while (true) {
            int numeroCanal = scanner.nextInt();
            
            if (numeroCanal == 0) {
                break; // Encerra o loop quando o usuário digita 0
            }
            
            if (numeroCanal >= 2 && numeroCanal <= 12) {
                int numeroPessoas = scanner.nextInt();
                audienciaPorCanal[numeroCanal] += numeroPessoas;
                totalPessoasAssistindo += numeroPessoas;
            } else {
                System.out.println("Número de canal inválido. Digite novamente.");
            }
        }
        
        scanner.close();
        
        System.out.println("Percentual de audiência por canal:");
        
        for (int canal = 2; canal <= 12; canal++) {
            if (audienciaPorCanal[canal] > 0) {
                double percentualAudiencia = (double) audienciaPorCanal[canal] / totalPessoasAssistindo * 100;
                System.out.println("Canal " + canal + ": " + percentualAudiencia + "%");
            }
        }
    }
}