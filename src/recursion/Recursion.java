package recursion;

public class Recursion{


    public static void main(String[] args){

        System.out.println("hii");
        System.out.println(factorial(5));
        System.out.println(sumDigits(1234)); 
    }

    public static int factorial(int n){

        if (n == 0){
            return 1;
        }else{

            return n * factorial(n - 1);
        }
    }

    public static int sumDigits(int n) {
        if (n < 10) return n; // base case
        
        return (n % 10) + sumDigits(n / 10);
    }

}


