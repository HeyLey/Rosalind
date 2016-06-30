import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

import static java.lang.String.valueOf;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 28.05.14
 * Time: 13:57
 * To change this template use File | Settings | File Templates.
 */
public class CONS {
    public static void main(String args[]) {
        String s = "";
        int n;
        String t = "";
        int a = 0;
        char c = ' ';
        int dano = 10;

        try {
            BufferedReader br = new BufferedReader(new FileReader ("a.txt"));
               s = br.readLine();
            while(c != '>') {
                a = br.read();
                c = (char)a;
                if (c =='>') {break;  }
                if(c == 'A' || c== 'C' || c == 'G' || c== 'T'){
                    t = t + c;
                }

            }
            n = t.length(); char array[][] = new char[dano][n];

            for(int i = 0 ; i < dano; i++) {

            if(t.equals("")) {
                while(a != -1) {
                    a = br.read();
                    c = (char)a;
                    if (c =='>') {break;  }
                    if(c == 'A' || c== 'C' || c == 'G' || c== 'T'){
                        t = t + c;
                    }
                }
            }
                for(int j = 0 ; j < n ; j++) {
                    c = t.charAt(j);// System.out.print(c + " ");
                    array[i][j] = c;
                }
                s = br.readLine();
                t ="";
            }

            int res[][] = new int[4][n];
            int aa = 0;
            int cc = 0;
            int gg = 0;
            int tt = 0;
            char ar[] = new char[n];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < dano; j++) {
                    c = array[j][i];
                    if (c == 'A') {aa++;}
                    if (c == 'C') {cc++;}
                    if (c == 'G') {gg++;}
                    if (c == 'T') {tt++;}
                }

                 res[0][i] = aa;
                 res[1][i] = cc;
                 res[2][i] = gg;
                 res[3][i] = tt;

                if(aa >= cc && aa>=gg && aa>=tt) {
                    ar[i] = 'A';
                }
                if(cc >= aa && cc>=gg && cc>=tt) {
                    ar[i] = 'C';
                }
                if(gg >= cc && gg>=aa && gg>=tt) {
                    ar[i] = 'G';
                }
                if(tt >= cc && tt>=gg && tt>=aa) {
                    ar[i] = 'T';
                }

                aa=0; cc=0; gg=0; tt=0;

            }

            String st[] = {"A:", "C:", "G:", "T:"};
         //System.out.println(Arrays.toString(ar));
          for(int i = 0; i < n; i++) {
                char ch = ar[i];
                System.out.print(ch);
            }

            System.out.println();
            for(int i = 0; i < 4; i++) {
                System.out.print(st[i] + ' ');
                for(int j = 0; j < n; j++) {
                    int r = res[i][j];
                    System.out.print(valueOf(r) + ' ');
                }
                System.out.println();
            }

        } catch(Exception e) {
            e.printStackTrace();
        }


    }
}
