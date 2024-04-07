package employees;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
        employees[0] = new Manager("Jan Kowalski", 75000, 0);
        employees[1] = new Worker("Anna Nowak", 60000, "Junior");
        employees[2] = new Employee("Karol Wójcik", 70000);
        employees[3] = new Worker("Wojciech Kowalczyk", 55000, "Senior");
        employees[4] = new Worker("Mateusz Nowak", 65000, "Intermediate");
        employees[5] = new Manager("Alicja Balla", 85000, 0);
        employees[6] = new Worker("Daria Kozłowska", 62000, "Senior");

        for (Employee employee : employees) {
            double currentSalary = employee.getSalary();
            employee.setSalary(currentSalary + 500);
        }
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(5); 
                employee.setSalary(75000);
            }
        }

        System.out.println("Zaktualizowane informacje dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
