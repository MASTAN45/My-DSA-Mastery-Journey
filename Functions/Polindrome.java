public class Polindrome {

public static void pol(int n){
    int original = n;
    int result = 0;
    while(n>0){
        int last = n%10;
        result = result * 10 + last;
        n= n/10;
    } 
    if(result ==original){
        System.out.println("Its a Polindrome No.");
    } else {
        System.out.println("Its Not a Polindrome num");
    }

}
public static void main(String args[]){
 pol(121);
 pol(22010);
}
}
