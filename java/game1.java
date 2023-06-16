import java.util.*;
class game1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("THE RULES OF THIS GAME IS SIMPLE ");
        System.out.println("ROCK BEATS SCISSORS , SCISSORS BEATS PAPER , PAPER BEATS ROCK");
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("ENTER 1 FOR ROCK");
        System.out.println("ENTER 2 FOR PAPER");
        System.out.println("ENTER 3 FOR SCISSORS");
        int a =sc.nextInt();
        double d= Math.random();
        if( d<=0.3){
            System.out.println("ROCK");
        }
        else if( d>0.3 && d<=0.6){
            System.out.println("PAPER");
        }
        else{
            System.out.println("SCISSORS");
        }
    }
}