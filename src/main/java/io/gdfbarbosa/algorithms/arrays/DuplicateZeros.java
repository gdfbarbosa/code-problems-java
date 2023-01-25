package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="">1089. Duplicate Zeros</a>
 */
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int lengthArr = arr.length - 1;

        // Find the number of zeros to be duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (int left = 0; left <= lengthArr - possibleDups; left++) {

            // Count the zeros
            if (arr[left] == 0) {

                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included
                if (left == lengthArr - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[lengthArr] = 0;
                    lengthArr -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backwards from the last element which would be part of new array.
        int last = lengthArr - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}
