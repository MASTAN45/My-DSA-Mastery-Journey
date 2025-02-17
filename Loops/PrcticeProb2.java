import java.util.*;
public class PrcticeProb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter a num: ");
        // int number = sc.nextInt();
        // int sumeven=0;
        // int sumodd= 0;
        //     if(number%2 ==0){
        //         sumeven = sumeven+number; 
        //     } else {
        //         sumodd = sumodd+number;
        //     }
        //  System.out.println("SUMEVEN :"+sumeven);
        // System.out.println("SUMODD: "+sumodd);

        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.print("Enter the number : ");
            number=sc.nextInt();
        if(number%2==0) {
            evenSum+=number;
        }else{
            oddSum+=number;
        }
        System.out.print("Do you want to continue? Press1 for yes or 0 for no");
        choice=sc.nextInt();
    }while(choice==1);
    System.out.println("SUMEVEN :"+evenSum);
    System.out.println("SUMODD: "+oddSum);
    }
    
}
