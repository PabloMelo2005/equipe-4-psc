import java.util.Scanner;

public class pratica05_ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a quantidade de números que deseja inserir: ");
        int quantidade = input.nextInt();
        
        if (quantidade <= 0) {
            System.out.println("error");
        }else {
        	int maior = Integer.MIN_VALUE;
        	int menor = Integer.MAX_VALUE;
		
		for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = input.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
		
		if(maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
			System.out.println("O maior número informado é: "+maior);
			System.out.println("O menor número Informado é: "+menor);
		}else {
			System.out.println("error");
        	}
        }
        input.close();
	}
}