public class UnaryOperators {
    public static void main(String[] args) {
    /* we have 2 types of Unary operators are 
     * 1)Increment -> Pre-Increment and Post-Increment
     * 
     * 2) Decrement -> Pre-Increment and Post-Increment
     */
    
     // Pre Increment
    int a = 45;
    int b = ++a; // -> a = a+1
    System.out.println(a); //46
    System.out.println(b); //46

    // Post Increment
    int c = 45;
    int d = c++; // -> a = a+1
    System.out.println(c); //46
    System.out.println(d); //45

    // Pre Decrement 
    int e = 45;
    int f = --e; // -> a = a+1
    System.out.println(e); //44
    System.out.println(f); //44

    // Post decrement 
    int g = 45;
    int h = g--; // -> a = a+1
    System.out.println(g); //44
    System.out.println(h); //45
    }
}
