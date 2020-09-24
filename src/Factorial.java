import java.math.BigInteger;

public class Factorial {

    public static BigInteger ftr (int value) {

        BigInteger go = BigInteger.ONE;
        System.out.println();
        for (int t=1; t <= value; t++)
            go = go.multiply(BigInteger.valueOf(t));
        return go;
    }

}
