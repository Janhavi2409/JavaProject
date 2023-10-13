package Searching;

public class LinearSearch {
    static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {12, 46, 43, -21, 78, 39, 78};
        int key = 43;
        int ans = linearSearch(array, key);
        System.out.println(ans);
    }
}
