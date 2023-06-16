import java.util.Random;
public class random{
    public static void main(String[] args){
        Random random = new Random();
        int r =random.nextInt(10)+1;
        System.out.print("A RANDOM NUMBER FOR YOU IS "+r);
        
    }
}