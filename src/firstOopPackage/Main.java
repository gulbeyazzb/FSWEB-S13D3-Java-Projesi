package firstOopPackage;

public class Main {
    public static void main(String[] args) {
        Person person=new Person("Gülbeyaz","B.Özer",27);

        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("isTeen? " + person.isTeen());
    }

}