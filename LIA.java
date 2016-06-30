/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 28.05.14
 * Time: 18:27
 * To change this template use File | Settings | File Templates.
 */
public strictfp class LIA {
    public static void main(String args[]) {
        int generation = 6; //поколение          max7
        int k = 18; //количество детей с фенотипом AaBb в поколении k        max128

        double childs= 0;  //общее ко-во детей    = количество знаков
        double n = 0;

        if(generation == 1) {n = 2;}
        if(generation == 2) {n = 4;}
        if(generation == 3) {n = 8;}
        if(generation == 4) {n = 16;}
        if(generation == 5) {n = 32;}
        if(generation == 6) {n = 64;}
        if(generation == 7) {n = 128;}


        double var = Math.pow(n, 2);  //общее количество вариантов

        double nF = 1;


        for(int i = 1; i <= n; i++) {        //nF - считает факториал n
            nF = nF * i;
        }  // System.out.println(nF);

        double kF = 1;
        double nkF = 1;

        double ver = 0;

       for( ; k <= n; k++) {

                 double nk = n - k;       // System.out.println(nk);

                 for(int i = 1; i <= k; i++) {        //kF - считает факториал k
                     kF = kF * i;
                 }     // System.out.println(kF);

                 for(int i = 1; i <= nk; i++) {        //nkF - считает факториал n - k
                     nkF = nkF * i;
                 } //  System.out.println(nkF);

                 double vars = nF/(kF*nkF); //кол-во вариантов где есть k единиц
              // System.out.println(vars);

                  double ones = Math.pow(1.0/4.0, k); //System.out.println(ones);
                  double nulls = Math.pow(3.0/4.0, nk); //System.out.println(nulls);

                  double res = ones * vars * nulls; //System.out.println(res);

                  ver = ver + res;

           kF = 1;
           nkF = 1;

      }

        System.out.println(ver);
    }
}
