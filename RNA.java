import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 26.05.14
 * Time: 14:21
 * To change this template use File | Settings | File Templates.
 */
public class RNA {
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
                    s = s + 'U';

                } else {
                    s = s + c;
                }
            }
            System.out.print(s);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
