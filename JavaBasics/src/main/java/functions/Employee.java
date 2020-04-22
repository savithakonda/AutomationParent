package functions;

public class Employee {
    String empName;
    Integer empId;

    // All arguments constructor
    public Employee(String empName, Integer empId) {
        this.empName = empName;
        this.empId = empId;
    }

    // No arguments constructor
    public Employee() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                '}';
    }
}
