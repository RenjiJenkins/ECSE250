import java.util.Scanner;


public class week1{
    //(Display three messages) Write a program that displays Welcome to Java,Welcome to Computer Science, and Programming is fun.
    
    public void problem1_1(){
    System.out.println("Welcome to Java");
    System.out.println("Welcome to Computer Science");
    System.out.println("Programming is fun");
    }

    public void problem1_2(){
        // (Display five messages) Write a program that displays Welcome to Java five times.

        int i=0;
        while (i <= 4){
            System.out.println("Welcome to Java");
            i++;
        }
    }

    public void problem1_4(){
        // Check one note (Table problem)
        String format = "%s %5s %5s%n"; // so here % is for special printing, - means left, and the number is the pixel, s for string.
        System.out.printf(format, "a", "a^2", "a^3");
        System.out.printf(format, 1, (int) Math.pow(1, 2), (int) Math.pow(1, 3));
        System.out.printf(format, 2, (int) Math.pow(2, 2), (int) Math.pow(2, 3));
        System.out.printf(format, 3, (int) Math.pow(3, 2), (int) Math.pow(3, 3));
        System.out.printf(format, 4, (int) Math.pow(4, 2), (int) Math.pow(4, 3));
    }

    public void problem1_11(){
        // Complex program, check one note
        double d = 312032486;
        int year = 365;

        double seconds_in_a_year = year*24*60*60;

        //births
        d = d + (seconds_in_a_year/7*5);
        //deaths
        d = d - (seconds_in_a_year/13*5);
        //immigrant
        d = d + (seconds_in_a_year/45*5);

        System.out.print("The population in 5 years will be : " + d);

    }

    public void problem2_1(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Celsius temperature: ");
        double celsius = s.nextDouble();

        double fahrenheit = (9.0/5)*celsius+32;

        System.out.println(fahrenheit);
    }

    public void problem2_2(){
        /* (Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas: */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a radius");
        double radius = s.nextDouble();
        System.out.println("Enter a length");
        double length = s.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }

    public void problem2_3(){
        /*(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a length in feet: ");
        float feet = s.nextFloat();
        float meters = feet*0.305f;
        System.out.println(feet + "feet is " + meters + "meters.");
    }

    public void problem2_5(){
        /*(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5as gratuity and $11.5 as total. */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the subtotal");
        float subtotal = s.nextFloat();
        System.out.println("Enter the gratuity rate");
        float gratuity_rate = s.nextFloat();

        float total = subtotal * ((gratuity_rate / 100) + 1);

        System.out.println("The total is " + total);
    }

    public void problem2_6(){
        /*(Sum the digits in an integer) Write a program that reads an integer between 0and 1000 and adds all the digits in the integer. For example, if an integer is 932,
the sum of all its digits is 14.Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93 */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer from 1 to 1000");
        int i = s.nextInt();
        if (i < 1000){
        int sum = (i % 10) + (i % 100)/10 + (i % 1000)/100;
        System.out.println("The sum of the digits in " + i + " are " + sum);
        }else {
            System.out.println("The integer given is invalid");
        }
    }

    public void problem2_7(){
        /*(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the maximum number of years and remaining days for the minutes. For simplicity, assume that a year has 365 days. */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter minutes:");
        int minutes = s.nextInt();
        int days = minutes/60/24;
        int years = days/365;
        days = days%365;
        System.out.println("The number of years is " + years + " plus " + days + " days.");
    }

    public void problem2_11(){
        /*(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and display the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. */
        // Exercise 1.11
        double d = 312032486;
        int year = 365;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount of years for the population calculus.");
        int years = s.nextInt();

        double seconds_in_a_year = year*24*60*60;

        //births
        d = d + (seconds_in_a_year/7*years);
        //deaths
        d = d - (seconds_in_a_year/13*years);
        //immigrant
        d = d + (seconds_in_a_year/45*years);

        System.out.print("The population in " + years + " years will be : " + d);
    }

    public void problem2_12(){
        /*(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
length = v2
2aWrite a program that prompts the user to enter v in meters/second (m/s) and
the acceleration a in meters/second squared (m/s2), then, displays the minimum
runway length. */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a speed in m/s:");
        double v = s.nextDouble();
        System.out.println("Enter an acceleration in meters/second squared:");
        double a = s.nextDouble();
        double length = ((Math.pow(v,2))/(2*a));
        System.out.println("Minimum runway length: " + length);
    }
    
    public void problem2_15(){
        /*(Geometry: distance of two points) Write a program that prompts the user to
enter two points (x1, y1) and (x2, y2) and displays their distance. The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Note you can useMath.pow(a, 0.5) to compute 2a. */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a point");
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        System.out.println("Enter a second point");
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The distance between the two points is " + distance);
    }

    public void problem5_1(){
        /*(Count positive and negative numbers and compute the average of numbers)
Write a program that reads an unspecified number of integers, determines how
many positive and negative values have been read, and computes the total and average of the input values (not counting zeros). Your program ends with the input0. Display the average as a floating-point number. */
        Scanner s = new Scanner(System.in);
        float average = 0f;
        System.out.println("Write all the numbers to average.");
        // How do you wait for input??
        while(s.hasNextFloat()){
            average = average + s.nextFloat();
        }
        System.out.println("The average is " + average);

    }
    
    public void problem5_7(){
        /*Financial application: compute future tuition, Suppose the tuition for a university is $10,000 this year and increases 5% every year. In one year, the tuition will
be $10,500. Write a program that displays the tuition in 10 years, and the total
cost of four years’ worth of tuition starting after the tenth year. */
        double tuition = 10000d;
        int years = 10;
        double current_tuition = 0;
        for(int i=0; i <= 4; i++){
            double future = tuition * Math.pow(1.05, years + i);
            current_tuition = current_tuition + future;
        }
        System.out.println("The tuition for the whole 4 years in 10 years is " + current_tuition);


    }

    public void problem5_12(){
        /*(Find the smallest n such that n2 7 12,000) Use a while loop to find the smallest integer n such that n2 is greater than 12,000. */
        int n = 0;
        while (Math.pow(n,2) <12000){
            n++;
        }
        System.out.print("The smallest integer such that n^2 > 12000 is " + n);
    }

    public void problem5_23(){
        /*(Demonstrate cancellation errors) A cancellation error occurs when you are
manipulating a very large number with a very small number. The large number
may cancel out the smaller number. For example, the result of 100000000.0
+ 0.000000001 is equal to 100000000.0. To avoid cancellation errors and
obtain more accurate results, carefully select the order of computation. For example, in computing the following summation, you will obtain more accurate
results by computing from right to left rather than from left to right:
1 + 12 + 13 + c + 1nWrite a program that compares the results of the summation of the preceding
series, computing from left to right and from right to left with n = 50000. */
        int n = 1;
        float sum = 0;
        while (n<50000){
            sum += (1/n);
            n++;
        }
        float sum2 = sum + (1/n);
        if (sum == sum2){
            System.out.println("The two numbers are the same (there has been cancellation errors).");
        } else{
            System.out.println("The two numbers are different (there has been no cancellation errors).");
        }
    }

    public void problem5_26(){
        /*(Compute e) You can approximate e using the following summation:e = 1 + 11! + 12! + 13! + 14! + g + 1i!Write a program that displays the e value for i = 1, 2, ..., and 20. Format
the number to display 16 digits after the decimal point. (Hint: Becausei! = i * (i - 1) * c * 2 * 1, then
1i! is 1i(i - 1)!Initialize e and item to be 1, and keep adding a new item to e. The new item is
the previous item divided by i, for i >= 2.) */
        //Soooo the maclaurin series from MATH262...
        int n = 1;
        float e = 1;
        float denominator = 1;
        while(n<21){
            e += 1/(denominator);
            n++;
            denominator = denominator*n;
        }
        System.out.print("The value of e at n=20 is " + e);

        //How do I know the correct answer?
    }

    public void problem5_37(){
        /*(Decimal to binary) Write a program that prompts the user to enter a decimal
integer then displays its corresponding binary value. Don’t use Java’s Integer.
toBinaryString(int) in this program. */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the decimal number to transform into binary");
        int decimal = s.nextInt();

        //I get the conversion from appendix f, so digit * 2^(digit_position) but how do I extract those digits?

}
}
