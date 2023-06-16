import java.util.*;
class table{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT THE TABLE OF");
        int n=sc.nextInt();
        System.out.println("ENTER THE NUMBER UPTO WHICH YOU WANT THE TABLE");
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int m=n*i;
            System.out.println(+n+" x "+i+" = "+m);
        }
        System.out.println();
    }
}