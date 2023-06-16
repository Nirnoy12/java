import java.util.*;
public class state{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        if(temp>30){
            System.out.println("IT IS HOT OUTSIDE");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("NOT SO HOT");
        }
        else{
            System.out.println("IT IS COLD OUTSIDE");
        }
    } 
}