import java.util.Objects;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeeLocation;

    public Employee(String employeeId, String employeeName, String employeeEmail, String employeeLocation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeLocation = employeeLocation;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeeLocation() {
        return employeeLocation;
    }

    @Override
    public String toString() {
        return "\n" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeLocation='" + employeeLocation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getEmployeeId(), employee.getEmployeeId()) &&
                Objects.equals(getEmployeeName(), employee.getEmployeeName()) &&
                Objects.equals(getEmployeeEmail(), employee.getEmployeeEmail()) &&
                Objects.equals(getEmployeeLocation(), employee.getEmployeeLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId(), getEmployeeName(), getEmployeeEmail(), getEmployeeLocation());
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public void setEmployeeLocation(String employeeLocation) {
        this.employeeLocation = employeeLocation;
    }
}
