/*
 * User: lkhatbul
 * Date: 17/07/14
 * Time: 11:32
 */

import java.util.Arrays;

public class LEXF {
    public static void main(String args[]) {
        String s = "T A G C";
        int i = 2;
        char array[] = new char[s.length()/2 + 1];
        int t = 0;

        for(int k = 0; k < s.length(); k++) {
            char c = s.charAt(k);
            if (c != ' ') {
                array[t] = c;
                t++;
            }
        }
        System.out.println(Arrays.toString(array));

    }

}
