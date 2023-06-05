package metodosOrdenação;

public class TesteOrdenacao {

	public static void main(String[] args) {
		
		int[] array = {18,64,92,28,49,83,56,70,38,44};
		MetodosOrdenacao ordenar = new MetodosOrdenacao();
		
		//ordenar.selectionSort(array);
		//ordenar.bubbleSort(array);
		ordenar.insertionSort(array);
		
		System.out.println("//////////////////////////");
		for(int num:array) {
			System.out.println(num);
		}
		
	}

}
