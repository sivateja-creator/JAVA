import java.io.File;
public class A
{
    public static void main(String[] args) 
    {
        try {
        File Data = new File("Sample.java");
        Data.createNewFile();    
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }    
}
//File Creation



