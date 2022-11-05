
public class Manager extends Employee {
    int incentive = 2000;

    @Override
    public void cal() {
        int result = this.basic + this.incentive;
        System.out.println("salary" + result);
    }

}
