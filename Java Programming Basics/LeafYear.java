import java.util.*;

public class LeafYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which Year U Born or Entera Random Year : ");
        int Year = sc.nextInt();
        if(Year%4==0 && Year%100!=0 || Year%400==0){
            System.out.println("Wow Its a Leaf Year");
        }else {
            System.out.println("Its not a leafYear");
            
        }
    }
    
}
