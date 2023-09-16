public class recursion3_6{
    public static int path(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n || j==m){
            return 0;g
        }
        int downpath=path(i+1,j,n,m);
        int rightpath=path(i,j+1,n,m);
        return downpath + rightpath;
    }
    public static void main(String args[]){
        int n=3,m=3;
        int totalpath=path(0,0,n,m);
        System.out.println(totalpath);
    }
}