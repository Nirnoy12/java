public class recursion3_2{
    public static void subseq(String str, int idx,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subseq(str,idx+1,newString+currChar);
        subseq(str,idx+1,newString);
    }
    public static void main(String args[]){
        String str="abc";
        subseq(str,0,"");
    }
}