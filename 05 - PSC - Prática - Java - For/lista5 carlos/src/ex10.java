import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
            int idade = scanner.nextInt();
            
            scanner.nextLine();  // Para limpar o buffer depois da leitura de um número

            System.out.print("Digite o sexo da " + (i + 1) + "ª pessoa (M para masculino e F para feminino): ");
            char sexo = scanner.nextLine().charAt(0);

            if (sexo == 'F' || sexo == 'f') {
                if (idade >= 20 && idade <= 40) {
                    contador++;
                }
            }
        }

        System.out.println("Número de pessoas do sexo feminino entre 20 e 40 anos: " + contador);
        scanner.close();
    }
}
