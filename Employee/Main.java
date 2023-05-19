package Employee;

public class Main {

    public static void main(String[] args) {

        Employee Kemal = new Employee("Kemal" , 2000, 45,1985);
        Employee Ali = new Employee("Ali" , 2500, 39,1972);

        Kemal.printInfo();
        Ali.printInfo();
    }
}
