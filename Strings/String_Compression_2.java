import java.util.*;
public class one{
    public static String Compress(String str){
        StringBuilder sbr=new StringBuilder();
        for(int i=0;i<str.length();i++){
            int count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sbr.append(str.charAt(i));
            if(count>1){
                sbr.append(count);
            }
        }
        return sbr.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="aaabbbcccdeeffg";
        System.out.println(Compress(str));
    }
}