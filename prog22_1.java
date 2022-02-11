class A
{
    int i;
}
class B extends A
{
    int j;
    void sum()
    {
        System.out.println("i+j : " + (i+j));
    }
}

public class prog22_1 
{
    public static void main(String[] args)
    {
    B b = new B();
    b.i=20;
    b.j=15;
    b.sum();
    }   
}