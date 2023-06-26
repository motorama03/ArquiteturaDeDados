package metodosOrdenação;

import java.util.Arrays;

public class MetodosOrdenacao {
	
	public boolean verificaOrdenacao(int array[]) {
		boolean ordenado = true;		
		int primeiro = 0;
		int seguinte = 0;
		for(int i = 0; i < array.length-1; i++) {
			primeiro = array[i];
			for(int y = 0; y < array.length-i-1; y++) {
				seguinte = array[y];
				if(primeiro > seguinte)return false;
			}
		}
		return ordenado;
	
	}
	
	public int[] bubbleSort(int array[]) {
		int temp = 0;
		if(!verificaOrdenacao(array)){
			for(int i = 0; i<array.length; i++) {
				for(int j = 0; j<array.length-i-1; j++) {
					boolean continua = true;
					do{
//						continua = true;
						int atual = array[i];
						int prox = array[j];
						if (!(atual > prox))continua = false;
					}while(continua && (i != array.length-1));
					if(!continua)return array;
					
					if(array[j]> array[j+1]) {
						temp= array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
		return array;
		}else
			return array;
	}
	
	public int[] selectionSort(int array[]) {
		int min, temp;
		if(!verificaOrdenacao(array)) {
			for(int i = 0; i < array.length-1; i++) {
				min = i;
				for(int j= i+1; j<array.length;j++) {
					if(array[j]<array[min]) {
						min = j;
					}
				}
				temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
			return array;	
		}else
			return array;
	
	}
	
	public int[] insertionSort(int array[]) {
		int pivo, j;
		int Comparacao = 0;
		int troca = 0;
		//if(verificaOrdenacao(array))return array;
		for(int i = 0; i<array.length;i++) {
			pivo = array[i];
			Comparacao ++;
			j = i-1;
			while(j>=0 && array[j]>pivo) {
				troca++;
				array[j+1] = array[j];
				j=j-1;
			}
			array[j+1]=pivo;
		}
		System.out.println("Quantidade de comparacoes: "+Comparacao+"\nQuantidade de trocas: "+troca);
		return array;
	}
	
    public static void countingSort(int[] vetor, int exp) {
        int n = vetor.length;
        int[] output = new int[n];
        int[] count = new int[10];
        int troca = 0;
        int comparacao = 0;

        for (int i = 0; i < n; i++) {
        	comparacao++;
            int index = vetor[i] / exp;
            count[index % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = vetor[i] / exp;
            output[count[index % 10] - 1] = vetor[i];
            count[index % 10]--;
        }

        for (int i = 0; i < n; i++) {
            vetor[i] = output[i];
            troca++;
        }
        System.out.println("Quantidade de comparacoes: "+comparacao+"\nQuantidade de trocas: "+troca);
    }

    public static void radixSort(int[] vetor) {
        int max_num = Arrays.stream(vetor).max().getAsInt();
        int exp = 1;

        while (max_num / exp > 0) {
            countingSort(vetor, exp);
            exp *= 10;
        }
    }
    
    public void ALGORITMO(int[] array) {
    	
	}
}
