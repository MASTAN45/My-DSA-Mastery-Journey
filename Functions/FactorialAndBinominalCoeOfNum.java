public class FactorialAndBinominalCoeOfNum {
    public static int factorial(int n){
        int myno=n;
        int fact=1;
        for(int i =1; i<=n; i++){
            fact= fact*i;
        }
        return fact;
    }
    
    // binoCoefficiant = n!/r!(n-r)!
    
    public static int binoCoe(int n, int r){

        int r_fact = factorial(r);
        int n_fact= factorial(n);
        int rmn_fact =factorial(n-r);
        int binocoe = n_fact/ (r_fact*rmn_fact);
        return binocoe;

    }
    public static void main(String[] args) {
    
        //System.out.println("Factorial = "+factorial(4));
        System.out.println("BinominalCoeff = "+binoCoe(5,2));
    }
    
}
