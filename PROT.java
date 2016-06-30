import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: lkhatbul
 * Date: 27.05.14
 * Time: 9:44
 * To change this template use File | Settings | File Templates.
 */
public class PROT {
    public static void main(String args[]) {

    String s = "AUGUAGCUAACUCAGGUUACAUGGGGAUGACCCCGCGACUUGGAUUAGAGUCUCUUUUGGAAUAAGCCUGAAUGAUCCGAGUAGCAUCUCAG";
    String st = "";
    int a = 0;
    char c;
    int j = 0;
    String res = "";
    int i = 0;
        try {

            BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
            while(a != -1) {

                a = reader.read();
                c = (char)a;
                s = s + c;

                } //System.out.println(s);


    for ( ; i < s.length(); i++) {

        while (j < 3)     {
            if(i == s.length()) {break;}
            c = s.charAt(i);
            st = st + c;
            j++; i++;
        }  i--;
    // System.out.println(st);

     if(st.equals("UUU") || st.equals("UUC")) {
           res = res + "F";
        }  else

     if(st.equals("UUA") || st.equals("UUG") || st.equals("CUU") || st.equals("CUC") || st.equals("CUA") || st.equals("CUG")) {
           res = res + "L";
        } else

     if(st.equals("UCU") || st.equals("UCC") || st.equals("UCA") || st.equals("UCG") || st.equals("AGU") || st.equals("AGC")) {
        res = res + "S";
        }   else

    if(st.equals("UAU") || st.equals("UAC")) {
        res = res + "Y";
        }     else

     if(st.equals("CCU") || st.equals("CCC") || st.equals("CCA") || st.equals("CCG")) {
        res = res + "P";
        }     else

     if(st.equals("UGU") || st.equals("UGC")) {
        res = res + "C";
        }     else

     if(st.equals("UGG")) {
        res = res + "W";
        }     else

     if(st.equals("AUU") || st.equals("AUC") || st.equals("AUA")) {
        res = res + "I";
        }   else

     if(st.equals("CAU") || st.equals("CAC")) {
        res = res + "H";
        }    else

     if(st.equals("CAA") || st.equals("CAG")) {
        res = res + "Q";
        }    else

     if(st.equals("CGU") || st.equals("CGC") || st.equals("CGA") || st.equals("CGG") || st.equals("AGA") || st.equals("AGG")) {
        res = res + "R";
        }   else

     if(st.equals("AUG")) {
        res = res + "M";
        }  else

     if(st.equals("ACU") || st.equals("ACC") || st.equals("ACA") || st.equals("ACG")) {
        res = res + "T";
        }  else

     if(st.equals("GUU") || st.equals("GUC") || st.equals("GUA") || st.equals("GUG")) {
        res = res + "V";
        }  else

     if(st.equals("GCU") || st.equals("GCC") || st.equals("GCA") || st.equals("GCG")) {
        res = res + "A";
        }    else

     if(st.equals("GGU") || st.equals("GGC") || st.equals("GGA") || st.equals("GGG")) {
        res = res + "G";
        }    else

     if(st.equals("AAU") || st.equals("AAC")) {
        res = res + "N";
        }   else

     if(st.equals("AAA") || st.equals("AAG")) {
        res = res + "K";
        }   else

     if(st.equals("GAU") || st.equals("GAC")) {
        res = res + "D";
        }   else

     if(st.equals("GAA") || st.equals("GAG")) {
        res = res + "E";
        }  else

     if(st.equals("UAA") || st.equals("UAG") || st.equals("UGA")) {
         res = res + " ";
       // break;
    }

        st = "";
        j = 0;

    }  System.out.println(res);

    } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
