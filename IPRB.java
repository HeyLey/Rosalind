/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 26.05.14
 * Time: 22:49
 * To change this template use File | Settings | File Templates.
 */
public strictfp class IPRB {
    public static void main(String[] args) {
        int k = 23;        //AA
        int m = 16;         //Aa
        int n = 24;         //aa

        double all = k + m + n;

        double vK1 = k/all;
        double vM1 = m/all;
        double vN1 = n/all;

        double vKK2 = (k-1)/(all-1);
        double vMM2 = (m-1)/(all-1);
        double vNN2 = (n-1)/(all-1);

        double vK2 = k/(all-1);
        double vM2 = m/(all-1);
        double vN2 = n/(all-1);

        double KK = vK1*vKK2;
        double KM = vK1*vM2;
        double KN = vK1*vN2;

        double MK = vM1*vK2;
        double MM = vM1*vMM2;
        double MN = vM1*vN2;

        double NK = vN1*vK2;
        double NM = vN1*vM2;
        double NN = vN1*vNN2;


        double K_K = KK;
        double K_M = KM + MK;
        double K_N = NK + KN;
        double M_M = MM;
        double M_N = NM + MN;
        double N_N = NN;


        double v1 = K_K + K_M + K_N;
        double v2 = M_M * 0.75;
        double v3 = M_N * 0.5;

        double ver = v1 + v2 + v3;
        System.out.println(ver);


    }
}
