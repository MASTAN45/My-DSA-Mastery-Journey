public class LogicalOperators {
   public static void main(String args[]) {
     /* in Java We have 3 Types of Logical Operators are 
      * 1) Logical And -> &&
        2) Logical OR  -> ||
        3) Logical Not -> !
      */
      
      //Logical And && -> IF BOTH STMS TRUE THEN OUTPUT TRUE OTHERWISE FALSE
      System.out.println((0<1) && (100>99));
      System.out.println((10>100) && (50 < 99));

      //LOGICAL OR (||)-> IF ANY 1 OR 2 STMS ARE TRUE THEN OUTPUT TRUE
      System.out.println((45>35) || (77<17));
      System.out.println((12<22) || (1>0));

      // LOGICAL NOT (!)-> BY ADDING ! IT WILL CONVERT TRUE TO FALSE AND FALSE TO TRUE

      System.out.println(!(100>0));
      System.out.println(!(0<1));
   } 
}
