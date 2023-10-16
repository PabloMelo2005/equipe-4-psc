package circulo10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe as coordenadas do círculo (x y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.print("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(x, y, raio);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Mover");
            System.out.println("2 - Aumentar");
            System.out.println("3 - Imprimir");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para mover em X: ");
                    int moveX = scanner.nextInt();
                    System.out.print("Digite o valor para mover em Y: ");
                    int moveY = scanner.nextInt();
                    circulo.moveX(moveX);
                    circulo.moveY(moveY);
                    break;
                case 2:
                    System.out.print("Digite o valor para aumentar o raio: ");
                    double aumento = scanner.nextDouble();
                    circulo.aumenta(aumento);
                    break;
                case 3:
                    System.out.println(circulo.exibe());
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
