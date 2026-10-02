import java.util.Scanner;

public class week3{
    public void problem3_5(){
        /*(Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display the future day of the week. */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6) and the number of days after today.");
        int day = s.nextInt();
        int inbetween = s.nextInt();

        int future = (day + inbetween -1)%7;
        if(future == 0){
            System.out.println("Sunday");
        }else if(future == 1){
            System.out.println("Monday");
        }else if(future == 2){
            System.out.println("Tuesday");
        }else if(future == 3){
            System.out.println("Wednesday");
        }else if(future == 4){
            System.out.println("Thursday");
        }else if(future == 5){
            System.out.println("Friday");
        }else if(future == 6){
            System.out.println("Saturday");
        }


    }
    public void problem4_12(){
        /*(Hex to binary) Write a program that prompts the user to enter a hex digit and
displays its corresponding binary number in four digits. For example, hex digit 7is 0111 in binary. Hex digits can be entered either in uppercase or lowercase. For
an incorrect input, display invalid input. */

// we haven't seen hex I think
    }
    public void problem4_13(){
        /*(Vowel or consonant?) Write a program that prompts the user to enter a letter and
check whether the letter is a vowel or consonant. For a nonletter input, display
invalid input */
        Scanner s = new Scanner(System.in);
        char character = s.next().charAt(0);
        if ((65 <= character && character <= 90) || (97 <= character && character <= 122)){ //cannot be chained expressions
            if(character == 65 || character == 69 || character == 73 || character == 79 || character == 85 || character == 89 || character == 97 || character == 101 || character == 105 || character == 111 || character == 117 || character == 121){
                System.out.print("Character is a vowel");
            }else{
                System.out.print("Character is a consonant");
            }
        }else{
            System.out.print("Invalid input");
        }
    }
    public void problem4_20(){
        /*(Process a string) Write a program that prompts the user to enter a string and
displays its length and its first character. */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = s.nextLine();
        System.out.println("The length of the string is " + input.length() + " and the first character is " + input.charAt(0));
    }
    public void problem4_22(){
        /*(Check substring) Write a program that prompts the user to enter two strings, and
reports whether the second string is a substring of the first string. */
        Scanner s = new Scanner(System.in);
        System.out.println("Write two strings");
        String a = s.nextLine();
        String b = s.nextLine();

        if(a.contains(b)){
            System.out.print(a + " contains " + b);
        }else{
            System.out.print(a + " does not contain " + b);
        }
    }
    public void problem4_23(){
        /*(Financial application: payroll) Write a program that reads the following information and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%) */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the employee's name:");
        String name = s.nextLine();
        System.out.println("Enter the number of hours per week:");
        int hours = s.nextInt();
        System.out.println("Enter the hourly pay rate:");
        float hourly_rate = s.nextFloat();
        System.out.println("Enter the federal tax withholding rate:");
        float tax_rate_federal = s.nextFloat();
        System.out.println("Enter the state tax withholding rate:");
        float tax_rate_state = s.nextFloat();

        System.out.println("Employee's name: " + name);
        System.out.println("Employee's hours per week: " + hours);
        System.out.println("Employee's rate: " + hourly_rate);
        System.out.println("Employee's federal tax rate: " + tax_rate_federal);
        System.out.println("Employee's state tax rate: " + tax_rate_state);
    }
    public void problem4_24(){
        /*(Order three cities) Write a program that prompts the user to enter three cities
and displays them in ascending order. */
        Scanner s = new Scanner(System.in);
        int count = 0;
        String str = s.next();
        // We don't really want to compare every char between all stirngs... we also saw this in the tutorial but I forgot how
        
        
    }
    public void problem5_46(){
        /*(Reverse a string) Write a program that prompts the user to enter a string anddisplays the string in reverse order. */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String str = s.nextLine();
        //.reverse(); does not work here...
        String invStr = str;

        System.out.println("The reverse of " + str + " is " + invStr);
    }
    public void problem5_50(){
        /*(Count uppercase letters) Write a program that prompts the user to enter a string
and displays the number of the uppercase letters in the string. */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = s.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                count++;
            }
        }
        System.out.print("There are " + count + " uppercase letters in the string");
        
    }

    
    public void problem6_20(){
        /*(Count the letters in a string) Write a method that counts the number of letters in
a string using the following header:public static int countLetters(String s)Write a test program that prompts the user to enter a string and displays the number of letters in the string. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        System.out.print(countLetters(str));
    }
    public static int countLetters(String s){
        int count = s.length();
        return count;
    }
    public void problem6_23(){
        /*(Occurrences of a specified character) Write a method that finds the number of
occurrences of a specified character in a string using the following header:public static int count(String str, char a)For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string followed by a character then displays the
number of occurrences of the character in the string. */
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        char character = s.next().charAt(0);
        count(string, character);
    }
    public static int count(String str, char a){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    
    }
    public void problem6_26(){
        /*(Palindromic prime) A palindromic prime is a prime number and also palindromic. For example, 131 is a prime and also a palindromic prime, as are 313
and 757. Write a program that displays the first 100 palindromic prime numbers.
Display 10 numbers per line, separated by exactly one space, as follows:2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929 */
        //I get the prime part, but not how to find a palindrome (by comparing it to its reverse?)
    }
    public void problem6_37(){
        /*(Format an integer) Write a method with the following header to format the integer with the specified width.public static String format(int number, int width)The method returns a string for the number with one or more prefix 0s. The size
of the string is the width. For example, format(34, 4) returns 0034 and format(34, 5) returns 00034. If the number is longer than the width, the method
returns the string representation for the number. For example, format(34, 1)returns 34.
Write a test program that prompts the user to enter a number and its width, and
displays a string returned by invoking format(number, width). */
        // so... should this be an array?
    }public static String format(int number, int width){
        return null;
    }
}