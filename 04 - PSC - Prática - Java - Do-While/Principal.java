package principal;
import javax.swing.JOptionPane;
public class Principal {
    public static void main (String args[]) {
        String entrada;
        int numero, soma = 0;
        int contador = 0;
        do {
            entrada = JOptionPane.showInputDialog("Informe um número: ");
            numero = Integer.parseInt(entrada);
            soma += numero;
            contador++;
            entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
        double media = (double) soma / contador;
        JOptionPane.showMessageDialog(null, "A média é: " + media);
        System.exit(0);
    }
}
