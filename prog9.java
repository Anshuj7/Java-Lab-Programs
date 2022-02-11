public class prog9
{
        public static void main(String args[])
        {
                String s= "%M2E = $bgF f$EDny";
                int count[]=new int[5];
                String val[]={"Uppercase letters:  ", "Lowercase letters:  ","Numbers:\t    ","Blank Spaces:\t    ","Special Characters: "};
        
                for(int i=0;i<s.length();i++) 
                {
                        char res=s.charAt(i);
                        if(res>='A'&&res<='Z')
                                count[0]++;
                        else if(res>='a'&&res<='z')
                                count[1]++; 
                        else if(res>='0'&&res<='9') 
                                count[2]++;  
                        else if(res==' ')
                                count[3]++; 
                        else 
                                count[4]++;
                }
        
                System.out.println("\nAvailable String: '"+s+"'\n");
                System.out.println("The number of occurrences is as follows: \n");                                     
                for(int i=0;i<count.length;i++)
                    System.out.println(val[i]+count[i]+"\n");
            }
        }