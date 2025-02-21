public class DecimalToBinary {
    public static int decimaltobinary (int n){
             int bina = 0;
             int pow=0;
             int remainder =0;
             while(n>0){
                remainder =n%2;
                bina =bina+(remainder*(int)Math.pow(10, pow));
                pow++;
                n=n/2;
             }
            return bina;
    }
    public static void main(String[] args) {
        System.out.println(decimaltobinary(7));
    }
}
