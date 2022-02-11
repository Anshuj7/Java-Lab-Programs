public class prog20 {
    int n;
    prog20()
    {
        System.out.println("Default Constructor");
    }
    
    prog20(int x, int y)
    {
        System.out.println("Addition is "+(x+y));
    }
    
    prog20(int a)
    {
        n=a;
        System.out.println("Number is "+n);
        
        int i,j,flag;
        
        for(i=1;i<=n;i++)
        {
            flag=0;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag++;
                    break;
                }
            }
            
            if(flag==0)
            {
                System.out.println("Prime is "+i);
            }
        }
    }
    
    prog20(prog20 cp, int a)
    {
        n=cp.n;
        int max;
        max=a>n?a:n;
        System.out.println("Maximum number is "+max);
    }
    
    public static void main(String arg[])
    {
        prog20 cp1=new prog20(5,6);
        prog20 cp2=new prog20(5);
        prog20 cp3=new prog20(cp2,5);
    }
}



