/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 26.05.14
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
public class FIB {
    public static void main(String[] args) {
        long n = 29;  //количество месяцев
        long k = 2;  // количество пар кроликов, родившихся у 1й пары репродуктивного возраста
        long res = 0;

        long f1 = 1;
        long f2 = 1;

        for(long i = 2; i < n; i++) {
            res = (k * f1) + f2;
            f1 = f2;
            f2 = res;
        }
        System.out.println(res);
    }
}
