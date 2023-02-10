package csc241;

public class Person {
    // Instance variables
    private String lastName;
    private String firstName;
    private int age;

    // Constructor
    public Person(String lastName, String firstName, int age){
        // Initialize variables
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String showValues(){
        return lastName + ", " + firstName + ": " + age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
