import java.util.*;
public class WhileLoopPractice {
    public static void main(String[] args) {
        // Print 1 - N num. by user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n= sc.nextInt();
        int num = 1;
        while(num<=n){
            System.out.print(num + " ");// remember
            num++; // Remember
        }
        System.err.println();
        System.out.println("Done");
    }
    
}
