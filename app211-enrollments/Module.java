
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
        this.code = code;
        this.title = title;
        this.value = value;
    }

    
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
    
    
    /**
     * This will add the module details to the terminal.
     */
    public void printInfo()
    {
       
        System.out.println(" Module Code: " + code + ":" + title + ":" + " Credit Value " + ":" + value);
        System.out.println();
                
    }
    

}
