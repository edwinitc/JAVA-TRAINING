public class function {
    int num;
    String name;
    //function without parameter
    void working(){
        System.out.println("all are working");
    }
    // fucntion with parameter
    void display(int a){
        System.out.println(a);
    }
    public static void main(String args[]) {
        function b = new function();
        b.working();
        b.display(3);
    }
}
