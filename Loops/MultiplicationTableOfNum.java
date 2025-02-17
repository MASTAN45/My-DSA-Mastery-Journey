import java.util.*;
public class MultiplicationTableOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num For Multiplication Table: ");
        int n = sc.nextInt();
        int table=0;
        int i =0; 
        for(i =0; i<=10; i++){
            table= n*i;
        
        System.out.println(n + " * " + i + " = " + table);
        }
    }
    
}
