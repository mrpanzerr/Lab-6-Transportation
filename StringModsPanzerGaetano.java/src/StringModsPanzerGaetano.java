/**
 *   @purpose: modify user prompted strings with methods corresponding
 *   to the data type entered by the user.
 *   @author: Gaetano Panzer
 *   @date: 9.8.2023
 *   @section: CSC 331-001
 */

// Import Scanner
import java.util.Scanner;

public class StringModsPanzerGaetano {
    /**
     * Remove each nth character in the string s
     * @param n: an int, the nth character to delete
     * @param s: a string
     * @return new_s: the new string
     */
    public static String stringMod(int n, String s) {
        // Initialize variables
        String new_s = "";

        // Check each character of the string
        for (int i = 0; i <= s.length(); i++) {
            if (i % n == 0) { // i = nth character
                if (i == 0) {
                    continue;
                } else {
                    // Split the string up to the nth character
                    new_s += s.substring(i - n, i - 1);
                }
                // If we reach the last nth character, add the rest of the string
                if (i % n == 0 && (s.length() - i) < n) {
                    new_s += s.substring(i);
                }
            }
        }
    return new_s;
    }

    /**
     * Replace every e with a double
     * @param d: a double, to replace the letter e
     * @param s: a string
     * @return new_s: the new string
     */
    public static String stringMod(double d, String s) {
        // Initialize variables
        String new_s = "";
        int keep = 0;

        // Check every character in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                if (i == 0) { // Start of the string
                   new_s += d; // replace e with double
                   keep += 1;
                }
                else {
                    // Take the piece of the string up to the e
                    // get rid of e, replace with double
                    new_s += s.substring(keep, i) + d;
                    keep = i + 1;
                }
            }
        }
        // Once we find the last e, add the rest of the string
        new_s += s.substring(keep);
        return new_s;
    }

    /**
     * Alternate letters from two strings into one string
     * @param s1: a string
     * @param s2: a string
     * @return new_s: the new string
     */
    public static String stringMod(String s1, String s2) {
        // Initialize variables
        String new_s = "";
        String max_s;

        // Find the longer string
        if(s1.length() > s2.length()) {max_s = s1;}
        else {max_s = s2;}

        // Traverse the longer string by character
        for (int i = 0; i < max_s.length(); i++) {
            // Alternate characters
            if (s1.length() > s2.length()){
                new_s += s1.charAt(i);
                new_s += s2.charAt(i % s2.length());
            }
            else {
                new_s += s1.charAt(i % s1.length());
                new_s += s2.charAt(i);
            }
        }
        return new_s;
    }

    /**
     * Print the result of stringMod with int and string parameters
     * @param n: an integer
     * @param s: a string
     */
    public static void stringMod1(int n, String s) {
        String mod_int = stringMod(n, s);
        System.out.println("String: " + s);
        System.out.print("String with every " + n + " character removed: ");
        System.out.println(mod_int);
    }

    /**
     * Print the result of stringMod with double and string parameters
     * @param d: a double
     * @param s: a string
     */
    public static void stringMod2(double d, String s) {
        String mod_double = stringMod(d, s);
        System.out.println("\nString: " + s);
        System.out.print("String with every e replaced by " + d +": ");
        System.out.println(mod_double);
    }

    /**
     * Print the result of stringMod with string and string parameters
     * @param s1: a string
     * @param s2: a string
     */
    public static void stringMod3(String s1, String s2) {
        String mod_string = stringMod(s1, s2);
        System.out.println("\nString1: " + s1 + "\nString2: " + s2);
        System.out.print("String with alternating letters from the two: ");
        System.out.println(mod_string);
    }

    /**
     * Print all stringMod methods
     * @param number: an integer
     * @param number2: a double
     * @param string1: a string
     * @param string2: a string
     */
    public static void testAll(int number, double number2, String string1, String string2) {
        // Print String and Integer for parameters
        System.out.println();
        stringMod1(number, string1);
        stringMod1(number, string2);

        // Print String and Double for parameters
        System.out.println();
        stringMod2(number2, string1);
        stringMod2(number2, string2);
        System.out.println();

        // Print String and String for parameters
        stringMod3(string1, string2);
    }

    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Print Prompt
        System.out.println("Howdy, this program will ask you for two strings," +
                "an integer\nand a double. Then I will perform string mods to\nyour string" +
                " depending on the data type entered.");

        // Initialize variables
        String string1; String string2; int number; double number2;
        int cont = 1;

        // Continue program until the user stops it
        while (cont == 1) {
            System.out.print("String one:");
            string1 = input.nextLine();
            System.out.print("String two:");
            string2 = input.nextLine();
            System.out.print("Enter an integer:");
            number = input.nextInt();
            System.out.print("Enter a double:");
            number2 = input.nextDouble();

            // Print the results
            testAll(number, number2, string1, string2);

            // Ask if they want to continue
            System.out.print("\nWould you like to continue(1 for yes, any int for no): ");
            cont = input.nextInt();
            input.nextLine(); // throw away the \n not consumed by nextInt()
        }
        // Closing remarks
        System.out.print("Thank you for using my program!");
    }
}