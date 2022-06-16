package exceptions;

public class exceptions {
    public static void main(String[] args){
        try{
            int divide = 10/0;
            System.out.println("division");
        }
        catch(ArithmeticException e){
            System.out.println("error is occured");

        }
        finally{
            System.out.println("finally rectified");
        }
    }
}
