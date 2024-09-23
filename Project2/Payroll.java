package project2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Payroll {
    private Map<Employee, Double> employeePayroll;

    public Payroll() {
        employeePayroll = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employeePayroll.put(employee, employee.getSalary());
    }

    public void removeEmployee(Employee employee) {
        employeePayroll.remove(employee);
    }

    public Set<Employee> getEmployees() {
        return employeePayroll.keySet();
    }

    public double getSalary(Employee employee) {
        return employeePayroll.getOrDefault(employee, 0.0);
    }

    public void updateSalary(Employee employee, double newSalary) {
        if (employeePayroll.containsKey(employee)) {
            employeePayroll.put(employee, newSalary);
            employee.setSalary(newSalary);
        }
    }

    public double calculateTotalPayroll() {
        double total = 0.0;
        for (double salary : employeePayroll.values()) {
            total += salary;
        }
        return total;
    }
}
