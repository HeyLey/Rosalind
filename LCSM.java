import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 28.05.14
 * Time: 17:47
 * To change this template use File | Settings | File Templates.
 */
public class LCSM {
    public static void main(String args[]) {
        String s = "";
        String t = "";
        int a = 0;
        char c;
        String array[] = new String[100];
        int i = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));
            s = br.readLine();
            while(a != -1 ) {
                  s = br.readLine();
                  while(a != '>') {
                       a = br.read();
                      if(a == -1) {break;}
                       c = (char)a;
                       if(c == 'A' || c== 'C' || c == 'G' || c== 'T'){
                            t = t + c;
                       }
                  }
                if(a == -1) {break;}
                System.out.println(t);
                t = "";
            }
            System.out.print(Arrays.toString(array));
        } catch (Exception e) {
                     e.printStackTrace();
        }
    }
}
