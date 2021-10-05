
/**
 * Write a description of class Module here.
 *
 * @author (Daniel Chorlton)
 * @version (v1.0 05-10-2021)
 */
public class Module
{
    // instance variables - created variables for class
    private String code;
    private String title;
    private int value;

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String code)
    {
        // initialise instance variables
        code = code;
        title = title;
        value = value;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getCode()
    {
        return code;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void setValue(int value)
    {
        this.value = value;
    }
    public void printInfo()
    {
        printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println();
    }
    /**
     * Print out the details of the course to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Module Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }

}
