public class Recursion{
    public static void removeDup(String arr,int index,StringBuilder newStr,boolean map[]){
        //BC
        if(index==arr.length()){
            System.out.println(newStr);
            return;
        }
        char ch=arr.charAt(index);
        //if present
        if(map[ch-'a']==true){
            removeDup(arr,index+1,newStr,map);
        }else{
            map[ch-'a']=true;
            removeDup(arr,index+1,newStr.append(ch),map);
        }
    }
    public static void main(String args[]){
        String arr="lolomellojello";
        removeDup(arr,0,new StringBuilder(""),new boolean [25]);
    }
}