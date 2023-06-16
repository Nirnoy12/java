import java.util.*;
class leap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int leap=a%4;
        if(leap == 0){
            System.out.println("IT IS A LEAP YEAR");
        }
        else{
            System.out.println("IT IS NOT A LEAP YEAR");
        }
    }
}