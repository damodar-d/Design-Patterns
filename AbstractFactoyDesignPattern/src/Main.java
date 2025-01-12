public class Main {
    public static void main(String[] args) {

       Employee android =  EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println(android.getName());
        System.out.println(android.getSalary());
    }
}