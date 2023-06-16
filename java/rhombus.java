import java.util.*;
class rhombus{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            int s=n-i;
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}