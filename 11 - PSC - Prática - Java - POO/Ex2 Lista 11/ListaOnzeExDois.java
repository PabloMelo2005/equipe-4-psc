package activities;

public class ListaOnzeExDois {

    public int multiplicacao(int a, int b) {
        int resultado = 0;
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                resultado += a;
            }
        } else if (b < 0) {
            for (int i = 0; i > b; i--) {
                resultado -= a;
            }
        }
        return resultado;
    }

    public int potencia(int a, int b) {
        int resultado = 1;
        if (b >= 0) {
            for (int i = 0; i < b; i++) {
                resultado = multiplicacao(resultado, a);
            }
        } else {
     
            throw new IllegalArgumentException("Expoente negativo não é suportado");
        }
        return resultado;
    }

    public int divisao(int a, int b) {
        int quociente = 0;
        while (a >= b) {
            a = a - b;
            quociente++;
        }
        return quociente;
    }
    public int resto(int a, int b) {
        while (a >= b) {
            a = a - b;
        }
        return a;
    }

    public static void main(String[] args) {
    	
    	ListaOnzeExDois listaonzeexdois = new ListaOnzeExDois(); 
        int a = 10;
        int b = 3;

        System.out.println("Multiplicação: " + listaonzeexdois.multiplicacao(a, b));
        System.out.println("Potência: " + listaonzeexdois.potencia(a, b));
        System.out.println("Divisão (Quociente): " + listaonzeexdois.divisao(a, b));
        System.out.println("Resto: " + listaonzeexdois.resto(a, b));
    }
}
