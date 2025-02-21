public class productOfAandB {
    public static int productAandB(int a ,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[]args){
        int a =10;
        int b=50;
        int prod=productAandB(50,10);
        System.out.println("Product Of "+a+" and "+b+ "= "+prod);
    }
}