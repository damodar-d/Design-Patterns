public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, Employee e) throws Exception {

        System.out.println("Created a new row in employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {

        System.out.println("Deleted a row with employeeId: "+ employeeId);
    }

    @Override
    public Employee getEmployee(String client, int employeeId) throws Exception {
        return new Employee();
    }
}
