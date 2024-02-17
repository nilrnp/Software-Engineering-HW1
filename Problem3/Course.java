package Homework1.Problem3;

public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String courseName,String firstName,String lastName,int officeNumber,String title, String author, String publisher)
    {
        this.courseName = courseName;
        this.instructor = new Instructor(firstName,lastName,officeNumber);
        this.textbook = new Textbook(title,author,publisher);
    }

    public void printCourseDetails()
    {
        System.out.println("\n" + courseName + " Course Information: ");
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Office Number: " + instructor.getOfficeNumber());
        System.out.println("Course Textbook: " + textbook.getTitle() + " by " + textbook.getTitle() + " published by " + textbook.getPublisher());
    }



}
