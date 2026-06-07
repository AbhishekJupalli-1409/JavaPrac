// import java.util.ArrayList;
// import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args){
        
        // ! =========== Arrays =========
        System.out.println("\n=========== Arrays =========");
        // simple container to store multiple values in a single variable;
        System.out.println("simple container to store multiple values in a single variable; can store a single data type\n");
        int[] arrays =new int[]{10,20,30,40};// contagious
        int[] arrays2 = {10,20,30,40};// contagious // shorted hand cnversion
        System.out.println("third element in the array --> " + arrays[2]);

        System.out.println("this trows run time error, access out of scope memory --> arrays[10] " );
        // * the below code is for the dynamic array above arrays cant be mutated;
        // ArrayList<Integer> array = new ArrayList<>(Arrays.asList(10, 30, 30, 40));
        System.out.println("Printing for loop");
        for (int num : arrays) {
            System.out.printf("number %d\n",num);
        }

        System.out.println("2d arrays");
        int[][] _2darrays = {{1,2},{3,4},{5,6}};
        int[] zeroindex = _2darrays[0];
        System.out.println("Element at index 1,1 is => " + _2darrays[1][1] );



        
        



        
    }    
}
