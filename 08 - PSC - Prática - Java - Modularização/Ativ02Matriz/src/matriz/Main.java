package matriz;

public class Main {

	public static void main(String[] args) {
		Ativ02Matriz matriz = new Ativ02Matriz(); /* Criação da instância da classe **/

		matriz.addElementosMatriz1(); /* Invocação do método para adicionar os elementos na primeira matriz. **/
		
		matriz.addElementosMatriz2(); /* Invocação do método para adicionar os elementos na segunda matriz. **/
		
		matriz.somaMatrizes(); /* Invocação do método para soma dos elementos das matrizes e armazenamento dos resultados em uma matriz resultante. **/

		matriz.exibicaoMatrizResultante(); /* Invocação do método que exibe a matriz resultante. **/
	}

}
