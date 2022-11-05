public class Armstrongnumbersbetween {
    public static void main(String[] args) {
        int digit1,digit2,digit3,result,temp;
        for(int number = 100; number <= 999; number++)
        {
            temp = number;
            digit3=temp%10;//3
            temp=temp/10;//12

            digit2=temp%10;//2
            temp=temp/10;//1

            digit1=temp%10;//1
            result=(digit1 * digit1 * digit1)+( digit2 * digit2 * digit2)+(digit3 * digit3 * digit3);

            if(number==result){
                System.out.println(number + " is armstrong Number");
            }
        }
    }
}
