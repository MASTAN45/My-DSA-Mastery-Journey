public class FunctionOverloading {
    // to create multiple functions with same name but different parameters

    // 1)with type of parameters
    // 2) with No. of parameters
    public static int multiply(int a, int b){
        int multi =a*b;
        return multi;
    }
    public static float multiply(float a, float b){
        float multiply = a*b;
        return multiply;
    }
    public static int multiply(int a, int b, int c){
        int mul=a*b*c;
        return mul;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5,5));
        System.out.println(multiply(5.5f,5.5f));
        System.out.println(multiply(5,5,5));
    }
}
