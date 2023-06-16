import java.util.*;
public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal;
        System.out.println("WHAT ANIMAL DO YOU WANT ?");
        System.out.println("ENTER 1 FOR DOG OR 2 FOR CAT");
        int choice = sc.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("WRONG CHOICE");
            animal.speak();
        }
    }
}