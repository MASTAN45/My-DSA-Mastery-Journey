public class OperatorPrecedence {
    public static void main(String[] args) {
        /* THE OPERATOR PRECEDENCE WILL BE REMEMBER BY 'BODMASRLA' 
         * B: Brackets (Parentheses () in programming)
              Solve anything inside brackets first.
           O: Orders (Exponents or Powers ^, ** in programming)
             Evaluate powers or roots next.
           D: Division /
              Perform division.
           M: Multiplication *
              Perform multiplication (along with division, evaluated left to right).
           A: Addition +
              Perform addition.
           S: Subtraction -
              Perform subtraction (along with addition, evaluated left to right).
           R: Relational (<, >, ==)
           L: Logical (&&, ||)
           A: Assignments (=)
        */
        
        // int result = (10 + 5) * 2 > 20 || (8/4) == 2 && 1 > 0;
        // System.out.println(result); gives error boolean cant convert into int so change into boolean
        boolean result = (10 + 5) * 2 > 20 || (8 / 4) == 2 && 1 > 0;
        System.out.println("Result: " + result);
        
    }
}
