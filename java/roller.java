import java.util.*;
class roller{

     Random random;
     int number;

    roller(){
        random=new Random();
        roll();
    }
    void roll(){
        number=random.nextInt(6)+1;
        System.out.println(number);
    }
}