import java.util.*;
class replace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String result="";

        //input

        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='e'){
                result+='i';
            }
            else{
                result+=n.charAt(i);
            }
        }
        //output

        System.out.println(result);
    }
}