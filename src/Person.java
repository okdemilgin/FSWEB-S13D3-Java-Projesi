public class Person {
    String firstname;
    String lastname;
    int age;
    String address;
    String phoneNumber;
    String email;

    //constructor
    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age, String address, String phoneNumber, String email) {
        this(firstname,lastname,age);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
