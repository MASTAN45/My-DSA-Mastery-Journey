
import java.util.Scanner;

public class ConditionalStatementsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Pls enter your temparature value : ");
        // double tem = sc.nextDouble();
        // if (tem>=100) {
        //     System.out.println("You Have Fever Please Take Medicine in time");
        // }else {
        //     System.out.println("Ur Temparature is Normal You Dont Have Fever");
        // }

        // int a=63,b=36;
        // boolean x= (a<b)?true:false;
        // int y= (a>b)?a:b;
        // System.out.println(x);// false
        // System.out.println(y);// 63
        System.out.print("Enter num (1-7) : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 : System.out.println("Monday");
                     break;
            case 2 : System.out.println("Tue");
            break;
            case 3 : System.out.println("Wed");
            break;
            case 4 : System.out.println("Thus");
            break;
            case 5 : System.out.println("Fri");
            break;
            case 6 : System.out.println("Sat");
            break;
            case 7 :System.out.println("Sunday");
            break;
        default:System.out.println("please Enter num between 1-7");
        }
    }
}
