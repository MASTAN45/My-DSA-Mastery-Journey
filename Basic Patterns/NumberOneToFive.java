public class NumberOneToFive {
    public static void onetofive(int n){
        // for(int i=1; i<=n; i++){
        //     System.out.println(i);
        // }
        int count =0;
        // for(int i =1; i<=n; i++){
        //     if((i%2)!=0){
        //         System.out.println(i);
        //     }
        // }
        for(int i=1; i<=n;i++){
            count+=i;
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        onetofive(10);
    }
}
