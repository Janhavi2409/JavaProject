package Arrays;

public class CreatingAnArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = i * 5;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int[] b = {1, 2, 3, 4, 5};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
