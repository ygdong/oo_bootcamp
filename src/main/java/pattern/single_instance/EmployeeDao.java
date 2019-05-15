package pattern.single_instance;

public class EmployeeDao {
    private static EmployeeDao employeeDao;


    private EmployeeDao() {
    }


    public static EmployeeDao getEmployeeDao() {
        if (employeeDao != null)
            return employeeDao;
        else {
            employeeDao = new EmployeeDao();
            return employeeDao;
        }
    }
}
