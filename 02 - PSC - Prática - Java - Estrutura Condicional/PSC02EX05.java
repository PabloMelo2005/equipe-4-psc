import java.util.Scanner;

public class PSC02EX05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um valor para x:");
		double x = scanner.nextDouble();

		double resultado = calcularFuncao(x);

		System.out.println("O valor da função para x = " + x + " é: " + resultado);

		scanner.close();
	}

	public static double calcularFuncao(double x) {
		if (x < -2) {
			return 2 * x + 2;
		} else if (x >= -2 && x < 3) {
			return 3;
		} else {
			return -x;
		}
	}
}