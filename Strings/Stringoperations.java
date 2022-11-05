public class Stringoperations {
    public static void main(String[] args) {
        String s1 = "Java String pool refers to collection of Strings which are in heap memory";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replace('a','$'));
        System.out.println(s1.contains("collection"));
        System.out.println(s1.equals("java string pool refers to collection of strings which are in heap memory"));
        System.out.println(s1.equalsIgnoreCase("java string pool refers to collection of strings which are in heap memory"));
    }
}