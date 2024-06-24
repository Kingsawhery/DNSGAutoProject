package quangtester.com.helpers;
import java.io.File;

public class SystemsHelper {
    public static String getCurrentDir(){
      String current = System.getProperty("user.dir")+"/";
      return current;
    }
}
