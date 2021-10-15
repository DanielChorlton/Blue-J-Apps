
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
    private int creditValue;

    /**
     * Constructor for objects of class Module
     */
    
    public Module(String title, String code)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        this.creditValue = creditValue;
    }

    
    /**
     * Constructor for objects of class Module
     */
    
    public String getCode()
    {
        return code;
    }
    
    /**
     * Constructor will return the tile of the module.
     */
       
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Constructor will return the value of the module.
     */
    
    public int getValue()
    {
        return creditValue;
    }
    
    /**
     * Constructor will provide the ability to set the value of the module.
     */
    
    public void setValue(int value)
    {
        this.creditValue = creditValue;
    }
    
    
    /**
     * This will add the module details to the terminal.
     */
    
    public void printInfo()
    {
       
        System.out.println(" Module Code: " +    code + ": " + title + " : " + "Credit Value: " + creditValue);
        System.out.println();
                
    }
    

}
