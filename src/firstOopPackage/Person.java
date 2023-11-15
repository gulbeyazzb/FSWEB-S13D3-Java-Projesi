package firstOopPackage;

public class Person {
    String firstName;
    String lastName;
    int age;
    String job;
    int birthYear;
    String address;

    public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public Person(String firstName,String lastName,int age,String job,String address,int birthYear){
     this(firstName,lastName,age);
        this.address=address;
        this.job=job;
        this.birthYear=birthYear;
    }

    public  String getFirstName(){
        return firstName;
    }

    public  String getLastName (){
        return lastName;
    }

    public  String getAge(){
        return String.valueOf(age);
    }

    public  boolean  isTeen (){
        return (age>=13 && age<=19);
    }

    //METODLARI STRİNG'E Mİ ÇEVİRECEĞİZ YOKSA BÖYLE DÖNMESİ DOĞRU MU????
}
