import java.util.*;
class recur_fibonacci{
    public static void print(int a, int b , int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        print(b,c,n-1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER UPTILL WHICH YOU WANT THE FIBONACCI SERIES OF");
        int n=sc.nextInt();
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        
        print(a,b,n-2);
    }

}