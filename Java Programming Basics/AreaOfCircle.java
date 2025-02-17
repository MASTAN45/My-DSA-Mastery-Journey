import java.util.*;
public class AreaOfCircle {
    public static void main(String args []) {
        // formula Pi * Rsquare
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f; // if we ignore f we get error becos it atomatically takes as Double it leads to lossy conversion
        System.out.print("Enter Radius Value: ");
        float r = sc.nextInt(); // inpiut r can be take a int no isue with it
        float ans = pi * r*r;
        System.out.println(ans);
    }
    
}
