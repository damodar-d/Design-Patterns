public interface EmployeeDao {

     void create(String client, Employee e) throws Exception;
     void delete(String client, int employeeId) throws Exception;
     Employee getEmployee(String client, int employeeId) throws Exception;

}
