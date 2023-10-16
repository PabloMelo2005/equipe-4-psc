package lista11;

import java.util.Scanner;

public class ex2 {

    // Método de multiplicação usando apenas a operação de soma
    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado += a;
        }
        return b < 0 ? -resultado : resultado;
    }

    // Método de potência usando o método de multiplicação
    public int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }
        return resultado;
    }

    // Método de divisão usando apenas a operação de subtração
    public int divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
        int resultado = 0;
        int sinal = (a < 0) ^ (b < 0) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);
        while (a >= b) {
            a -= b;
            resultado++;
        }
        return resultado * sinal;
    }

    // Método para calcular o resto da divisão
    public int resto(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
        return a - multiplicacao(divisao(a, b), b);
    }

    // Método para verificar se um número é par
    public boolean par(int a) {
        return resto(a, 2) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex2 calc = new ex2();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 – Multiplicação.");
            System.out.println("2 – Potência.");
            System.out.println("3 – Divisão.");
            System.out.println("4 – Par.");
            System.out.println("5 – Sair.");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();

            int a, b;

            switch (choice) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    a = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + calc.multiplicacao(a, b));
                    break;
                case 2:
                    System.out.print("Digite a base: ");
                    a = scanner.nextInt();
                    System.out.print("Digite o expoente: ");
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + calc.potencia(a, b));
                    break;
                case 3:
                    System.out.print("Digite o dividendo: ");
                    a = scanner.nextInt();
                    System.out.print("Digite o divisor: ");
                    b = scanner.nextInt();
                    System.out.println("Quociente: " + calc.divisao(a, b));
                    System.out.println("Resto: " + calc.resto(a, b));
                    break;
                case 4:
                    System.out.print("Digite o número: ");
                    a = scanner.nextInt();
                    System.out.println(a + " é " + (calc.par(a) ? "par" : "ímpar"));
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
