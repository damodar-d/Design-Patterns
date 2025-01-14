public class NullEmployee implements Employee{
    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public String getDepartment() {
        return "";
    }

    @Override
    public String getEmployeeId() {
        return "";
    }
}
