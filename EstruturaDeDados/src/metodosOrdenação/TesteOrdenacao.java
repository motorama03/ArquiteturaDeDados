package metodosOrdenação;
import java.util.Random;


public class TesteOrdenacao {

	public static void main(String[] args) {
		Random aleatorio = new Random();
        int[] array = new int[1000001];
        int i = 0;
        
        for (int x = 0; x >= 1000000; x--) {
//            array[i] = aleatorio.nextInt(1, 1000000);
        	array[i] = x;
        	i++;
        }
        
        RadixSort radix = new RadixSort();
        radix.radixSort(array);
        
        // Marca o tempo de início da ordenação
     	long inicio = System.nanoTime();
        MetodosOrdenacao ordenar = new MetodosOrdenacao();
        ordenar.radixSort(array);
        // Marca o fim do tempo de ordenação
        long fim = System.nanoTime();
        // Calcula o tempo de execução em milissegundos
     	double tempoExecucao = (fim - inicio)/1000000.0;
     	System.out.println("Demorou para ordenar "+tempoExecucao+" Ms");
        
        System.out.println("//////////////////////////");
        for (int num : array) {
            System.out.println(num);
        }

    }

}
