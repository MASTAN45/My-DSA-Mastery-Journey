
import java.util.*;

public class LargestOfThreeNum {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.print("Enter A :");
       int A = sc.nextInt();
       System.out.print("Enter B :");
       int B = sc.nextInt();
       System.out.print("Enter C :");
       int C = sc.nextInt();

       if(A>=B && A>= C){
        System.out.println("A is Larger");
       } else if(B>= C){
        System.out.println("B i Larger");
       }
       else {
        System.out.println("C is Larger");
       }

    }
}
