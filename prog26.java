class ConstOvrrd
{
    public ConstOvrrd(String str)
    {
        System.out.println("Base Class Constructor: "+str);
    }
}
class SubClass extends ConstOvrrd
{
    public SubClass(String str)
    {
        super(str);
        System.out.println("Sub Class Constructor: "+str);
    }
}
public class prog26 {
    public static void main(String[] args) {
        SubClass obj = new SubClass("called");
    }
}
