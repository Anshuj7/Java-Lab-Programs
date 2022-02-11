// Java - Example of method overriding 
class Maths
{
    int num1, num2;
    public int mathOperation(int a, int b)	//performing addition operation on two integers.
    {
        num1=a;
        num2=b;
        return (num1+num2);
    }
}
//Subtract class is inheriting Maths class.
class Subtract extends Maths
{
    public int mathOperation(int a, int b)	//mathOperation is overridden to perform subtract operation on two integers.
    {
	    num1=a;
	    num2=b;
	    return (num1-num2);
    }   
}
class prog29
{
    public static void main(String... ar)
    {
	    Subtract ob = new Subtract();
	    System.out.println(ob.mathOperation(5,2));
    }
}