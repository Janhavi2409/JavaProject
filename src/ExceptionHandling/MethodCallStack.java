package ExceptionHandling;

public class MethodCallStack {
    public static void divide() {
        System.out.println("In divide() method");
        int a = 5;
        int b = 0;
        System.out.println("a/b = " + a / b);
    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught...");
            e.printStackTrace();
        }
    }
}
