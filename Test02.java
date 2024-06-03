import java.util.HashSet;

class Employee {
    private int employeeID;
    private String employeeName;

    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee other = (Employee) obj;
            return this.employeeID == other.employeeID;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + "]";
    }
}

public class Test02 {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();

        Employee emp1 = new Employee(1, "John");
        Employee emp2 = new Employee(2, "Alice");
        Employee emp3 = new Employee(3, "Bob");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        Employee emp4 = new Employee(1, "Jane");
        employees.add(emp4); // This employee will not be added because emp1 and emp4 have the same employeeID

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
