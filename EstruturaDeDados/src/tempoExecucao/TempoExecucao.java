package tempoExecucao;
import java.util.Arrays;

public class TempoExecucao {

	public static void main(String[] args) {
		
		// Tamanho de entrada a serem, testado
		int[] tamanhosEntrada = {1000,10000, 100000, 1000000};
		
		// Executa algoritmo para cada tamanho de entrada
		for(int tamanho : tamanhosEntrada) {
			int[] entrada = gerarEntrada(tamanho);
			
			// Marca o tempo de início
			long inicio = System.nanoTime();
			
			// Chama o algoritmo a ser testado
			meuAlgoritmo(entrada);
			
			// Marca o tempo de fim
			long fim = System.nanoTime();
			
			// Calcula o tempo de execução em milissegundos
			double tempoExecucao = (fim - inicio)/1000000.0;
			
			System.out.println("Tempo de execução para tamanho "+ tamanho +" : "+ tempoExecucao+" ms");
		}
		
	}
	
	// Exemplo de algotirtmo a ser testado
	public static void meuAlgoritmo(int[] arr) {
		Arrays.sort(arr); // Ordena array
	}
	
	// Método que gera entradas aleatórias
	public static int[] gerarEntrada(int tamanho) {
		int[] arr = new int[tamanho];
		for(int i=0; i < tamanho; i++) {
			arr[i] = (int)(Math.random() * 100); // Números aleatórios entre 0 e 99
		}
		return arr;
	}
	
}
