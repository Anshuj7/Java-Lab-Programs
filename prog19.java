class Test
{
    private int n;
    void setdata(int n)
    {
        this.n = n; //accessing private member (n) using this keyword.
    }
    void getdata()
    {
        System.out.println("n=" + n);
    }
}

public class prog19 {
    public static void main(String[] args)
    {
    Test obj1 = new Test();
    obj1.setdata(5);
    obj1.getdata();
    }   
}
