public class prog18 {
    public static void main(String[] args)   
    {   
        prog18 obj = new prog18();   
        System.out.println(obj.hashCode());   
        obj = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("end of garbage collection");   
  
    }   
    @Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }   
}
