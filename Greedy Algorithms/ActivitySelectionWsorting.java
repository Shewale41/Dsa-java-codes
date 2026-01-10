//this algortihm is important and shows the sorting part as well
//if the end time is not sorted or given is sorted on the start time
import java.util.*;
class Solution{
static int MaxActivity(int start[],int end[]){
    int activities [][]=new int[start.length][3];
    for (int i =0;  i < start.length; i++){
        activities[i][0]=i;
        activities[i][1]=start[i];
        activities[i][2]=end[i];
    }
    //sorting on the end time basis
    Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));
        
        int maxAct=0;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(activities[0][0]);
        maxAct++;
        int lastActET=activities[0][2];
        for (int i = 1; i < start.length; i++) {
            if(activities[i][1]>=lastActET){
                list.add(activities[i][0]);
                lastActET=activities[i][2];
                maxAct++;
            }
        }
        for(int num:list){
            System.out.print("A"+num+" ");
        }
        System.out.println();
        return maxAct;
    }
    public static void main(String[] args) {
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};
        int total=MaxActivity(start, end);
        System.out.println("Max Activities ->"+total);
    }
} 
