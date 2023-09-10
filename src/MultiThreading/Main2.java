package MultiThreading;
class Test2 implements Runnable{
    @Override
    public void run() {
        System.out.println("In Test2 class...");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Test2 test = new Test2();
        test.run();
        System.out.println("In Main2 class...");
    }
}
