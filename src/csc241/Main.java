package csc241;

public class Main {

    public static void main(String[] args) {
	    Person p1 = new Student("Shaw", "Adam", 25, "ISC");

	    // Show the values
        System.out.println("P1: " + p1.showValues());

        // Instantiate a student -- requires a major
        Person s1 = new Student("Edwards", "Sally", 23, "CS");

        // Show student values
        System.out.println("S1: " + s1.showValues());

        System.out.println("FULL NAME: " + s1.getFullName());
    }
}
