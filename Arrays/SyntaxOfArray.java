public class SyntaxOfArray {
    public static void array(int marks[]){
        for(int i =0 ; i< marks.length; i++){
        marks [i] += 1;
        //Scanner sc = new Scanner(System.in)
            
        }

    }
    public static void main (String [] args){
        int marks [] = {98, 97, 98};
        array(marks);
        for(int i=0 ;i<marks.length; i++){
            marks[i]+=1;
            System.out.println(marks[i]);
        }
    }
}