import java.util.Scanner;

public class PSC02EX03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a primeira nota do aluno (entre 0 e 10):");
		double nota1 = scanner.nextDouble();

		System.out.println("Digite a segunda nota do aluno (entre 0 e 10):");
		double nota2 = scanner.nextDouble();

		System.out.println("Digite a terceira nota do aluno (entre 0 e 10):");
		double nota3 = scanner.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3.0;

		System.out.println("Média do aluno: " + media);

		if (media >= 0 && media < 3) {
			System.out.println("REPROVADO");
		} else if (media >= 3 && media < 7) {
			System.out.println("EXAME");
		} else if (media >= 7 && media <= 10) {
			System.out.println("APROVADO");
		} else {
			System.out.println("Média inválida. Certifique-se de que todas as notas estejam no intervalo [0, 10].");
		}

		scanner.close();
	}
}
