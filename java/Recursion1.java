import java.util.*;
class Recursion1 {

    public static void printFactorial(int n, int fact) {

        if(n == 0) {

            System.out.println(fact);

            return;

        }

        fact *= n;

        printFactorial(n-1, fact);

    }

    public static void main(String args[]) {
    
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THE NUMBER YOU WANT THE FACTORIAL OF");
        int x = sc.nextInt();
        printFactorial(x, 1);

    }

}