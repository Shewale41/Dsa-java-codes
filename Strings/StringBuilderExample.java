import java.util.*;
public class StringBuilderExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder("hey ");
        for(char ch='a';ch<='z';ch++){
            str.append(ch);
        }
        System.out.println(str);

    }
}