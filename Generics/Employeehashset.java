import java.util.*;

public class Employeehashset{

    public static void main(String args[]) {
        HashSet<Employeee<Integer,String,Integer,String>> hashSet = new HashSet<>();
        Employeee<Integer,String,Integer,String> e1 =  new Employeee<>(301,"Bhuv",25000,"Developer");
        Employeee<Integer,String,Integer,String> e2 =  new Employeee<>(302,"Keerthi",27000,"Testing");

        if(e1 instanceof Employeee && e2 instanceof Employeee) {
            hashSet.add(e1);
            hashSet.add(e2);
        }

        for(Employeee<Integer,String,Integer,String> e: hashSet) {
            e.displayDetails();
        }
    }
}
