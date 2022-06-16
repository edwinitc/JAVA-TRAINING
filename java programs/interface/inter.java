package javaproj123;
interface sports{
    void team();
}
public class inter implements sports{
    public void team() {
        System.out.println("csk");
    }
    public static void main(String[] args){
        inter obj = new inter();
        obj.team();
    }
}