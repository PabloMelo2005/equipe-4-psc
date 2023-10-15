
import java.util.Scanner;
	
	public class pratica05_ex4 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Digite a quantidade de idades que deseja informar: ");
	        int contador = input.nextInt();
	        
	        if (contador <= 0) {
	            System.out.println("Quantidade inválida. O programa será encerrado.");
	            input.close();
	            return;
	        }
	        
	        int soma_de_idades = 0;
	        
	        for (int i = 1; i <= contador; i++) {
	            System.out.print("Digite a idade " + i + ": ");
	            int idade = input.nextInt();
	            
	            soma_de_idades += idade;
	        }
			
			input.close();
			
			if(contador > 0) {
				double media = (double) soma_de_idades / contador;
				System.out.printf("A média das %d idades é: %.2f%n", contador, media);
			}else {
				System.out.println("error.");
			}
		}
}
