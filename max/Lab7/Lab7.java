/**
 * Write a description of class Lab6 here.
 *
 * @author Max
 * @version 2019-03-05
 */
public class Lab7
{
    // instance variables - replace the example below with your own
    private Input MyInput;
    /**
     * Constructor for objects of class Lab6
     */
    public Lab7()
    {
        // initialise instance variables
        MyInput=new Input();
        main();
    }
    public void main()
    {
        System.out.print("Enter the integer: ");
        int NumString=MyInput.getInt(),divider=10;
        int count=Integer.toString(NumString).length()-1,sum=0;
        for(int i=0;i<count;++i)
        {
            divider*=10;
        }
        count++;
        while(count>0)
        {
            count--;
            NumString%=divider;
            divider/=10;
            sum+=NumString/divider;
        }
        System.out.println("Sum of digits is "+sum);
    }

}

