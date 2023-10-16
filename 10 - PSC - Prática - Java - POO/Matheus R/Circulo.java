package circulo10;

import java.util.Scanner;

class Circulo {
    private int x;
    private int y;
    private double raio;

    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo() {
        this(0, 0, 0);
    }

    public void moveX(int x1) {
        x += x1;
    }

    public void moveY(int y1) {
        y += y1;
    }

    public void aumenta(double n) {
        raio *= n;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public String exibe() {
        return "Centro: (" + x + ", " + y + ")\nRaio: " + raio + "\nÁrea: " + calcularArea() + "\nPerímetro: " + calcularPerimetro();
    }
}
