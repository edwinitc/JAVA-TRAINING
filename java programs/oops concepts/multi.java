class india {
    void country() {
        System.out.println("india is my country");
    }
}

class tn{
    void country(){
        System.out.println("Tn is in india: ");
    }
}

class ap{
    void country(){
        System.out.println("ap is in india: ");
    }
}

public class multi {
    public static void main(String[] args) {
        ap state1 = new ap();
        state1.country();
        tn state2 = new tn();
        state2.country();
    }
}