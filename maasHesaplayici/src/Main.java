public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Bayram", 1000, 45, 2012);
        Employee e2 = new Employee("Muhammed", 1200, 48,2020);
        e1.toStringPrint();
        e1.tax();
        e1.bonus();
        e1.reiseSalary();
    }
}