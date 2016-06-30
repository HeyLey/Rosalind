import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 26.05.14
 * Time: 22:28
 * To change this template use File | Settings | File Templates.
 */
public class HAMM {
    public static void main(String[] args) {
        int res = 0;
        String s;
        String t;
        try {

            BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
              s = reader.readLine();
              t = reader.readLine();
               for(int i = 0; i < s.length(); i++ ) {
                   char sCh = s.charAt(i);
                   char tCh = t.charAt(i);
                   if (sCh != tCh){ res++;}
               }
            System.out.print(res);
        } catch (Exception e) {
        e.printStackTrace();}
    }
}
