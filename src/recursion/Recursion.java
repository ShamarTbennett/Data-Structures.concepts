package recursion;

public class Recursion{


    public static void main(String[] args){

        //System.out.println("hii");
        System.out.println();
        System.out.println("\nFactorial total = " + factorial(5));
        System.out.println("------------------------------------------------");
        System.out.println("\nSum of individual digits: " + sumDigits(12345)); 
        System.out.println("------------------------------------------------");
        System.out.println("\nReversed String: " + reverse("hello", 1));
        System.out.println("------------------------------------------------");
        System.out.println("\nFibonacci number at position 7: " + fibonacci(7));
    }

    /**
     * Recursively calculates the factorial of a non-negative integer.
     */
    public static int factorial(int n){

        if (n == 0){
            return 1;
        }else{

            System.out.println("Factorial ("+ n + ") = " + n + " * Factorial (" + (n - 1) +")");
            return n * factorial(n - 1);
        }
    }

    /**
     * Recursively adds all digits in a positive integer.
     */
    public static int sumDigits(int n) {
        if (n < 10) {
            System.out.println(n); // print last digit
            return n; // base case
        }

        System.out.println("Current digit:" + n % 10); // print current digit
        return (n % 10) + sumDigits(n / 10);
    }

    /**
     * Recursively calculates the nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // base case
        }

        System.out.println("Fibonacci(" + n + ") = Fibonacci(" + (n - 1) + ") + Fibonacci(" + (n - 2) + ")");
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Recursively reverses a string by moving through one character at a time.
     *  str the remaining portion of the string
     *  i the current character position for display output
     * the reversed version of { str}
     */
     public static String reverse(String str, int i) {
        if (str.isEmpty()) 
            
            return str; // base case

        System.out.println("Letter " + i + ": " + str.charAt(0));

        return reverse(str.substring(1), i + 1) + str.charAt(0);
    }

    
        

}


