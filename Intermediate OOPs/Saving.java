import java.lang.String;

    class Saving {
        String name;
        int money;

        Saving(String name, int money)
        {
            this.name = name;
            this.money = money;
        }

        public void fixeddeposit() {
            System.out.println("money deposited is " + money);
        }
        public int totalMoney() { return money; }
    }
class current {
    String name;
    int moneyc;
    current(String name, int moneyc) {
        this.name = name;
        this.moneyc = moneyc;
    }
    public int cashcredit() {
        System.out.println("money credited is " + moneyc);
        return moneyc;
    }
    public int totalMoney() { return moneyc;}
}

class bank2 {
    public static void main(String[] args) {
        Saving s=new Saving( "SU" ,  5000);
        s.fixeddeposit();
        int p=s.totalMoney();
        current c=new current( "SV",  7000);
        c.cashcredit();
        int d=c.totalMoney();
        int y=p+d;
        System.out.println("Total money in the bank is"+y);
    }
}


