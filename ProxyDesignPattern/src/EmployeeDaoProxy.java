public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDaoImpl employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee e) throws Exception {

        if (client.equals("ADMIN")) {
            this.employeeDao.create(client,e);
            return;
        }
        throw new Exception("Invalid Action Performed. Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN")) {
            this.employeeDao.delete(client,employeeId);
            return;
        }
        throw new Exception("Invalid Action Performed. Access Denied");
    }

    @Override
    public Employee getEmployee(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return this.employeeDao.getEmployee(client,employeeId);
        }
        throw new Exception("Invalid Action Performed. Access Denied");
    }
}
