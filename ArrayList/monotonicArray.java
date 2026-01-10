import java.util.ArrayList;
public class One{
    public static boolean monotonicArray(ArrayList<Integer> list){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<list.size()-1;i++){
            //increasing
            if(list.get(i)>list.get(i+1)){
                inc=false;
            }
            //decresing
            if(list.get(i)<list.get(i+1)){
                dec=false;
            }
        }
        return inc || dec ;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(1);
        System.out.println(monotonicArray(list));
    }
}