/**
 * Write a description of class Pizza here.
 *
 * @author Max
 * @version 2019-02-26
 */
public class Pizza
{
    private String FirstName,LastName,Address,Topping1,Topping2,Topping3;
    private int SizeInInches=8;
    private boolean Extra_cheese;
    private Input myInput;
    public static final double PI= 3.14;
    public Pizza()
    {
        myInput=new Input();
    }
    public void Pizza(String _firstName,String _lastName,String _address,String _topping1,String _topping2,String _topping3,boolean _Extra_cheese)
    {
        setFirstName(_firstName);
        setLastName(_lastName);
        setAddress(_address);
        setTopping1(_topping1);
        setTopping2(_topping2);
        setTopping3(_topping3);
        setSizeInInches();
        setExtra_cheese(_Extra_cheese);
    }
    public void setFirstName(String _firstName)
    {
        FirstName=_firstName;
    }
    public String getFirstName()
    {
        return FirstName;   
    }
    public void setLastName(String _lastName)
    {
        LastName=_lastName;
    }
    public String getLastName()
    {
        return LastName;   
    }
    public String returnFullName()
    {
        return FirstName+" "+LastName;
    }
    public void setAddress(String _address)
    {
        Address=_address;
    }
    public String getAddress()
    {
        return Address;   
    }
    public void setTopping1(String _topping1)
    {
        Topping1=_topping1;
    }
    public String getTopping1()
    {
        return Topping1;  
    }
    public void setTopping2 (String _topping2 )
    {
        Topping2=_topping2;
    }
    public String getTopping2()
    {
        return Topping2;   
    }
    public void setTopping3(String _topping3) 
    {
        Topping3=_topping3;
    }
    public String getTopping3()
    {
        return Topping3;   
    }
    public void setSizeInInches()
    {
        System.out.print("Please enter the size of the pizza:");
        int _SizeInInches=myInput.getInt();
        if(_SizeInInches!=8)
            if(_SizeInInches!=10)
                if(_SizeInInches!=12)
                    if(_SizeInInches!=14)
                    {
                        System.out.println("Illegal input, pizza size can only be 8,10,12,14 inches.");
                        setSizeInInches();
                    }
        SizeInInches=_SizeInInches;        
    }
    public int getSizeInInches()
    {
        return SizeInInches;
    }
    public void setExtra_cheese(boolean _Extra_cheese)
    {
        Extra_cheese=_Extra_cheese;
    }
    public boolean getExtra_cheese()
    {
        return Extra_cheese;
    }
    public String PizzaDetail()
    {
        //EO:10 inch Pepperoni Mushroom and Sausage with extra Cheese 
        String base=getSizeInInches()+" inch "+getTopping1()+" "+getTopping2()+" and "+getTopping3()+" ";
        if(getExtra_cheese()==true)
        {
            String cheese="with extra Cheese " ;
            return base+cheese;
        }
        return base;
    }
    public double price()
    {
        double base=4.99,extra=2.5,r=getSizeInInches()/2,sq=PI*r*r;
        if(getSizeInInches()==8)base=4.99;
        if(getSizeInInches()==10)base=6.99;
        if(getSizeInInches()==12)base=9.99;
        if(getSizeInInches()==14)base=10.99;
        if(sq>100)extra=3.99;
        if(getExtra_cheese())
            return base+extra;
        else 
            return base;
    }
    public void displayPizza()
    {
        System.out.println("Name: "+returnFullName());
        System.out.println("Address: "+getAddress());
        System.out.println("Pizza: "+PizzaDetail());
        System.out.println("Cost: $"+price());
    }
}
