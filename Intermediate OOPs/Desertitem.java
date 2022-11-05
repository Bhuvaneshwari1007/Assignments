import java.util.Scanner;
import java.lang.String;
import static java.lang.System.*;
abstract class DessertItem
{
    abstract void getCost();
    abstract void addItem(int number,int addnumber);

}
class Candy extends DessertItem
{
    int cost;
    int number;
    int tax;
    Candy(int cost,int tax) {
        this.cost=cost;
        this.tax=tax;
    }
    void getCost()

    {
        cost=cost+tax;
        System.out.println("cost of cookie is "+cost+ "along with the tax "+tax);
    }
    void addItem(int number,int addnumber)
    {
        System.out.println("available candies are "+number+"candy's added"+addnumber);
    }
}
class Cookie extends DessertItem
{
    int cost;
    int number;
    int tax;
    Cookie(int cost,int tax)
    {
        this.cost=cost;
        this.tax=tax;
    }
    void getCost()

    {
        cost=cost+tax;
        System.out.println(" cost of cookie is "+cost+ "along with the tax "+tax);
    }
    void addItem(int number,int addnumber)
    {

        System.out.println("available cookies are "+number+" cookie's added"+addnumber);
    }

}
class IceCream extends DessertItem
{
    int cost;
    int number;
    int tax;
    IceCream(int cost,int tax)
    {
        this.cost=cost;
        this.tax=tax;
    }
    void getCost()

    {
        cost=cost+tax;
        System.out.println("cost of icecream is "+cost+ "along with the tax "+tax);
    }
    void addItem(int number,int addnumber)
    {

        System.out.println("available icecreams are "+number+"icecreams's added"+addnumber);
    }
}
class Owner
{
    void addItem()
    {
        out.println("Adds items  to the list");
    }

}
class Customer {
    String[] a = new String[]{"icecream", "candy", "cookie"};

    void Order() {
        out.println("pick your order from the list");
        for (int i = 0; i < a.length; i++)
            out.println(a[i]);
    }
}
public class Desertitem {
    public static void main(String[] args) {
        String q="owner" ;
        String p="customer";
        Scanner s=new Scanner(in);
        out.println("enter your state");
        String State = s.next();
        Owner o=new Owner();
        Customer c=new Customer();
        Candy k=new Candy(50 ,3);
        Cookie k1=new Cookie(115 ,5);
        IceCream k2=new IceCream(225 ,10);
        if(State.equals(q))
        {
            k.addItem(250,25);
            k1.addItem(280,38);
            k2.addItem(420,190);
        }
        if(State.equals(p))
        {
            c.Order();
            k.getCost();
            k1.getCost();
            k2.getCost();
        }
    }
}
