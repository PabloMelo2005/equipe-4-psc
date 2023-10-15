package principal;
import javax.swing.JOptionPane;
public class Principal02 {
    public static void main (String args[]) {
        String entrada;
        int numero, soma = 0;
        int contador = 0;
        do {
            entrada = JOptionPane.showInputDialog("Informe um número: ");
            numero = Integer.parseInt(entrada);
            soma += numero;
            contador++;
            int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (resp == JOptionPane.YES_OPTION)
                entrada = "sim";
            else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
                entrada = "não";
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
        double media = (double) soma / contador;
        JOptionPane.showMessageDialog(null, "A média é: " + media);
        System.exit(0);
    }
}

