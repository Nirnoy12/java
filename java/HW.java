import java.util.*;
class HW{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("PRESS 1 FOR ADDTION");
        System.out.println("PRESS 2 FOR SUBSTRACTION");
        System.out.println("PRESS 3 FOR MULTIPLICATION");
        System.out.println("PRESS 4 FOR REMAINDER");
        System.out.println("PRESS 5 FOR DIVISION");
        int num=sc.nextInt();
        switch(num){
            case 1:
            double s=a+b;
            System.out.println(s);
            break;
            case 2:
            double su=a-b;
            System.out.println(su);
            break;
            case 3:
            double m=a*b;
            System.out.println(m);
            break;
            case 4:
            double mo=a%b;
            System.out.println(mo);
            break;
            case 5:
            double d=a/b;
            System.out.println(d);
            break;
            default:
            System.out.println("wrong input");
        }
        sc.next();
        }
}
