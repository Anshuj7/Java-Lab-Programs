class Bank
{  
    float getRateOfInterest()
    {
        return 0;
    }  
}  

class SBI extends Bank
{  
    float getRateOfInterest()
    {
        return 5.4f;
    }  
}  

class HDFC extends Bank
{  
    float getRateOfInterest()
    {
        return 5.6f;
    }  
}  

class AXIS extends Bank
{  
    float getRateOfInterest()
    {
        return 5.7f;
    }  
}  

class IDFC extends Bank
{  
    float getRateOfInterest()
    {
        return 6.0f;
    }  
}  

public class prog23 {
    public static void main(String args[])
    {  
        System.out.println("Top Banks with best Rate of Interest: \n");  
        Bank b;  
        b=new SBI();  
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
        b=new HDFC();  
        System.out.println("HDFC Rate of Interest: "+b.getRateOfInterest());  
        b=new AXIS();  
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest()); 
        b=new IDFC();  
        System.out.println("IDFC Rate of Interest: "+b.getRateOfInterest());
    }  
}