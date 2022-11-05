public class Singletoneclass {

    static Singletoneclass st=new Singletoneclass();
    private Singletoneclass(){
        System.out.println("constructor will invoke only one object");
    }
    static Singletoneclass getInstance()
    {
        return st;
    }
}
class Test
{
    public static void main(String args[])
    {
        Singletoneclass st1= Singletoneclass.getInstance();
        Singletoneclass st2= Singletoneclass.getInstance();
        System.out.println(st1);
        System.out.println(st2);
    }
}