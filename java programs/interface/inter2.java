package javaproj123;
interface movie{
    void watch();
}
interface series{
    void watch2();
}
class first implements movie,series{

    public void watch() {
        System.out.println("first movies");

    }

    @Override
    public void watch2() {
        System.out.println("first series");
    }
}
public class inter2{
    public static void main(String[] args){
        first a = new first();
        a.watch();
        a.watch2();
    }
}
