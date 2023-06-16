public class food{
    public static void main(String[] args){
        foods food1 = new foods ("PIZZA");
        foods food2 = new foods ("HAMBURGER");
        foods food3 = new foods ("hotdog");
        
        foods [] fridge = {food1,food2,food3};

        for(int i=0;i<3;i++){
            System.out.println(fridge[i].name);
        }
    }
}