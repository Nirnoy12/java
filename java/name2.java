import java.util.*;
public class name2{
    public static void factorial(int n){
        if(n<=0){
            System.out.println("INVALID NUMBER");
            return;
        }
        int f=1;
        for(int i=n;i>=1;i--){
            f=f*i;
        }
            System.out.println(f);
            return;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
    factorial(n);
    }
}