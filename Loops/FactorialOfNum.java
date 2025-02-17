import java.util.*;
public class FactorialOfNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int fact = 1;                  // USING ITERATIVE APPROACH
        for(int i =1; i<=n; i++){

           fact= fact*i;
           
        } System.out.print(fact);
    }
    
}
