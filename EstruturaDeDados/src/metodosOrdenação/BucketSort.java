package metodosOrdenação;

public class BucketSort {
	
	public static void bucketSort(int []array) {
		if(array.length <= 1) {
			return;
		}
		
		// criação dos buckets
		ListaEncadeada[] buckets = new ListaEncadeada[array.length];
		
		// maior valor
		int maiorValor = array[0];
		for(int i: array){
			if(i > maiorValor) 
				maiorValor = i;
		}	
		//Distribuição dos elementos nos bucket's
		for (int i=0;i<array.length;i++){
			int indiceBucket = array[i] * array.length / (maiorValor+1);
			if(buckets[indiceBucket] == null) {
				buckets[indiceBucket] = new ListaEncadeada();
				buckets[indiceBucket].inserirOrdenado(array[i]);
			}else
				buckets[indiceBucket].inserirOrdenado(array[i]);
		}
		// Combinar os elementos dos buckets em uma única lista ordenada
		int index = 0;
		for(int i=0;i<array.length;i++) {
			if(buckets[i] != null) {
				Nodo aux = buckets[i].getInicio();
				while(aux != null) {
					array[index++] = aux.getDado();
					aux = aux.getProx();
				}
			}		
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {18,64,92,28,49,83,56,70,38,44};
		
		System.out.println("array antes da ordenação:");
		for(int num : array) {
			System.out.print(num+" ");
		}
		bucketSort(array);
		
		System.out.println("\narray após a ordenação");
		for(int num : array) {
			System.out.print(num+" ");
		}
	}

}
