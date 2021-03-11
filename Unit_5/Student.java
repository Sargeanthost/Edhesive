package Unit_5;
// Unit 5: Lesson 8 - Coding Activity

public class Student {

  private static int studentIdCounter = 1;

  private String fName = "";
  private String lName = "";
  private int studentId = 0;
  private int gLevel = 0;
  private double gpa = 0.0;

  public Student() {

    studentId = studentIdCounter;
    studentIdCounter++;
    fName = "None";
    lName = "None";
    gpa = 0;
    gLevel = 0;
  }

  public Student(String firstName, String lastName, int gradeLevel, double gpa) {

    studentId = studentIdCounter;
    studentIdCounter++;
    fName = firstName;
    lName = lastName;
    this.gpa = gpa >= 0 && gpa <= 4.5 ? gpa : 0;
    gLevel = gradeLevel >= 0 && gradeLevel <= 12 ? gradeLevel : 0;
  }

  @Override
  public String toString() {

    return lName
        + ", "
        + fName
        + "\nGPA: "
        + gpa
        + "\nGrade Level: "
        + gLevel
        + " id # "
        + studentId;
  }
}
