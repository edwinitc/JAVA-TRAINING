public class poly {
    static String name(String first_name,String last_name){
        String full_name = first_name + last_name;
        return full_name;
    }
    static  String name(String first_name,String last_name,String initial) {
        String full_names = first_name + last_name + initial;
        return full_names;
    }
    public static void main(String args[]){
        System.out.println(poly.name("edwin ","victor"));
        System.out.println(poly.name("edwin ","victor ","j"));
    }

}
