abstract class abst {
    abstract void c();
    public void java(){
        System.out.println("programming language");
    }
}
    class  python extends abst{
    void display() {
        System.out.println("pyton is also a programming language");
    }
    public static void main(String[] args){
        python obj1 = new python();
        obj1.display();
        obj1.java();
    }
}