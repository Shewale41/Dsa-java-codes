class multiplyTwoNum{
    public static int mul(int a,int b){
        if(a==0) return 0;
        if(a<0) return mul(a+1,b)-b;
        return mul(a-1,b)+b;
    }
    public static void main(String args[]){
        System.out.println(mul(-2,-2));
    }
}