import java.util.Scanner;

public class Exercises {
    // 1. Read a double, in celsius, from the terminal
    // 2. convert this to Fahrenheit
    // 3. display the result (print)
    // fahrenheit = (9.0 / 5) * C + 32
    static void exercise_02_01() {
        Scanner input = new Scanner(System.in);
        IO.println("Enter a temperature in Celsius: ");

        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;

        IO.println(celsius + "C is " + fahrenheit + "F");
    }

    static void exercise_02_02() {
        // 1. Read an integer
        // 2. Make sure that the integer is between 0 and 1000
        // 3. Seperate the integer into the hundreds place, the tens place, and the ones place
        // 4. sum them
        // 5. display the result (print)

        Scanner input = new Scanner(System.in);
        IO.println("Enter an integer between 0 and 1000: "); 
        int number = input.nextInt();

        if (number < 0 || number > 1000) {
            IO.println("Invalid input. Please enter an integer between 0 and 1000.");
            return;
        }
        int hundreds = number / 100;
        int tens = (number / 10) % 10; 
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        IO.println("The sum of the digits of " + number + " is " + sum);
        
    }
}