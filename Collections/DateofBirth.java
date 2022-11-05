import java.lang.*;
import java.util.*;
class Date
{  Integer date;
    Integer Month;
    Integer year;
    public Date(Integer d,Integer Month,Integer year)
    {
        this.date=d;
        this.Month=Month;
        this.year=year;
    }

    @Override
    public String toString() {
        return date+"-"+Month+"-"+year;
    }
}
public class DateofBirth {
    public static void main(String args[])
    {
        LinkedList<Date> list=new LinkedList<>();
        Date d1=new Date(10,7,2002);
        Date d2=new Date(24,3,1994);
        Date d3=new Date(19,6,1975);
        Date d4=new Date(6,9,2020);
        Date d5=new Date(1,4,2004);
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        System.out.println(list);
        Iterator<Date> itr=list.iterator();
        while(itr.hasNext())
        {
            Date d=(Date)itr.next();
            Integer date=d.date;
            Integer month=d.Month;
            Integer year=d.year;
            if(year%400==0)
            {
                System.out.println("The date of birth is "+date+"-"+month+"-"+year+" is a leap year");
            }
            else if(year%100==0)
            {
                System.out.println("The date of birth is "+date+"-"+month+"-"+year+" is not a leap year");
            }
            else if(year%4==0)
            {
                System.out.println("The date of birth is "+date+"-"+month+"-"+year+" is a leap year");
            }
            else {
                System.out.println("The date of birth is "+date+"-"+month+"-"+year+" is not a leap year");
            }
        }

    }
}