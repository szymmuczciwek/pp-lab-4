public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Jan Kowalski", 50000);
        employees[1] = new Employee("Anna Nowak", 60000);
        employees[2] = new Employee("Karol Wójcik", 70000);
        employees[3] = new Employee("Wojciech Kowalczyk", 55000);
        employees[4] = new Employee("Mateusz Nowak", 65000);

        System.out.println("Pracownik z indeksem 3: ");
        System.out.println(employees[3]);

        employees[3].setSalary(60000);

        System.out.println("\nWszyscy pracownicy:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
