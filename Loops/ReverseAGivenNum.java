import java.util.*;

public class ReverseAGivenNum {
    public static void main(String[] args) {
        System.out.println("Enter a num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0;
        while(num>0){
            int lastdigit = num%10;
            rev =(rev*10) +lastdigit;
            num = num/10;
        }System.err.println(rev); // we are storing the reversed num for futher use
    }
    
}
