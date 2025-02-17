import java.util.*;
public class PoitiveOrNegativeNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        if (num>0) {
            System.out.println("It is a Positive Num");
        } else {
            System.out.println("It is a Negative Num");
        }

    }
}
