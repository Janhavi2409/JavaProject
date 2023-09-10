package Constructor;
class PConstructor{
    int a;
    int b;

    public PConstructor(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void add(){
        System.out.println(this.a+this.b);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        PConstructor p = new PConstructor(5, 6);
        p.add();
    }
}
