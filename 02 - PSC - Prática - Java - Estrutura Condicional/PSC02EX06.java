import java.util.Scanner;

public class PSC02EX06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o primeiro lado em cm:");
		double a = scanner.nextDouble();
		System.out.println("Informe o segundo lado em cm:");
		double b = scanner.nextDouble();
		System.out.println("Informe o terceiro lado em cm:");
		double c = scanner.nextDouble();
		boolean condicao1 = Math.abs(b - c) < a && a < b + c;
		boolean condicao2 = Math.abs(a - c) < b && b < a + c;
		boolean condicao3 = Math.abs(a - b) < c && c < a + b;
		if (condicao1 && condicao2 && condicao3) {
			System.out.println("Os três valores informados podem ser os comprimentos dos lados de um triângulo.");		} else {
			System.out.println("Os três valores informados NÃO podem ser os comprimentos dos lados de um triângulo.");		}

		scanner.close();
	}
}