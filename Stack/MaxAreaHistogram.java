import java.util.Stack;
public class MaxAreaHistogram{
    static int MaxArea(int heights[]){
        Stack<Integer> s=new Stack<>();
        int nextSmallRight[]=new int[heights.length];
        int nextSmallLeft[]=new int[heights.length];
        //for nextSmallRight
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[i]<=heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallRight[i]=heights.length;
            }else{
                nextSmallRight[i]=s.peek();
            }
            s.push(i);
        }
        s.clear();
        //for nextSmallLeft
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[i]<=heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                
                nextSmallLeft[i]=-1;
            }else{
                nextSmallLeft[i]=s.peek();
            }
            s.push(i);
        }
        //for maxArea
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=nextSmallRight[i]-nextSmallLeft[i]-1;
            int area=height*width;
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }
    public static void main(String args[]){
        int heights[]={2,1,5,6,2,3};
        System.out.println(MaxArea(heights));
    }
}