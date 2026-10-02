import java.util.Scanner;

public class Tutorial2 {
    public static boolean isPrime(int n) {
        int n_sqrt = (int) Math.sqrt(n);

        for (int i = 2; i <= n_sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int count(String str, char a) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSubstring() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String mainString = input.nextLine();
        System.out.println("Enter the substring: ");
        String subString = input.nextLine();

        // .contains() is useful here
        return mainString.contains(subString);
    }
}