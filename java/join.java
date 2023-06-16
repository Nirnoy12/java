import java.util.*;
class join{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] arr=new String[n];
        
        //input

        int l=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
            l+=arr[i].length();
        }
        System.out.println("TOTAL LENGTH OF THE STRINGS ENTERED IS "+l);
    }
}