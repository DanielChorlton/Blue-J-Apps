/**
 * The Student class contains essential information that identifies 
 * a student at BNU.  The class also contains information 
 * concerning the course the student is currently enrolled on
 * 
 * @author Michael Kölling and David Barnes
 * @modified by Daniel Chorlton
 * @version 1.0 2021:10:05
 */
public class Student
{
    // A unique 8 digit BNU identifier
    private int id;
    // the student's full name
    private String name;
    // The course the student is enrolled on
    private Course course;
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

     /**
     * Return the student ID of this student.
     */
    public int getID()
    {
        return id;
    }

    /**
     * Add the ability to enroll a student onto a course.
     */
    public void enrol(Course course)
    {
        this.course = course;
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(" Student ID: " + id + " Name: " + name);
    }
    
    /**
     * Print the course a student is enrolled onto and the modules added.
     */
    
    public void printCourse()
    {
        course.print();
    }
}
