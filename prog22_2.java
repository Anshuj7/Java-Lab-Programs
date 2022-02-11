class mammal
{  
    void eat()
    {
        System.out.println("eating...");
    }  
}  

class human extends mammal
{  
    void sleep()
    {
        System.out.println("sleeping...");
    }  
}  

class coder extends human
{  
    void code()
    {
        System.out.println("coding...");
    }  
}  
    

class prog22_2
{  
    public static void main(String args[])
    {  
        System.out.println("Life of a coder: \n");
        coder prgmr=new coder();  
        prgmr.code();  
        prgmr.sleep();  
        prgmr.eat();  
    }
}  