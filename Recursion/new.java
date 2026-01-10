class Solution{
    public static class Result{
        int value;
        int index;
        Result(int value,int index){
            this.value=value;
            this.index=index;
        }
    }
    public static Result getMax(int idx,int list[]){
        if(idx==list.length) return new Result(Integer.MIN_VALUE,-1);
        Result bestResult=(getMax(idx+1, list));
        if(list[idx]>bestResult.value){
            return new Result(list[idx],idx);
        }
        return bestResult;
    }
    public static void main(String[] args) {
        int list[] = {1, 3, -4, 4, -2};
        Result result = getMax(0, list);
        System.out.println("Max value: " + result.value + ", Index: " + result.index);
    }
}