import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 26.05.14
 * Time: 14:40
 * To change this template use File | Settings | File Templates.
 */
public class REVC {
    public static void main(String[] args) {
        char c;
        int a = 0;
        String s = "";

        try {

            BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
            while(a != -1) {
                a = reader.read();
                c = (char)a;
                if(c == 'T') {
                    s = s + 'A';

                } else if (c == 'A'){
                    s = s + 'T';
                } else if (c == 'C') {
                    s = s + 'G';
                } else if (c == 'G') {
                    s = s + 'C';
                }
            }
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.reverse());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
