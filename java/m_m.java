import java.util.*;
class m_m{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] no=new int[n];

        //intput
        
        for(int i=0;i<n;i++){
            no[i]=sc.nextInt();
        }

        //output

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<no.length;i++){
            if(no[i]<min){
                min=no[i];
            }
            if(no[i]>max){
                max=no[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }
}