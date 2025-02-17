import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur yearly Income: ");
        int income = sc.nextInt();
        int tax;// here java assign 0 for int
        /* TAX LESS THAN 5L = 0
         * BETWEEN 5 - 10L = 20%
         * MORE THAN 10L   = 30%
         */
        if(income<500000){
            tax = 0;
            System.out.println("U dont need to pay any tax ");
        } else if(income>= 500000 && income <= 1000000){
            tax = (int)(income*0.2);
            System.out.println("U should pay tax :" + tax);
        } else {
            tax = (int)(income*0.3);
            
        }
        System.out.println("Ur tax amount is: "+tax);
    }
    
}
