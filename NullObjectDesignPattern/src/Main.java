public class Main {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEMployee("ANDROID");
        System.out.println(employee.getSalary());

        employee = EmployeeFactory.getEMployee("WEB");
        System.out.println(employee.getSalary());

        employee=EmployeeFactory.getEMployee("Hello World");
        System.out.println(employee.getSalary());
    }
}