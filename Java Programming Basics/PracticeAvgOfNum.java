import java.util.*;
public class PracticeAvgOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the Total No.s to input: ");
        int N =sc.nextInt();
        System.out.print("Enter the Value Of A : ");
        int A = sc.nextInt();
        System.out.print("Enter the Value Of B : ");
        int B = sc.nextInt();
        System.out.print("Enter the Value Of C : ");
        int C = sc.nextInt();

        int Avg = (A+B+C)/N;
        System.out.println("The Avg Of A,B,C " +Avg);
        
        sc.close();
    }
    
}
