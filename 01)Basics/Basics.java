public class Basics {
    public static void main(String[] args) {
        
        // ! =========== Basic Hello World =========
        System.out.println("\n=========== Basiic Hello wolld =========");
        
        System.out.println("Hello World");

        // ! ============= Comments ==============
        System.out.println("\n=========== Comments =========");
        // this is the comment
        /* multiline comment
        this line is skipped in the execution */




        // ! ============ Date types =============
        System.out.println("\n=========== Date types =========");



        // Byte
        byte num = 100;//occupies 8 bits
        System.out.println(num);

        // short
        // -32,768 to 32767
        short num2 = 200;//occupies 16 bits
        System.out.println(num2);

        // int
        // Mostly used datatype
        // -2^31 to 2^31 =1 =~ 10^8
        int num3 = 300;//occupies 32 bits 
        System.out.println(num3);

        //  Long 
        // -2^63 to 2^64
        long num4 = 400;//occupies 64 bits 
        System.out.println(num4);       
        
        float num5 = 10.22f; // 6-7 decimal places 32 bits
        System.out.println(num5);

        double num6 = 10.22; // 15 decimal places // 64 bits
        System.out.println(num6);

        char character = 'c';
        System.out.println(character);

        boolean test = true;
        System.out.println(test);




        // ! ======== Operators ==========
        System.out.println("\n===========  Operators =========");

        // +,-,/,*,%

        int number1 = 3;
        int number2 = 4;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);
        System.out.println(number1%number2);


        // Unary operators 
        // +,-,++,--,!

        int nums1 = 6;
        int nums2 = -nums1;
        System.out.println(nums2);

        boolean notoperator = true;
        boolean notoperator2 = !notoperator;
        System.out.println(notoperator2); // flips the operator;

        // ? ++num and num++ whats the difference ?

        nums1 = 8;
        nums2 = ++nums1;// pre increment
        // *  i'll increment before so 9;
        System.out.println("\nPre Increment");
        System.out.println(nums2);// print 9


        nums1 = 8;
        nums2 = nums1++;// Post increment
        // * still 6, after this i'll increment;
        System.out.println("\nPost Increment");
        System.out.println(nums2);// print 8
        
        // same goes with negative also;

        // Relational operators
        //  ==, != , < , > , >= , <=


        














    }
}