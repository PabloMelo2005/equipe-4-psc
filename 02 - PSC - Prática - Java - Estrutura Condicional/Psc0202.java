package psc0202;

import java.util.Scanner;

public class Psc0202 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o comprimento do primeiro lado do triângulo: ");
        double lado1 = input.nextDouble();

        System.out.println("Digite o comprimento do segundo lado do triângulo: ");
        double lado2 = input.nextDouble();

        System.out.println("Digite o comprimento do terceiro lado do triângulo: ");
        double lado3 = input.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Este é um triângulo equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Este é um triângulo isósceles.");
        } else {
            System.out.println("Este é um triângulo escaleno.");
        }

        input.close();
    }
}
