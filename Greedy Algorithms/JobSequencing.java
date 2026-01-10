import java.util.*;
class Solution{
    static class Job{
        int id;
        int profit;
        int deadline;
        public Job(int i,int p,int d){
            id=i;
            profit=p;
            deadline=d;
        }
    }
        public static void main(String args[]){
            int jobsInfo[][]={{4,20},{2,10},{1,40},{1,30}};
            ArrayList<Job> jobs=new ArrayList<>();
            for(int i=0;i<jobsInfo.length;i++){
                jobs.add(new Job(i,jobsInfo[i][1],jobsInfo[i][0]));
            }
            //sorting 
            Collections.sort(jobs, (obj1,obj2)->obj2.profit-obj1.profit);//descending order (for ascending do obj1-obj2)
            int time=0;
            ArrayList<Integer> seq =new ArrayList<>();
            for(int i=0;i<jobs.size();i++){
                Job curr=jobs.get(i);
                if(curr.deadline>time){
                    seq.add(curr.id);
                    time++;
                }
            }
            //print answer
            System.out.println("Total jobs done :"+seq.size());
            for(int i=0;i<seq.size();i++){
                System.out.print(seq.get(i)+" ");
            }
    }
}