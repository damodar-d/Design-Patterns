public class EmployeeFactory {

    public static Employee getEMployee(String employee){
        if(employee.equals("ANDROID")){
            return new AndroidDeveloper();
        }
        if(employee.equals("WEB")){
            return new WebDeveloper();
        }
        return new NullEmployee();
    }
}
