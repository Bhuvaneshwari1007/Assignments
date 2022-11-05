public class ReverseBuilder {
    public static void main(String[] args) {
        StringBuilder B = new StringBuilder("This method returns the reversed object on which it was called");
        B.reverse();
        System.out.println(B);
    }
}
