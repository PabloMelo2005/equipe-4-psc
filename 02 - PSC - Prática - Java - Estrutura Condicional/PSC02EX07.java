import java.util.Scanner;

public class PSC02EX07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o coeficiente 'a':");
        double a = scanner.nextDouble();
        System.out.println("Informe o coeficiente 'b':");
        double b = scanner.nextDouble();
        System.out.println("Informe o coeficiente 'c':");
        double c = scanner.nextDouble();
        double delta = calcularDelta(a, b, c);
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0) {
            System.out.println("Esta é uma equação de primeiro grau: x = " + (-c / b));
        } else {
            System.out.println("Esta é uma equação de segundo grau.");
            System.out.println("Delta = " + delta);
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais (delta < 0)");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais: x' = x'' = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes:");
                System.out.println("x' = " + x1);
                System.out.println("x'' = " + x2);
            }
        }
        scanner.close();
    }
    public static double calcularDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}
