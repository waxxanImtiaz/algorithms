package sorting;

public class BubleSort {
    public static void countSwaps(int[] a) {
        int listLength = a.length;
        int swapCount = 0;
        for (int i = 0; i < listLength; i++) {
            for (int j = 0; j < listLength - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    swapCount++;
                }
            }
        }

        System.out.printf("Array is sorted in %d swaps.\n", swapCount);
        System.out.printf("First Element: %d\n", a[0]);
        System.out.printf("Last Element: %d\n", a[listLength - 1]);
    }

    public static void main(String[] args) {
        countSwaps(new int[]{1, 2, 3});
    }
}
