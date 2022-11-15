package week6;
import java.util.*;
    class Cars {
        int id;
        String name,country;
        public Cars(int id, String name, String country) {
            this.id = id;
            this.name = name;
            this.country = country;
        }
    }
    public class HashSet12 {
        public static void main(String[] args) {
            HashSet<Cars> set= new HashSet<>();
            //Creating Cars
            Cars b1=new Cars(1,"VOLVO","Sweeden");
            Cars b2=new Cars(2,"GM","USA");
            Cars b3=new Cars(3,"BMW","Germany");
            //Adding Books to HashSet
            set.add(b1);
            set.add(b3);
            set.add(b2);
            //Traversing HashSet
            for(Cars b:set){
                System.out.println(b.name+" from "+b.country);
            }
            System.out.println("... only the car's brand: ");
            for(Cars b:set){
                System.out.println(b.name);
            }
        }
    }
