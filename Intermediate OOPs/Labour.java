import java.util.*;
public class Labour extends Employee{
   int over =1000;
   @Override
public void cal(){
   int result = this.basic+ this.over;
   System.out.println("Salary:" + result);}

    public static void main(String[] args) {
        Labour l = new Labour();
        l.cal();
        Manager m = new Manager();
        m.cal();
    }
}


