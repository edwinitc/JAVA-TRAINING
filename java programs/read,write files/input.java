import java.io.FileOutputStream;

public class input {
    package exceptions;
import java.io.*;

    public class except {
        public static void main(String[] args) {
            FileOutputStream a = new FileOutputStream("D:\\java.txt.txt");
            String c = "welcome";
            byte b[] = c.getBytes();
            a.write(b);
            a.write(65);
            a.close();
            System.out.println("byte");
        }
    catch(
        Exception e)

        {
            e.getStackTrace();
        }
    }
}


}
