public class ArrayQueue{
    static class Queue{
        static int size;
        static int rear=-1;
        static int arr[];
        Queue (int n){
            size=n;
            arr=new int[n];
        }
        static boolean isEmpty(){
            return rear==-1;
        }
        static void enqueue(int data){
            if(rear==size-1){
                System.out.println("Excedding size");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        static int dequeue(){
            if(rear==-1){
                System.out.println("Empty Queue");
                return -1;
            }
            int front=arr[0];
            rear=rear-1;
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];    
            }
            return front;
        }
        static int peek(){
            if(rear==-1){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }    

    }
    public static void main(String args[]){
       Queue q=new Queue(5);
       q.enqueue(1);
       q.enqueue(2);
       q.enqueue(3);
       q.enqueue(4);
       while(!q.isEmpty()){
        System.out.println(q.peek()+" ");
        q.dequeue();
       } 
    }
}