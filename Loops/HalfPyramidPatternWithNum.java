public class HalfPyramidPatternWithNum {
    public static void main(String[] args) {
        int n= 4;
        for(int i =1; i<=n; i++){
            for(int num = 1; num<=i; num++ ){
                System.out.print(num);   /* 1
                                            12
                                            123
                                            1234 */
            }
            System.out.println();
        }
    }
    
}
