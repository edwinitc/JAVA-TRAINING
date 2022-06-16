package encapsulation;
class employee {
    private String emp_name;
    private int emp_id;
    private String emp_department;

    public String getEmp_name() {
        return emp_name;
    }

    public void setemp_name(String emp_name) {
        this.emp_name = emp_name;
    }


    public int getemp_id() {
        return emp_id;
    }

    public void setemp_id(int emp_id) {
        this.emp_id = emp_id;
    }


    public String getEmp_department() {
        return emp_department;
    }

    public void setemp_department(String emp_department) {
        this.emp_department = emp_department;
    }


    public class encap {
        public static void main(String[] args) {
            employee obj = new employee();
            obj.setemp_department("mech");
            obj.setemp_id(25);
            obj.setemp_name("edwin");
        }
    }
}
