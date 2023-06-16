import java.util.*;
class fishing{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER THE NUMBER OF ROWS");
       int rows = sc.nextInt();
       System.out.println("ENTER THE NUMBER OF COLUMNS");
       int cols = sc.nextInt();
       int[][] numbers = new int[rows][cols];

       //input

       System.out.println("NOW ENTER ALL THE NUMBERS ONE BY ONE");
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }

       //output

       System.out.println("ENTER THE NUMBER YOU WANT TO SEARCH");
       int x=sc.nextInt();
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
            if(x == numbers[i][j]) {
                System.out.print("x found at location (" + i + ", " + j + ")");
            }
          }
       }
    }
}