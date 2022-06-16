import java.util.Scanner;

public class odd_or_even {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("enter a number: ");
        int b = a.nextInt();
        if(b%2 == 0)
            System.out.println(b + " is even number");
        else
            System.out.println(b + " is odd number");

    }
}
