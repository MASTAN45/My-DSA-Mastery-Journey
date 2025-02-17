import java.util.*;
public class BreakStatement {
    public static void main(String[] args) {
        // break -> To Exit from the loop
        //Keep entering numbers till users a Multiple Of 10
        Scanner sc = new Scanner(System.in);
        do {
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
            if(num%10==0){
                break; // here if want to skip then "continue Statement at same place"
            }
            System.out.println("Ur No. Was: "+num);
        } while(true);   
    }
}
