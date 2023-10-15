import java.util.Scanner;

public class PSC02EX08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto (1 a 5):");
        int codigo = scanner.nextInt();

        double preco = 0.0;

        switch (codigo) {
            case 1:
                preco = 99.99;
                break;
            case 2:
                preco = 103.89;
                break;
            case 3:
                preco = 49.98;
                break;
            case 4:
                preco = 89.72;
                break;
            case 5:
                preco = 97.35;
                break;
            default:
                System.out.println("Código de produto inválido.");
                scanner.close();
                return;
        }

        System.out.println("Produto: " + obterNomeProduto(codigo));
        System.out.println("Preço: R$ " + preco);

        scanner.close();
    }

    public static String obterNomeProduto(int codigo) {
        switch (codigo) {
            case 1:
                return "Sapato";
            case 2:
                return "Bolsa";
            case 3:
                return "Camisa";
            case 4:
                return "Calça";
            case 5:
                return "Blusa";
            default:
                return "Desconhecido";
        }
    }
}