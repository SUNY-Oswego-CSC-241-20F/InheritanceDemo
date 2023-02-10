package csc241;

public class Main {

  public static void main(String[] args) {
    // Instantiate a Person
    Person p1 = new Person("Shaw", "Adam", 25);

    // Show the values
    System.out.println("P1: " + p1.showValues());

    // Instantiate a student -- requires a major
    Student s1 = new Student("Edwards", "Sally", 23, "CS");

    // Show student values
    System.out.println("S1: " + s1.showValues());

    // This won't work unless s1 is declared as a Student
    System.out.println("S1: " + s1.getFullName());
  }
}
