package Exceptions;
import java.io.*;

public class exceptt {
    public static void main(String[] args){
        char[] array = new char[50];
        try {
            FileInputStream a = new FileInputStream("d:\\kings.txt");
            InputStreamReader obj = new InputStreamReader(obj);
            obj.read(array);
            System.out.println(array);
            obj.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
