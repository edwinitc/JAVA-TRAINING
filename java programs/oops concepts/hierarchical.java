class Teacher {
    void specialization(){
        System.out.println("maths & statistics");
    }
}
class student1 extends Teacher{
    void maths(){
        System.out.println("to learn maths");
    }
}

class student2 extends Teacher{
    void Statistics(){
        System.out.println("to learn statistics: ");
    }
}

public class hierarchical{
    public static void main(String[] args)
    {
        student2 s = new student2();
        s.Statistics();
        s.specialization();
        student1 s1 = new student1();
        s1.maths();
        s1.specialization();
    }
}








