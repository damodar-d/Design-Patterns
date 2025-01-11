public class Main {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee androidDeveloper = EmployeeFactory.getEmployee("android");
        System.out.println(androidDeveloper.getSalary());

        Employee webDeveloper = EmployeeFactory.getEmployee("web");
        System.out.println(webDeveloper.getSalary());

    }
}