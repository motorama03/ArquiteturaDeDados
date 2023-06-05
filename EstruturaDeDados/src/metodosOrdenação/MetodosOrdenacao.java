package metodosOrdenação;

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
					boolean continua;

					do{
						continua = true;
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
		if(verificaOrdenacao(array))return array;
		for(int i = 0; i<array.length;i++) {
			pivo = array[i];
			j = i-1;
			while(j>=0 && array[j]>pivo) {
				array[j+1] = array[j];
				j=j-1;
			}
			array[j+1]=pivo;
		}
		return array;
	}
}
