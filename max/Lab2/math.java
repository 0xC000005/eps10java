
/**
 * Write a description of class math here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class math
{
    private double num1,num2;
    private Input myInput;
    private int judge;
    /**
     * Constructor for objects of class math
     */
    
    //init
    public math()
    {
        myInput= new Input();
    }
    
    public void math(double _num1,double _num2,int _judge)
    {
        num1=_num1;
        num2=_num2;
        judge=_judge;
    }
    
    public void mathInput()
    {
        System.out.print("Enter the first number: ");
        num1=myInput.getInt();
        System.out.print("Enter the second number: ");
        num2=myInput.getInt(); 
        System.out.print("Display? (0/1): ");
        judge=myInput.getInt();
        if(judge==1)display();
        else System.out.print("Display cancel");
        
        
    }

    public void addition()
    {
        System.out.println(num1+"+"+num2+"="+(num1+num2));
    }
    public void subtraction ()
    {
        System.out.println(num1+"-"+num2+"="+(num1-num2));
    }
    public void multiplication  ()
    {
        System.out.println(num1+"*"+num2+"="+(num1*num2));
    }
    public void divation()
    {
        System.out.println(num1+"/"+num2+"="+(num1/num2));
    }
    
    public void display()
    { //pact the func plz !!!
        addition();
        subtraction ();
        multiplication  ();
        divation();
    }
}
