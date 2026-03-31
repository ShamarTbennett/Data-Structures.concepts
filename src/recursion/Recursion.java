package recursion;

public class Recursion{


    public static void main(String[] args){

        System.out.println("hii");
        System.out.println();
        System.out.println(factorial(5));
        System.out.println();
        System.out.println(sumDigits(12345)); 
        System.out.println();
        System.out.println(reverse("hello"));
    }

    public static int factorial(int n){

        if (n == 0){
            return 1;
        }else{

            return n * factorial(n - 1);
        }
    }

    public static int sumDigits(int n) {
        if (n < 10) 
            
            return n; // base case

        return (n % 10) + sumDigits(n / 10);
    }

     public static String reverse(String str) {
        if (str.isEmpty()) return str; // base case
        
        return reverse(str.substring(1)) + str.charAt(0);
    }

        

}


