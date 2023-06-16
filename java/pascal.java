import java.util.*;
class pascal{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers
            int no=1;
            for(int j=0;j<=i;j++){
                System.out.print(no+" ");
                no=no*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}