import java.util.ArrayList;
public class One{
    public static int mostWater(ArrayList<Integer> list){
        int lp=0;
        int rp=list.size()-1;
        int maxwt=0;
        while(lp<rp){
            int height=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int currwt=height*width;
            maxwt=Math.max(currwt,maxwt);
            if(list.get(lp)<list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwt;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

    System.out.println(mostWater(list));    

    }
}