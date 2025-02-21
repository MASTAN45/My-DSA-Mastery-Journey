public class syntaxOfFunctions{

         //Write a function to print Mastan 100 times
        // Accesmodifier|Return Type| Fun() name (parameters)

         public static  void printMastan(){ //-> Fun() Defination
            for(int i=0; i<=100; i++){
                System.out.println("Mastan");
            }

         }

         // Create fun() that print Remainder(modulo) of two nums

         public static int remainderOfTwoNum(int a, int b){
            int remainder = a%b;
            return remainder;
         }
    public static void main(String[] args) {
        //int a = 10; 
        //int b =3;
        //System.out.println("Remainder Of "+a +" and " + b +" = " +remainderOfTwoNum(a,b));
        System.out.println(remainderOfTwoNum(10,4));// arguements
        //printMastan(); //-> Fun() Caling
        //System.out.print("Mastan Printed 100 times Successfully Completed");

        
    }
}