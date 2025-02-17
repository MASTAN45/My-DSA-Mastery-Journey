import java.util.*;
public class TypeConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        float b = a; // here Type Conversion Happens output .0 will added
        // NOTE : Destination Type (b) > Source Type(a)
        System.out.println(b);
    }
}
