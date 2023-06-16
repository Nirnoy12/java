import java.util.*;
class met{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER YOUR 1ST NUMBER");
        int a=sc.nextInt();
        System.out.println("ENTER YOUR 2ND NUMBER");
        int b=sc.nextInt();
        sum(a,b);
    }
    static void sum(int a, int b){
        int s=a+b;
        System.out.println("SUM OF THE TWO NUMBER IS : "+s);
    }
}