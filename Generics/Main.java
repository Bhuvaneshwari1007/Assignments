public class Main{
        public static void main (String [] args){
            Pair<String,String> myObj = new Pair();
            myObj.setKey("Greeting");
            myObj.setValue("Good Morning");
            System.out.println(myObj.getKey()+" "+myObj.getValue());
            Pair<String,java.util.Date> myObj1 = new Pair();
            myObj1.setKey("Today is ");
            myObj1.setValue(new java.util.Date());
            System.out.println(myObj1.getKey()+" "+myObj1.getValue());
        }
    }