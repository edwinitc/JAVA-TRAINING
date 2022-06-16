
    public class sininheritance {
        static int i = 15 ;
        public static void test()
        {

            System.out.println("from test() of pro 1");
        }
    }

    class b extends sininheritance
    {
        public static void main(String args[])
        {
            System.out.println(i);
        }
    }


