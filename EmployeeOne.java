//Encapsulation example
public class EmployeeOne{
    
    private int employeId;
    private String name;
    private double salary;

    public void set(int employeId, String name, double salary){
        this.employeId = employeId;
        this.name = name;
        this.salary = salary;
    }

    public void get(){
        System.out.println("Employee ID: " + employeId + ", Name: " + name + ", Salary: " + salary);
    }
    
    public static void main(String[] args) {
        EmployeeOne emp = new EmployeeOne();
        emp.set(23456,"Ritika Ranjan", 55000);
        emp.get();
    }


}
