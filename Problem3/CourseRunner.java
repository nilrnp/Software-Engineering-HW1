package Homework1.Problem3;

public class CourseRunner {

    public static void main(String[] args) {
        Course course1 = new Course("CS 4800","Nima","Davarpanah",25,"Clean Code","Robert Martin","Prentice Hall");
        Course course2 = new Course("CS 4900","John","Doe",1,"Advanced Software","Jane Doe","Pearson");

        course1.printCourseDetails();
        course2.printCourseDetails();
    }
}
