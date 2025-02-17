public class OperatorsPractice {
    public static void main(String[] args) {
        // int x = 2;
        // int y = 5;
        // int aa= (x*y/x);
        // int bb= (x* (y/x));
        // System.out.print(aa + " ,");
        // System.out.println(bb);


        // int a = 200, b = 50, c = 100;
        // if(a>b && b>c) {
        // System.out.println("Hello");
            
        // }
        // if( c>b && c<a) {
        //     System.out.println("Java");
        // }
        // if((b+200) < a && (b+150) <c) {
        //     System.out.println("Hello Java");
        // }

        // 3rd problem 
        // int x, y, z;
        // x = y = z = 2;
        // x += y; //x = 4
        // y -= z; // x= 4, y=0, z=0; 
        // z /= (x + y);
        // System.out.println(x + " " + y + " " + z);

        //4th Problem
        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        // System.out.println(exp);

        // 5Th problem
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}
