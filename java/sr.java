import java.util.*;
class sr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] As=new int[n];
        
        //intput

        for(int i=0;i<n;i++){
            As[i]=sc.nextInt();
        }
        
        //output
        boolean isAscending=true;
        for(int i=0;i<As.length-1;i++){
            if(As[i]>As[i+1]){
            isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
 
     }
}