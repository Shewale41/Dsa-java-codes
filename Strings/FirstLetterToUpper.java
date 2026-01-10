import java.util.*;
public class FirstLetterToUpper{
    public static String toUpper(String str){
        StringBuilder sbr=new StringBuilder();
        char temp=Character.toUpperCase(str.charAt(0));
        sbr.append(temp);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sbr.append(str.charAt(i));
                i++;
                sbr.append(Character.toUpperCase(str.charAt(i)));
                
            }else{
                sbr.append(str.charAt(i));
            }
        }
        return sbr.toString();

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="hi i am only ruupesh radhe human a";
        System.out.println(toUpper(str));
        }
    }
