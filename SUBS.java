import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 27.05.14
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
public class SUBS {
    public static void main(String[] args) {

        String s = "";
        String t = "";
        int a = 0;
        char c;

        try {

            BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
            s = reader.readLine();
            t = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        char array[] = new char[s.length()];
        char arr[] = new char[t.length()];

        for(int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            array[i] = c;
        }

        for(int i = 0; i < t.length(); i++) {
            c = t.charAt(i);
            arr[i] = c;
        }

        int i = 0;
        int j = 0;
        int k = 0;
        String arK = "";
        int m = 0;
        int z = 0;

        for ( ; i < array.length; ) {
              // System.out.println(i);
           for (  ; j < arr.length && i < array.length; ) {
               if(arr[j] != array[i]) {
                   k = 0; j = 0;



                } else {
                   if (j == 0) {
                       k = i + 1;
                   }
                   // System.out.println(k);
                   j++;
               }
                  i++;
                }




            z++;
            i = z;
            if (k > 0 ) {
                String h ="" + k;
               if(arK.contains(h) == false) {
                arK = arK + h + " ";
               }
            }
            k = 0;
            j = 0;
        } System.out.println(arK);
    }
}
