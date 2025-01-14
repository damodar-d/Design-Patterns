public class Main {
    public static void main(String[] args) {

        EmployeeDao employee = new EmployeeDaoProxy();
        try {
            employee.create("ADMIN",new Employee());
            System.out.println("Operation Successful");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Operation Failed");
        }
    }
}