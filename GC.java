
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 26.05.14
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */
public class GC {
    public static strictfp void main(String[] args) {
        char c;
        int a = 0;
        int size = 0;



        String s = "";
        String string = "";
        try {

            BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
            while(a != -1) {
                a = reader.read();
                c = (char)a;
                s = s + c;
                if(c == '>') {
                    size++;
                }
            }
            char ch;
            int j = 0;
            int i = 0;
            String[] st = new String[size];
            double[] gc = new double[size];



    lab1:       while (j < s.length()) {
                ch = s.charAt(j);
                   if(ch == '>' ) {

                        while (j < s.length() && ch != '\n') {
                             ch = s.charAt(j+1);
                             string = string + ch;
                             j++;
                         }

                         st[i] = string; i++;
                         string = "";
                   }     j++;

                }


                i = 0; j = 0;
                int cg = 0;

    lab2:       while (j < s.length()) {
                     ch = s.charAt(j);

                       if(ch == 'A' || ch == 'T' || ch == 'G' || ch == 'C') {
                          while (j < s.length() &&  ch != '>')
                           {

                              ch = s.charAt(j);
                               if(ch == 'A' || ch == 'T' || ch == 'G' || ch == 'C'){
                                   string = string + ch;

                                                if (ch == 'G' || ch == 'C') {
                                                cg++;
                                                      }


                                }    j++;

                           }
                           //System.out.println(string);
                           size = string.length();  // System.out.println(size);
                           double d = (100.0/size) * cg;
                           gc[i] = d;
                        //   System.out.println(cg);
                           string = "";
                        // System.out.println(Arrays.toString(gc));

                            i++;

                            cg = 0;

    }

                     j++;
                }
          //  System.out.println(Arrays.toString(st));
           // System.out.println(Arrays.toString(gc));

            double[] array = new double[gc.length];
            for(int l = 0;  l< gc.length; l++) {
              array[l]  = gc[l];
            }
            Arrays.sort(array);
            double t = array[gc.length - 1];

            int m = 0;
            for(int l = 0; l < gc.length; l++) {
                if (gc[l] == t) {m = l; break;}

            }
            System.out.println(st[m]+gc[m]);

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
