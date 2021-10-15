import java.util.*;

/**
 * This class contains information about an undergraduate course
 * at BNU together with a list of student who are enrolled
 *
 * @author Derek Peacock
 * @modified Daniel Chorlton
 * @version 2.0 05/10/2021
 */
public class Course
{
    // A unique identifier e.g. BT1CTG1
    private String code;
    // The full title including qualification and subject
    private String title;
    //The course most have a module. this is where the module will be stored.
    private Module module;
    
    /**
     * this is a constructor that is going to pull course code and title.
     * 
     */
    public Course(String code, String title)
    {
        this.code = code;
        this.title = title;
    }
    
    /**
     * This is a will provide the ability to add a module to a course
     */
    public void addModule(Module module)
    
    {
        this.module = module;
    }

    
    /**
     * This constructor will print the course details and the details
     * of the modules added to the course with the corresponding credit value.
     */
    //Inserted a modified print method to include module code and details.
    public void print()
    {
        printHeading();
        
        System.out.println(" Course Code: " + code + ": " + title);
        System.out.println();
        module.printInfo();
    
    }
    

    /**
     * Print out the details of the course to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Course Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }
    
}
