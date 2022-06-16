public class armstrongnumbers {
    public static void main(String[] args){
        int a = 371;
        int b,c = 0;
        double d = 0;
        b=a;
        while(b!=0)
        {
            c=b%10;
            d = d + c*c*c;
            b /=10;
        }
        if(d == a )
            System.out.println(a + " is an armstrong number");
        else
            System.out.println(a + " is not an armstrong number");

    }
}

