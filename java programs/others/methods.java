public class methods {
    int emp_id;
    String emp_name;
    double emp_salary;
    void employee(int a ,String b,double c){
        emp_id = a;
        emp_name =b;
        emp_salary =c;
    }
    void display(){
        System.out.println("employee id: :" +emp_id);
        System.out.println("employee name: " +emp_name);
        System.out.println("employee salary: "+emp_salary);
    }
    public static void main(String args[]){
        methods one = new methods();
        one.employee(5,"edwin",45000);
        one.display();

    }
}
