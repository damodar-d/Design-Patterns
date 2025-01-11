public class EmployeeFactory {

    public static Employee getEmployee(String name){
        return switch (name) {
            case "android" -> new AndroidDeveloper();
            case "web" -> new WebDeveloper();
            default -> null;
        };
    }
}
