public class BinaryToDecimal {
      public static int binDeci(int n){
        int last_d = 0;
        int pow =0;
        int decimal =0;
        while(n>0){
            last_d = n%10;
            decimal = decimal+(last_d*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        return decimal;

      }  
      public static void main(String[] args) {
          System.out.println(binDeci(111));
      }
}
