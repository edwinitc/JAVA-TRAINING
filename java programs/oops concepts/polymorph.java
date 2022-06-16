public class polymorph {
    static int add(int a,int b){
        int c =  a + b;
        return c;
    }
    static double add(double a,double b,double c){
        double d =  a+b+c;
        return d;
    }
    public static void main(String[] args){
        System.out.println(polymorph.add(25,50));
        System.out.println(polymorph.add(200,5000,7006));
    }
}
