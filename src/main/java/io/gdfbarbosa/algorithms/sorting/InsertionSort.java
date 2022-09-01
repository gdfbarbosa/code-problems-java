package io.gdfbarbosa.algorithms.sorting;

/**
 * Insertion sort algorithm as seen in "Introduction to Algorithms", 3rd edition (CLRS).
 */
public class InsertionSort {
    public int[] sort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
        return arr;
    }
}
