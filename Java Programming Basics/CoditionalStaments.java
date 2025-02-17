import java.util.*;
public class CoditionalStaments {
    public static void main(String[] args) {
        /* IN JAVA WE USE CONDITIONAL STATEMNTS TO CHECK AND PRINT THE STATEMENTS WHICH IS TRUE
         * SO WE HAVE 
         * 1) IF Else
         * 2)Else If
         * 3)Switch and Break blocks
         * 4)TERNARY OPERATOR -> WE USE WHEN IF ELSE BLOCKS ARE SHOULD NOT USE
          */
          
          Scanner sc = new Scanner (System.in);
          System.out.print("Enter Ur Age : ");
          int age = sc.nextInt();
          if (age >= 18) {
            System.out.println("Ur adult you can Vote");
          }else if(age >=13 && age <18) {
            System.out.println("Ur are Teenager");
          }else{
            System.out.println("Ur are Child");
          }
    }
    
}
