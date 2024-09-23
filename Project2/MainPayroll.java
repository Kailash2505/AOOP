package project2;

public class MainPayroll {
    public static void main(String[] args) {
        Employee emp1 = new Employee("001", "Daenerys Targeryn", 5000);
        Employee emp2 = new Employee("002", "Jon Snow", 6000);
        Employee emp3 = new Employee("003", "John Wick", 5500);

        Payroll payroll = new Payroll();

        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);
        payroll.addEmployee(emp3);

        System.out.println("Total Payroll: " + payroll.calculateTotalPayroll());

        payroll.updateSalary(emp1, 5200);
        System.out.println("Updated Payroll for Daenerys Targeryn: " + payroll.getSalary(emp1));

        payroll.removeEmployee(emp2);
        System.out.println("Total Payroll after Jon Snow removal: " + payroll.calculateTotalPayroll());
    }
}

