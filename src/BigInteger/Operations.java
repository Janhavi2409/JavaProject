package BigInteger;

import java.math.BigInteger;

public class Operations {
    public static void main(String[] args) {
        BigInteger A = new BigInteger("100");
        BigInteger B = new BigInteger("200");
        BigInteger C = new BigInteger("200");
        String d = String.valueOf(300);
        BigInteger D = new BigInteger(d);
        System.out.println("A.add(B) = "+A.add(B));
        System.out.println("A.subtract(B) = "+A.subtract(B));
        System.out.println("A.multiply(B) = "+A.multiply(B));
        System.out.println("B.divide(A) = "+B.divide(A));
        System.out.println("A.remainder(B) = "+A.remainder(B));
        System.out.println("A.compareTo(B) = "+A.compareTo(B));
        System.out.println("B.compareTo(A) = "+B.compareTo(A));
        System.out.println("B.compareTo(C) = "+B.compareTo(C));
        System.out.println(A.intValue());
        System.out.println(A.longValue());
        System.out.println(A.doubleValue());
        System.out.println(D.shortValue());
        System.out.println(D.floatValue());
    }
}
