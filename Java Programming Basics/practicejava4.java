public class practicejava4 {
    public static void main(String[] args) {
        byte b = 4;
        short s =512;
        int i =1000;
        float f = 3.14f;
        char c = 'a';
        double d= 99.9954;
        double result = (f*b) + (i%c) - (d*s);
        System.out.println(result); //In the mentioned code, the result variable will be of 'double' type because oftype conversion

    }
}
