package _4_Java_OOP.Lab.Encapsulation.SortByNameAndAge;

public class Person {

    private final String PERSON_OUTPUT = "%s %s is %d years old.";
    private String firstName;
    private String lastName;
    private int age;


      Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format(PERSON_OUTPUT, this.getFirstName(), this.getLastName(), this.getAge());
    }
}
