public class StarPattern {
    public static void main(String[] args) {

        // for(int i =1; i<=4;i++){ // here we can change no. of lines to print stars
        //     for(int j=1;j<=i;j++){   // STAR PATTERN
        //         System.out.print("*"); // HERE SHOULDNOT USE PRINTLN "ln"
        //     }
        //     System.out.println(); 
            /* *
               **  
               *** 
               **** */

               // NOW WE RAE GONNA DO "INVERTED" STAR PATTERN 
               int n = 4;
               for(int i = 1; i<=n; i++){
                for(int j=1; j<=n-i+1; j++){
                    System.out.print("*");
                }
                System.out.println();
               }
        //}
    }
}
