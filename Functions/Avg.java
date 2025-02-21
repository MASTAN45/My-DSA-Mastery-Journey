public class Avg {
    public static int avgnum (int a, int b, int c){
        int n= 3;
        int avg = (a+b+c)/n;// here parenthesis if not then based on precedence order / will be calulate first so parenthesis IMP
        return avg;

    }
    public static void main(String[] args) {
        System.out.println("Avg Of 3 Numbers : "+avgnum(3,3,3));
    }
}
