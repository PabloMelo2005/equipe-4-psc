import java.util.Scanner;

public class PSC02EX04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o peso (em kg):");
		double peso = scanner.nextDouble();
		System.out.println("Digite a altura (em metros):");
		double altura = scanner.nextDouble();
		double imc = peso / (altura * altura);
		System.out.println("Seu IMC é: " + imc);
		if (imc < 20) {
			System.out.println("Situação: Abaixo do Peso");
		} else if (imc >= 20 && imc < 25) {
			System.out.println("Situação: Normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Situação: Sobrepeso");
		} else if (imc >= 30 && imc <= 40) {
			System.out.println("Situação: Obesidade");
		} else if (imc > 40) {
			System.out.println("Situação: Obesidade Mórbida");
		} else {
			System.out.println("IMC fora da faixa de classificação conhecida.");
		}
		scanner.close();
	}
}