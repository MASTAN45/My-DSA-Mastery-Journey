public class PrimeOrNot {
    public static boolean primecheck(int n){
        boolean isprime = true;
        if(n==2){
            return true;
        }
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }

    public static void primsRange(int n){
        for(int i =2; i<=n; i++){
            if(primecheck(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        //System.out.println(primecheck(3));
        primsRange(100);
    }
}
