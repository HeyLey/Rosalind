/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 30.05.14
 * Time: 15:45
 * To change this template use File | Settings | File Templates.
 */
public class PMCH {
    public static void main(String[] args) {
        String s = "AGCUAGUCAU";
        int res = 0;

        int au = 0;
        int gc = 0;

        int u = 0;
        int a = 0;
        int t = 0;
        int g = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'U') {u++;}
            if (ch == 'T') {t++;}
            if (ch == 'A') {a++;}
            if (ch == 'G') {g++;}

            if (ch == 'A') {
                if(i != 0) {
                    char uu = s.charAt(i - 1);
                    if(uu == 'U') { au++; }
                }
                if(i != s.length()-1) {
                    char uu = s.charAt(i + 1);
                    if(uu == 'U') { au++; }
                }
            }
            if (ch == 'C') {
                if(i != 0) {
                    char gg = s.charAt(i - 1);
                    if(gg == 'G') { gc++; }
                }
                if(i != s.length()-1) {
                    char gg = s.charAt(i + 1);
                    if(gg == 'G') { gc++; }
                }
            }
        }


    }
}
