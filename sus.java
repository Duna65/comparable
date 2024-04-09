//Made by Dallin Lyman
//Sorts objects by intensity
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class sus implements Comparable<sus>{
    String name;
    int amount;
    int intens;
    public sus(String in,int ia,int ii){//object
        name=in;
        amount=ia;
        intens=ii;
    }
    public int getintens(){//getter
        return this.intens;
    }
    public static void main(String[] args) {//makes arraylist with 10 objects
        ArrayList<sus> list = new ArrayList<sus>();
        list.add(new sus("Bob", 4, 5));
        list.add(new sus("Jim", 2, 6));
        list.add(new sus("Bill", 1, 2));
        list.add(new sus("Bubba", 3, 3));
        list.add(new sus("Nick", 5, 4));
        list.add(new sus("John", 2, 1));
        list.add(new sus("Ryan", 6, 7));
        list.add(new sus("Rick", 5, 5));
        list.add(new sus("Finn", 3, 6));
        list.add(new sus("Chad", 4, 8));
        System.out.println("Unsorted:");//prints unsorted list
        for(sus i:list){
            System.out.println(i.name + ", " + i.amount);
        }
        System.out.println("Sorted:");//prints sorted list
        Collections.sort((List<sus>) list);//overrides old code
        for(sus i:list){
            System.out.println(i.name + ", " + i.amount);
        }
    }
    @Override//overrides the old code
    public int compareTo(sus cto) {
        int compare=((sus)cto).getintens();
        return this.intens-compare;
    }
}
