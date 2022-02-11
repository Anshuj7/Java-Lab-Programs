class prog33 implements Cloneable {
    String name;
    int version;
    public static void main(String[] args) {
      prog33 obj1 = new prog33();
      obj1.name = "Java";
      obj1.version = 14;
  
      System.out.println(obj1.name);       
      System.out.println(obj1.version);     
      try {
        prog33 obj2 = (prog33)obj1.clone();
        System.out.println(obj2.name);      
        System.out.println(obj2.version);   
        obj2.name = "C#";
        obj2.version = 10;
        System.out.println(obj2.name);  
        System.out.println(obj2.version);  
        System.out.println(obj1.name);      
      }
      catch (Exception e) {
        System.out.println(e);
      }
  
    }
  }