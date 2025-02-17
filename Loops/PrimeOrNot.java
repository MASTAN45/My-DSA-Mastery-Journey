import java.util.*;
public class PrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        boolean isprime = true;
        if(n==2) {
            isprime=true;
        } else {
            for(int i=2; i<=Math.sqrt(n); i++){ // here we are optimizing yhe program by changing n-1 to math.sqrt(n) inorder to decrease time and space complexity 
                if(n%i==0){
                    isprime=false;
                }
            }
            

        } if(isprime==true){
            System.out.println("Its a Prime Number ");
        }else {
            System.out.println("It not a prime Number");
        }

    }
}
