package comparable_comparator;

public class Employee implements Comparable<Employee>{

    private Integer empId;
    private String empName;
    private String email;
    private Long salary;

    public Employee(Integer empId, String empName, String email, Long salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

   /* @Override
    public int compareTo(Employee o) {
        if(this.getEmpId() > o.empId)
            return 1;
        else if (this.getEmpId() < o.getEmpId())
            return -1;
        else
            return 0;
    }*/
   @Override
   public int compareTo(Employee o) {
           return o.getEmpName().compareTo(this.getEmpName());
   }
}
