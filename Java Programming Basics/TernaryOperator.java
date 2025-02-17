public class TernaryOperator {
    public static void main(String args[]){
        /* IN JAVA WE USE TERNARY IN THE PLACE OF IF ELSE BLOCKS  */
        
        // VARIABLE = CONDITION ? STATEMENT 1 : STATEMENT2;

          int marks = 35;
        String result = marks >= 35 ? "Pass" : "Fail";
        System.out.println(result);
        int num = 4;
        String status = num%2==0 ? "Even" : "Odd";
        System.out.println(status);
    }
    
}
