import java.util.*;
public class String_Compression{
    public static String Compress(String str){
        StringBuilder sbr=new StringBuilder("");
        int j=1;
        for(int i=0;i<str.length();i++){
            if(i==str.length()-1) {
               sbr.append(str.charAt(i));
                sbr.append(j);
            }
            else if(str.charAt(i+1)==str.charAt(i)){
                    j++;
            }  
            else{
                sbr.append(str.charAt(i));
                sbr.append(j);
                j=1;
            }
        }
        return sbr.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="aaabbbcccdeeffgg";
        System.out.println(Compress(str));
    }
}