public class BackTracking{
    public static void SubSets(String str,int i,String ans){
        //BC
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }else{
            System.out.println(ans);
            }
            return;
        }
        //Recursion
        //yes
        SubSets(str,i+1,ans+str.charAt(i));
        //no
        SubSets(str,i+1,ans);
    }
    public static void main(String args[]){
        String str="abc";
        SubSets(str,0,"");
    }
}