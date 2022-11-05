import java.lang.*;
import java.util.*;
class PhoneNumbers
{
    Long number;
    PhoneNumbers(Long Number)
    {
        this.number=Number;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

   //override
    public String toString() {
        return "PhoneNumbers{" +
                "number=" + number +
                '}';
    }
}

class Contact {
    String name, email;
    String gender;

    Contact(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

    class SortByPhoneNumber implements Comparator {
        public int compare(Object str1, Object str2) {
            String i1 = str1.toString();
            String i2 = str2.toString();
            return i2.compareTo(i1);
        }
    }


    public class Tree {
        public static void main(String args[]) {
            PhoneNumbers n1 = new PhoneNumbers(9812345638L);
            PhoneNumbers n2 = new PhoneNumbers(9453156841L);
            PhoneNumbers n3 = new PhoneNumbers(7834745581L);
            PhoneNumbers n4 = new PhoneNumbers(8347466711L);
            Contact c1 = new Contact("Bhuv", "bhuv@gmail.com", "female");
            Contact c2 = new Contact("Keerthi", "keerthiraj@gmail.com", "female");
            Contact c3 = new Contact("Vivek", "vivekkantha@gmail.com", "male");
            Contact c4 = new Contact("Prawin", "Prawin@gmail.com", "male");
            TreeMap<PhoneNumbers, Contact> phnContact = new TreeMap<>(new SortByPhoneNumber());
            phnContact.put(n1, c1);
            phnContact.put(n2, c2);
            phnContact.put(n3, c3);
            phnContact.put(n4, c4);
            System.out.println(phnContact);
            Set<Map.Entry<PhoneNumbers, Contact>>

                    entrySet = phnContact.entrySet();
            System.out.println("Keys.......................");
            for (Map.Entry<PhoneNumbers, Contact> entry : entrySet) {
                System.out.println(entry.getKey());
            }
            System.out.println("Values..................");

            for (Map.Entry<PhoneNumbers, Contact> entry : entrySet) {
                System.out.println(entry.getValue());
            }

            System.out.println("KeyValuePairs..................");
            for (Map.Entry<PhoneNumbers, Contact> entry : entrySet) {
                System.out.println(entry.getKey() + "=>" + entry.getValue());
            }
        }
    }
