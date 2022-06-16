public class construct {     //constructor program
    int id;
    String name;
    construct(int a,String s){
        id = a;
        name = s;
        System.out.println(" i am a constructor");

    }

    void car(){
        System.out.println(id +" "+ name);

    }
    void bike(int b){
        System.out.println(b);
    }

    public static void main(String args[]){
        construct a = new construct(48709,"edwin");
        a.car();
        a.bike(3);
    }
}
