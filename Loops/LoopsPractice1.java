public class LoopsPractice1 {
    public static void main(String[] args) {
        //for(int i=0;i<5;i++) {
            // System.out.println("Hello");
            // i+=2; // Here 2 times Hello will be printed.\
            //int i =0;
            for(i=0; i<=5; i++ ) {
                System.out.println("i = "+ i);//here we will get the error becoz the scope of the variable i just refered in part of loop that cant be used if & only if we declare it before loop
            }
            System.out.println("i after the loop = "+ i ); 
    }
}
