public class callbyvalue {
    public static int byValue(int a){
            a =45;
        return a;
    }
    public static void main(String[] args) {
        int a=18;// its just copy of original value 
        System.out.println(a); // call by Value
        System.out.print(byValue(a));// input a argument
    }
    
}

      /* Parameter : in fun() Defination
         Argument : During the Fun() CAll
         */