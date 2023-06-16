import java.util.*;
class arl {
    public static void main (String [] args) {

        ArrayList<String> booklist = new ArrayList<String>();
        booklist.add("science");
        booklist.add("history");
        booklist.add("maths");

        ArrayList<String> marketlist = new ArrayList<String>();
        marketlist.add("cucumber");
        marketlist.add("potato");

        ArrayList<String> hardwarelist = new ArrayList<String>();
        hardwarelist.add("ram");
        hardwarelist.add("cpu");
        hardwarelist.add("monitor");

        System.out.println(marketlist);
        System.out.println(booklist);
        System.out.println(hardwarelist);
    }
}