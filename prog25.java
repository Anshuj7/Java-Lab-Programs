class Util
{
    static int counter = 0;
 
    public Util() {
        counter++;
    }
 
    public void getCount() {
        System.out.println("Total number of Util instances so far: " + counter);
    }
}
 
public class prog25
{
    public static void main(String[] args)
    {
        Util ob1 = new Util();
        ob1.getCount();
 
        Util ob2 = new Util();
        ob2.getCount();
 
        Util ob3 = new Util();
        ob3.getCount();
    }
}