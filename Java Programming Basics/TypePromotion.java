import java.util.*;
public class TypePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = 'a'; // ascii value of a= 97 and A = 65
        short b = 12;
        System.out.println(a-b);// java automatically promote or convert the types(char, short, byte) into lorger one (int)

        float f = 3.14f;
        long l = 768565;
        System.out.println(f+l);//java automatically promote or convert the types(int, float, long) into lorger one (Double)
    }
}