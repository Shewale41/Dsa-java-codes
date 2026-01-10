import java.util.*;
public class Switch{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your choice");
    int number=sc.nextInt();
    switch(number){
        case 1:System.out.println("samosa");
                break;
        case 2:System.out.println("parotha");
                break;
        default:System.out.println("wrong enter");
    }
    }
}