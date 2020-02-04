/* import 'TestPackage' class from 'names' latihan1 */
import com.tutorial.latihan1.TestPackage;

public class Control 
{
   public static void main(String args[]) 
   {       
      // Initializing the String variable 
      // with a value 
      String name = "Selamat Belajar Package Java";
      
      // Creating an instance of class MyClass in 
      // the package.
      TestPackage obj = new TestPackage();
      
      obj.getNames(name);
   }
}
