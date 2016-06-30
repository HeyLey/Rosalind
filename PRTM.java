import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 28.05.14
 * Time: 18:07
 * To change this template use File | Settings | File Templates.
 */
public strictfp class PRTM {
    public static void main(String args[]) {
        String s = "";
        char c;
        int a = 0;
        double res = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));
            while(a != -1) {
                a = br.read();
                c = (char)a;
                if (c=='A') res = res + 71.03711;
                if (c=='C') res = res + 103.00919;
                if (c=='D') res = res + 115.02694;
                if (c=='E') res = res + 129.04259;
                if (c=='F') res = res + 147.06841;
                if (c=='G') res = res + 57.02146;
                if (c=='H') res = res + 137.05891;
                if (c=='I') res = res + 113.08406;
                if (c=='K') res = res + 128.09496;
                if (c=='L') res = res + 113.08406;
                if (c=='M') res = res + 131.04049;
                if (c=='N') res = res + 114.04293;
                if (c=='P') res = res + 97.05276;
                if (c=='Q') res = res + 128.05858;
                if (c=='R') res = res + 156.10111;
                if (c=='S') res = res + 87.03203;
                if (c=='T') res = res + 101.04768;
                if (c=='V') res = res + 99.06841;
                if (c=='W') res = res + 186.07931;
                if (c=='Y') res = res + 163.06333;
            }

            System.out.print(res);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
