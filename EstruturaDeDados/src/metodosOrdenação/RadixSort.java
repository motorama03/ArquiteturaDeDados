package metodosOrdenação;

public class RadixSort {
    public static void countingSort(int[] vetor, int exp) {
        int n = vetor.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            int index = vetor[i] / exp % 10;
            count[index]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = vetor[i] / exp % 10;
            output[count[index] - 1] = vetor[i];
            count[index]--;
        }

        for (int i = 0; i < n; i++) {
            vetor[i] = output[i];
        }
    }

    public static void radixSort(int[] vetor) {
        int maxNum = getMax(vetor);

        for (int exp = 1; maxNum / exp > 0; exp *= 10) {
            countingSort(vetor, exp);
        }
    }

    public static int getMax(int[] vetor) {
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] vetor = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(vetor);

        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}
