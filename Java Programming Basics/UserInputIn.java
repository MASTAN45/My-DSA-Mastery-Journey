import java.sql.ShardingKey;
import java.util.*;
 public class UserInputIn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ur 1St Name: ");
        String a = sc.nextLine();
        System.out.print("Enter Ur Last Name :");
        String b = sc.nextLine();
        String c = a+" "+b;
        System.out.println("Hey "+ c+ " Welcome to top 1% Club ");

        System.out.print("Enter 1st No. : ");
        int one = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int two = sc.nextInt();
        int sum = one + two;
        System.out.println(sum);
        sc.close();
    }
 }