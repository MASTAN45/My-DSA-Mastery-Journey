import java.util.Scanner;

public class SumOfNNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num : ");
        int n = sc.nextInt();
        int sum = 0;
        int Counter = 1;
        while(Counter<=n){
            sum = sum+Counter;
            Counter++;
        } System.out.print("Sum Of Numbers: "+sum);
        System.out.println("");
    }
    
}
