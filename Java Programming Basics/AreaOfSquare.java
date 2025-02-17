
import java.util.Scanner;

public class AreaOfSquare { //Area of a square = Side × Side = S^2 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side of Square: ");
        int Side = sc.nextInt();
        int AreaOfSquare = Side * Side;
        System.out.println("Area of a square = " + AreaOfSquare );
        sc.close();
    }
    
}
