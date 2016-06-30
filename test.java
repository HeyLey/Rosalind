import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 28.05.14
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 */
public class test {
    public static void main(String args[]) {
        String s = "werghgiyilffysdrs4u5o";
        int n = 0;
        String t = "";
        int a = 3;
        char ch;
       // int i = 0;
        int z = 0;

     for(int i = 0 ; i < s.length(); i++, z++) {
        while (n < a) {

            ch = s.charAt(i);
            t = t + ch;
            if(i == s.length() - 1) {break;}
            i++; n++;
        } System.out.println(t + " ");


         n = 0;
         t = "";
         i = z;       System.out.println(i);
    }
    }
}
