// import java.util.ArrayList;
// import java.util.Arrays;



public class Arrays1 {
    public static void main(String[] args){
        try {
            int var1 = 10;
            int var2 = 0;
            // * in the below step the program breaks so in order to handle it exception handling has been made.
            int var3 = var1/var2;// * this is an Expection // mathematically not possible
            System.out.println(var3);
            
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }    
}
