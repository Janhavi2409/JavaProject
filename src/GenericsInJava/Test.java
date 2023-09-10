package GenericsInJava;
class myGen<T>{
    T x;
    static int count;

    public myGen() {
        count++;
    }
}
public class Test {
    public static void main(String[] args) {
        myGen<Integer> m1 = new myGen<>();
        myGen<Integer> m2 = new myGen<>();
        System.out.println(myGen.count);
    }
}
