public class Marks {
    public static void main(String[] args)
    {
        int m1=70;
        int m2=80;
        int m3=80;
        if(m1>60 & m2>60 & m3>60)
        {
            System.out.println("passed");
        }
        else if ((m1>60 & m2>60) || (m2>60 & m3>60) || (m1>60 & m2>60))
        {
            System.out.println("Promoted");
        }
        else if ((m1>60 || m2>60 || m3>60) ||(m1<60 & m2<60 & m3<60))
        {
            System.out.println("failed");
        }
    }
}
