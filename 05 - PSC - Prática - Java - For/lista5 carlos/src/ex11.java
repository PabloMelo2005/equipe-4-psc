import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorMasculino = 0;
        int contadorFeminino = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o peso da " + (i + 1) + "ª pessoa (em kg): ");
            double peso = scanner.nextDouble();
            
            scanner.nextLine();  // Para limpar o buffer depois da leitura de um número

            System.out.print("Digite o sexo da " + (i + 1) + "ª pessoa (M para masculino e F para feminino): ");
            char sexo = scanner.nextLine().charAt(0);

            if (sexo == 'M' || sexo == 'm') {
                if (peso >= 60 && peso <= 80) {
                    contadorMasculino++;
                }
            } else if (sexo == 'F' || sexo == 'f') {
                if (peso >= 50 && peso <= 70) {
                    contadorFeminino++;
                }
            }
        }

        System.out.println("Número de homens com peso entre 60 e 80 kg: " + contadorMasculino);
        System.out.println("Número de mulheres com peso entre 50 e 70 kg: " + contadorFeminino);
        scanner.close();
    }
}
