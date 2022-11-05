public class SavingsAccount {
    double balance = 15000;
    long id;

    SavingsAccount(long id,double balance){
        this.balance = balance;
        this.id = id;
    }

    public double withdraw(double amt) {
        if(balance==0 || balance<amt) {
            throw new RuntimeException("Insuffficient Balance Exception");
        }
        else if(amt<0) {
            throw new RuntimeException("IllegalBank Transaction Exception");
        }
        return amt;
    }

    public double deposit(double amt) {
        balance += amt;
        return balance;
    }
    public static void main(String args[]) {
        SavingsAccount s1 = new SavingsAccount(34156, 25000);
        double availBal = s1.deposit(7000);
        System.out.println("Available Balance after deposit: "+availBal);
        double withdrawAmt = s1.withdraw(35000);
        System.out.println("Available Balance after withdraw: "+ (availBal-withdrawAmt));
    }

}

