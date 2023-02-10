package csc241;

public class Student extends Person{

    // Instance variable
    private  String major;

    // Modify constructor to add additional parameter
    public Student(String lastName, String firstName, int age, String major) {
        super(lastName, firstName, age); // Call the parent class constructor
        this.major = major;
    }

    // "Override" method to show additional information
    @Override
    public String showValues(){
        return super.showValues() + " - " + major;
    }

    // Can only be called on a Student object
    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
