public class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
    }

    public void increment() {
        this.salary += 1000.00;
    }
}

class Manager extends Employee {

    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary); //super constructor used to call constructor of parent class
    }

    public static void main(String[] args) {
        Manager manager = new Manager("12345","IT Department",500.00);
        System.out.println("Employee ID : " + manager.employeeID);
        System.out.println("Department : " + manager.department);
    }
}
//Employee ID : 12345
//Department : IT Department
