import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 26.05.14
 * Time: 13:42
 * To change this template use File | Settings | File Templates.
 */
public class DNA {
    public static void main(String args[]) {
        char c;
        int a = 0;
        int A = 0;
        int C = 0;
        int G = 0;
        int T = 0;
       try {

            BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
            while(a != -1) {
                a = reader.read();
                c = (char)a; System.out.print(c);
                if(c == 'A') { A++; }
                if(c == 'C') { C++; }
                if(c == 'G') { G++; }
                if(c == 'T') { T++; }
            }
           System.out.print(A + " " + C + " " + G + " " + T);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
