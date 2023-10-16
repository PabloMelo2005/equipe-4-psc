package lista10;
import java.util.Scanner;

public class ex3 {
    private int hora;
    private int minuto;
    private int segundo;

    public ex3() {
        this(0, 0, 0);
    }

    public ex3(int hora) {
        this(hora, 0, 0);
    }

    public ex3(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public ex3(int hora, int minuto, int segundo) {
        setTime(hora, minuto, segundo);
    }

    public void setTime(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora deve estar entre 0 e 23");
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto deve estar entre 0 e 59");
        }
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("Segundo deve estar entre 0 e 59");
        }
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", hora, minuto, segundo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex3 tempo = new ex3();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Definir hora");
            System.out.println("2. Definir minuto");
            System.out.println("3. Definir segundo");
            System.out.println("4. Exibir tempo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Digite a hora: ");
                    int hora = scanner.nextInt();
                    tempo.setHora(hora);
                    break;
                case 2:
                    System.out.print("Digite o minuto: ");
                    int minuto = scanner.nextInt();
                    tempo.setMinuto(minuto);
                    break;
                case 3:
                    System.out.print("Digite o segundo: ");
                    int segundo = scanner.nextInt();
                    tempo.setSegundo(segundo);
                    break;
                case 4:
                    System.out.println("Tempo atual: " + tempo);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
