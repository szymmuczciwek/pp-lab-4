package employees;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Jan Kowalski", 50000, 0);
        employees[1] = new Worker("Anna Nowak", 60000, "Junior");
        employees[2] = new Employee("Karol Wójcik", 70000);
        employees[3] = new Worker("Wojciech Kowalczyk", 55000, "Senior");
        employees[4] = new Worker("Mateusz Nowak", 65000, "Intermediate");

        System.out.println("Wszyscy pracownicy::");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
