package metodosOrdenação;



public class TesteOrdenacao {

	public static void main(String[] args) {

        int[] array = new int[100001];
        int i = 0;
        for (int x = 0; x < 100000; x++) {
            array[i] = x;
            i++;
        }
        MetodosOrdenacao ordenar = new MetodosOrdenacao();
        ordenar.radixSort(array);

        System.out.println("//////////////////////////");
        for (int num : array) {
            System.out.println(num);
        }

    }

}
