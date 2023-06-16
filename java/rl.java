import java.util.*;
class rl{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.print("ENTER THE NUMBER OF ROWS");
    int r=sc.nextInt();
    System.out.print("ENTER THE NUMBER OF COLUMNS");
    int l=sc.nextInt();
    int [] [] m=new int [r] [l];

    //intput

        for(int i=0;i<r;i++){
            for(int j=0;j<l;j++){
                m [i] [j]=sc.nextInt();
            }
        }

        //output

        for(int i=0;i<r;i++){
            for(int j=0;j<l;j++){
                System.out.print(m [i][j]+" ");
            }
        System.out.println();
        }
    }
}