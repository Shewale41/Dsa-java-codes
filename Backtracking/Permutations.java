public class BackTracking{
    public static void Permutations(String str,String ans){
        //Bc
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde" "ab"+"de" ="abde"
            String NewString=str.substring(0,i)+str.substring(i+1);
            Permutations(NewString,ans+curr);
        }
    }
    public static void main(String args[]){
        String str="abc";
        Permutations(str,"");
    }
}