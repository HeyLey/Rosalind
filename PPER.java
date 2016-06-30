import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 29.05.14
 * Time: 15:03
 * To change this template use File | Settings | File Templates.
 */
public strictfp class PPER {
    public static void main(String args[]) {
        int n = 91;
        int k = 8;
        BigInteger bi1 = new BigInteger(String.valueOf(1));
        BigInteger bi2 = new BigInteger(String.valueOf(1));

        int com = n - k;

        for(int s = 1; s <= n; s ++) {

            bi1 = bi1.multiply(BigInteger.valueOf(s)); //System.out.println(bi1);

        }

        for(int s = 1; s <= com; s ++) {
            bi2 = bi2.multiply(BigInteger.valueOf(s));   //System.out.println(bi2);
        }

        BigInteger res = bi1.divide(bi2);



        System.out.println(res);
    }
}
