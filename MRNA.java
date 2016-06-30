import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 29.05.14
 * Time: 13:28
 * To change this template use File | Settings | File Templates.
 */
public strictfp class MRNA {
    public static void main(String[] args) {

        String s = "";
        char ch;
        int a = 0;
        BigInteger res = new BigInteger(String.valueOf(1));


        try{
        BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
        while(a != -1) {
            a = reader.read();
            ch = (char)a;

            s = s + ch;

        }   //System.out.print(s);
            int array[] = new int[s.length()+1];
            int i = 0;
            int j = 0;

            for( ; j < s.length(); j++) {
                ch = s.charAt(j);
                if(ch == 'F') {
                    array[i] = 2; i++;
                } else

                if(ch == 'L') {
                    array[i] = 6;  i++;
                }  else

                if(ch == 'S') {
                    array[i] = 6;  i++;
                }  else

                if(ch == 'Y') {
                    array[i] = 2;   i++;
                }   else

                if(ch == 'P') {
                    array[i] = 4;  i++;
                }     else

                if(ch == 'C') {
                    array[i] = 2;  i++;
                }  else

                if(ch == 'W') {
                    array[i] = 1; i++;
                }  else

                if(ch == 'I') {
                    array[i] = 3;  i++;
                }   else

                if(ch == 'H') {
                    array[i] = 2;  i++;
                } else

                if(ch == 'Q'){
                    array[i] = 2;   i++;
                }   else

                if(ch == 'R') {
                    array[i] = 6;     i++;
                }

                if(ch == 'M') {
                    array[i] = 1;    i++;
                }  else

                if(ch == 'T') {
                    array[i] = 4;    i++;
                }
                    else
                if(ch == 'V') {
                    array[i] = 4;    i++;
                }
                    else
                if(ch == 'A') {
                    array[i] = 4;    i++;
                }   else

                if(ch == 'G') {
                    array[i] = 4;   i++;
                }    else

                if(ch == 'N'){
                    array[i] = 2;   i++;
                }     else

                if(ch == 'K') {
                    array[i] = 2;    i++;
                }
                     else
                if(ch == 'D') {
                    array[i] = 2;     i++;
                }
                     else
                if(ch == 'E') {
                    array[i] = 2;      i++;
                }


            }

             array[i] = 3;


            for(int k = 0; k < array.length; k++) {
                long p = array[k];
                if(p != 0) {
                    res = res.multiply(BigInteger.valueOf(p));

                }
            }

            System.out.println(res);




        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
