package Searching;

import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key > array[mid]) {
                start = mid + 1;
            } else if (key < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {12, 46, 43, -21, 78, 39, 79};
        int key = 78;
        Arrays.sort(array);
        int ans = binarySearch(array, key);
        System.out.println(ans);
    }
}
