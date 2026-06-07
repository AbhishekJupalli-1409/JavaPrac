import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        try {
            
            
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


            // Logical operators 

            // && , || 
            boolean first = true;
            boolean second = false;

            System.out.println("Result of AND operator is " + (first && second));
            System.out.println("Result of OR operator is " + (first || second));
            
            // Assignment operator

            // ans  = ans + 2;
            // * instead you can write 
            // ans += 2;

            // Bitwises operator we will be explaining later

            // Ternary operator 
            // * Condiciton ? x : y
            // if true prints x else print y

            System.out.println(10 > 2 ? "10 is the ans" : "this doesn't print");
            
            // ! ============== Strings ==========


            System.out.println("\n===========  Strings =========");
            String nameself = "Abhishek Jupalli";
            System.out.println(nameself);
            System.out.println("Lenght of the string ->" + nameself.length());
            System.out.println("printing the 3rd character -> " + nameself.charAt(2));
            System.out.println("printing the Substring character -> " + nameself.substring(2));
            System.out.println("printing the jupalli character -> " + nameself.substring(9,nameself.length()));


            String firstname = "Abhi";
            String lastname = "shek";
            firstname += " " + lastname;
            // * string are immutable in java
            // * when you do this it creates a new memory location and adds both strings and firstname points to that new location

            // * equals operator compares the strings.



            // ! =========== Input/Output ===========
            System.out.println("\n===========  Input Output =========");
            // we need to use a package call import java.util.Scanner;
            System.out.println("In order to use Scanner create a object of it");

            Scanner scanner = new Scanner(System.in);
            // * Resource leak: 'scanner' is never closedJava(536871799)
            int scannum = scanner.nextInt();// picks up the num and put it in
            System.out.println("the scanned number is -> " + scannum);
            // * after using the class clear the space so that it won't be store in the memory
            String firstName = scanner.next();
            String lastName = scanner.next();
            System.out.println("scan word by word in each variable");
            System.out.println("Combined name is --> " + firstName + " " + lastName);
            

            // ! =========== TypeCasting ===========
            System.out.println("\n===========  TypeCasting =========");
            
            int z = 10;
            double y = z;

            System.out.println("Implicit typecasting of variable z --> " + y );
            System.out.println("Lossy convertion mention explicit");
            //int x = y; //incompatible types: possible lossy conversion from double to int(errors(1): 174:9-174:19)
            int xvar = (int) y;
            System.out.println("Explicit convertion -->" + xvar);

            // ! =========== Constants ===========
            System.out.println("\n===========  Constants =========");
            // in large codebase you dont want others to change your variable then you need use the final keyword
            final int dontchange = 89;
            // dontchange = 32;
            // * The final local variable dontchange cannot be assigned. It must be blank and not using a compound assignmentJava(536870970)cannot assign a value to final variable dontchange



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
            for (int arr : arrays) {
                System.out.printf("number %d\n",arr);
            }

            System.out.println("2d arrays");
            int[][] _2darrays = {{1,2},{3,4},{5,6}};
            int[] zeroindex = _2darrays[0];
            System.out.println("Element at index 1,1 is => " + _2darrays[1][1] );



            // ! =========== Conditional Statements =========
            System.out.println("\n=========== Conditional Statements =========");
            
            // TODO : given a age print "adult" if age> 18 else child

            
            
            System.out.println("Enter your age: ");

            int age = scanner.nextInt();
            if(age>18){
                System.out.println("So yep u became Adult! Ready to face reality.");
            }
            else{
                System.out.println("You are yet a child Njoy ur little momements.");
            }
            

            /*  
                given marks of students , tell us grade he gets
                - grade A (>=90)
                - grade B (>=80 && <90)
                - grade C (>=70 && <80)
                - grade D (>=60 && <70)
                - grade E (>=35 && <60)
                - grade F (<35)
            */
            System.out.println("Please enter yout marks to get the grade :");
            int marks = scanner.nextInt();

            if(marks>=90){
                System.out.println("grade A");
            }
            else if(marks>=80 && marks <= 90){
                System.out.println("grade B");
            }
            else if(marks>=70 && marks <= 80){
                System.out.println("grade C");
            }
            else if(marks>=60 && marks <= 70){
                System.out.println("grade D");
            }
            else if(marks>=35 && marks <= 60){
                System.out.println("grade E");
            }
            if(marks>=90){
                System.out.println("Fail");
            }

            // TODO given the day number guess which day is it.

            System.out.println("give me number to guess date");
            int day = scanner.nextInt();
            // * without break statement it flow checks each case.
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednsday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Sunday");
            }



            // ! =========== Loops =========
            System.out.println("\n=========== Loops =========");
            
            System.out.println("give me number i'll print till there!!");
            int n = scanner.nextInt();
            for(int i=0;i<n;i++){
                System.out.println(i);
            }

            // given take the number input as many and then do the summation of them
            System.out.println("Number of numbers which needs summation!");
            int inputCount = scanner.nextInt();
            int[] arraysNum = new int[inputCount];

            for(int i=0;i<inputCount;i++){
                System.out.println("Enter number "+ (i+1));
                arraysNum[i] = scanner.nextInt();
            }
            System.out.println("The final array is");
            for (int i = 0; i < inputCount; i++) {
                if(i==0) System.out.print("[");
                System.out.print(arraysNum[i]);
                if( i!= (inputCount -1)) System.out.print(",");
                if(i+1==inputCount) System.out.println("]");
            }


            System.out.println("Printing using the while give number");
            n = scanner.nextInt();
            int i=0;
            while(i<n){
                System.out.println(i);
                i++;
            }


            // do while does the same thing doesn't check anything in the first iteration
            // Atleast once the loop will run


            // ! =========== Exception Handling =========
            System.out.println("\n=========== Exception Handling =========");
            
            int var1 = 10;
            int var2 = 0;
            int var3 = var1/var2;// * this is an Expection // mathematically not possible
            System.out.println(var3);


            scanner.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }

    }
}