public class CharPattern {
    public static void main(String[] args) {
        int n= 4;
        char ch ='A';
        for(int i =1; i<=n; i++){
            for(int chars =1; chars<=i; chars++){ // here chars we can take anything
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
