class Solution{
    public static boolean isPdrme(int first,int last,String s){
        if(first>=last){
            return true;
        }
        if(s.charAt(first)!=s.charAt(last)){
            return false;
        }
        return isPdrme(first+1, last-1, s);
    }
    public static void main(String[] args) {
        String s="raceca";
        System.out.println(isPdrme(0,s.length()-1, s));
    }
}