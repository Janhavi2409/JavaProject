package MultiThreading;
class Test extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<5; i++) {
            System.out.println("Inside Test Class...");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.start();
        for(int i = 0; i<5; i++) {
            System.out.println("Inside Main Class...");
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
