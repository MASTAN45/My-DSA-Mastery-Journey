public class InvertedHalfPyramid {
    public static void halfpyramid(int n){
        //outerloop
       for(int i =1; i<=n; i++){
          for(int j =1; j<=n+i-5; j++){
            System.out.print(j);
          }
          System.out.println();
       }
    }
    public static void main(String[] args) {
        halfpyramid(5);
    }
}
