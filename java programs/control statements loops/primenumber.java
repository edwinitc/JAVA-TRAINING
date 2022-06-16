public class primenumber {
    public static void main(String args[]) {
        int a = 5;
        boolean flag = false;
        for (int i = 2; i < a; ++i) {
            if (a % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(a + " is a prime nuber");
        else
            System.out.println(a + " is not a prime number");
    }
}