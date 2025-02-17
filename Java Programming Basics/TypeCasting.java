import java.util.*;
public class TypeCasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ur CGPA: ");
        float grade = sc.nextFloat();
        int ans = (int)(grade); // here type casting(explicit converion) happend here we lost some IMP data after .
        System.out.println(ans);
    }
    
}
