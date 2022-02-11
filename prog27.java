class Cs
{
    int p,q;
    public Cs(){}
    public Cs(int x, int y)
    {
        p=x;
        q=y;
    }
    public int add(int i, int j)
    {
        return (i+j);
    }
    public int add(int i, int j, int k)
    {
        return (i+j+k);
    }
    public float add(float f1, float f2)
    {
        return (f1+f2);
    }
    public void printData()
    {
        System.out.print("Value of p = "+p);
        System.out.println("\t\tValue of q = "+q);
    }
}

class prog27
{
    public static void main(String args[])
    {
        int x=2, y=3, z=4;
        float m=7.2F, n=5.2F;

        Cs c=new Cs();
        Cs c1=new Cs(x, z );

        c1.printData();

        int k = c.add(x,y);
        int t = c.add(x,y,z);
        float ft = c.add(m, n);

        System.out.println("\nFrom Param Constructor, k = "+k);
        System.out.println("From Overloaded Method-1, t = "+t);
        System.out.println("From Overloaded Method-2, ft = "+ft);
    }
}
