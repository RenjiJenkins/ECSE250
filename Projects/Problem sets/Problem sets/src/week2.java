import java.util.Scanner;

public class week2{
    public void problem3_1(){
        /*(Algebra: solve quadratic equations) The two roots of a quadratic equationax2 + bx + c = 0 can be obtained using the following formula:r1 = -b + 2b2 - 4ac2a and r2 = -b - 2b2 - 4ac2a
b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots.”
Note you can use Math.pow(x, 0.5) to compute 2x. Here are some sample
runs: */
        

        Scanner s = new Scanner(System.in);
        System.out.println("Write values for a, b, and c respectively.");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        double discriminant = Math.pow(b,2) - 4*a*c;

        if(discriminant > 0){
            double r1 = (-b + Math.pow((Math.pow(b,2) - 4*a*c),0.5d))/(2*a); 
            double r2 = (-b - Math.pow((Math.pow(b,2) - 4*a*c),0.5d))/(2*a); 

        }else if(discriminant == 0){
            //what to do to show the real root and not the non-real one (and lead to a logic error)?
        }else{
            System.out.println("The equation has no real roots.");
        }
    }
    public void problem3_4(){
        /*(Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month names January, February, . . . , December
for the numbers 1, 2, . . . , 12, accordingly. */
        // we haven't seen the random function?
    }
    public void problem3_26(){
        /*(Use the &&, ||, and ^ operators) Write a program that prompts the user to
enter an integer and determines whether it is divisible by 5 and 6, whether it is
divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both. */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        float num = s.nextFloat();
        if(num % 5 == 0 && num % 6 == 0){
            System.out.println("Divisible by 5 AND 6.");
        }else if(num % 5 ==0 || num % 6==0){
            System.out.println("Divisible by 5 OR 6.");
        }else if(num % 5==0 ^ num%6==0){
            System.out.println("Divisible by 5 XOR 6.");
        }
    }
    public void problem3_28(){
        /*(Geometry: two rectangles) Write a program that prompts the user to enter the
center x-, y-coordinates, width, and height of two rectangles and determines
whether the second rectangle is inside the first or overlaps with the first, as
shown in Figure 3.9. Test your program to cover all cases. */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x,y,width and height of two rectangles");
        float x1 = s.nextFloat();
        float y1 = s.nextFloat();
        float width1 = s.nextFloat();
        float heigth1 = s.nextFloat();
        float x2 = s.nextFloat();
        float y2 = s.nextFloat();
        float width2 = s.nextFloat();
        float heigth2 = s.nextFloat();

        //Not sure how to continue in 2d... problem visualizing it
    }
    public void problem4_8(){
        /*(Find the character of an ASCII code) Write a program that receives an ASCII code
(an integer between 0 and 127) and displays its character. */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an ASCII Code");
        char ascii = (char) s.nextInt();
        System.out.println("The character is " + ascii);
    }
    public void problem4_25(){
        /*(Generate vehicle plate numbers) Assume that a vehicle plate number consists
of three uppercase letters followed by four digits. Write a program to generate a
plate number. */
        Scanner s = new Scanner(System.in);
        //I'm guessing using the ascii table to check for chars in number and letters intervals.
    }
    public void problem6_2(){
        /*(Sum the digits in an integer) Write a method that computes the sum of the digits
in an integer. Use the following method header:public static int sumDigits(long n)For example, sumDigits(234) returns 9 (= 2 + 3 + 4). (Hint: Use the % operator to extract digits and the / operator to remove the extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use234 / 10 (= 23). Use a loop to repeatedly extract and remove the digit until
all the digits are extracted. Write a test program that prompts the user to enter an
integer then displays the sum of all its digits. */ 
        //check notes in sumDigits.
    }
    /*public static int sumDigits (long n){
        //what if n is abnormally large? how to check for all digits even with modulo?
    }*/
    public void problem6_3(){
        /*(Palindrome integer) Write the methods with the following headers:// Return the reversal of an integer, e.g., reverse(456) returns 654public static int reverse(int number)
// Return true if number is a palindromepublic static boolean isPalindrome(int number)Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome. */
            //public static int reverse(int number);
            //public static boolean isPalindrome(int number); //why is there an error, I've tried brackets and semi-colons but I'm unfamiliar with this...
    }

    public void problem6_8(){
        //check onenote 
       //// public static double celsiusToFahrenheit(double celsius)

       // public static double fahrenheitToCelsius(double fahrenheit) //idem problem

        
    }
    public void problem6_22(){
        /*Write a test program that prompts the user to enter a positive double value and
displays its square root. */
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value");
        double value = s.nextDouble();
        System.out.println("The square root of " + value + " is " + Math.pow(value, 0.5));
    }
    public void problem6_25(){
        /*(Convert milliseconds to hours, minutes, and seconds) Write a method that converts milliseconds to hours, minutes, and seconds using the following header:public static String convertMillis(long millis)The method returns a string as hours:minutes:seconds. For example, convertMillis(5500) returns a string 0:0:5, convertMillis(100000)returns a string 0:1:40, and convertMillis(555550000) returns a string154:19:10. Write a test program that prompts the user to enter a long integer
for milliseconds and displays a string in the format of hours:minutes:seconds. */
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a long value");
        
        System.out.println(convertMillis(s.nextLong()));
        
    }
    public static String convertMillis(long millis){
            double hours = millis/(3.6*Math.pow(10,6));
            double mins = (millis%(3.6*Math.pow(10,6)))*60;
            double seconds = ((millis%(3.6*Math.pow(10,6)))*60)%60;
            return hours+":"+mins+":"+seconds;
            //doesnt work well, I believe the math is wrong.
        }
}
