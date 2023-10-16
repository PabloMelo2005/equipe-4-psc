package activities;

import java.util.Scanner;

public class ForDez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 10;
        int contadorFemininoIdade2040 = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Informe a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            System.out.print("Informe o sexo da pessoa " + i + " (m/f): ");
            char sexo = scanner.next().charAt(0);

            if (sexo == 'f' && idade >= 20 && idade <= 40) {
                contadorFemininoIdade2040++;
            }
        }

        System.out.println("Quantidade de pessoas do sexo feminino entre 20 e 40 anos: " + contadorFemininoIdade2040);

        scanner.close();
    }
}
