public class fibonacci {
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int c=0;
        int limit =10;
        int i=1;
        for(i=1;i<=limit;++i)
        {
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}

