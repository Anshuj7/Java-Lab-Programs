public class prog21 {
    static int count;
    private prog21()      //private default
    {
        count++;
        System.out.println("Inside Default Constructor "+count);
    }
    public static void main(String arg[])
    {
        prog21 p1=new prog21();
        prog21 p2=new prog21();
        prog21 p3=new prog21();
        prog21 p4=new prog21();
        prog21 p5=new prog21();
        prog21 p6=new prog21();
        prog21 p7=new prog21();
        System.out.println("Instances of Default Constructor Created: "+count);
    }
}
