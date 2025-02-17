
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = sc.nextInt();
        System.out.print("Enter B: ");
        int B = sc.nextInt();
        System.out.println("Choose Operator + , - , * , / , % : " );
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(A+B);
                      break;
            case '-' : System.out.println(A-B);
                      break;
            case '*' : System.out.println(A*B);
                      break;
            case '/' : System.out.println(A/B);
                      break;
            case '%' : System.out.println(A%B);
                      break;
        default : System.out.println("Enter Correct Operator");
                      break;

        } sc.close();
    }
}
