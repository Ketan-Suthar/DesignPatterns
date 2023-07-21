import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee {
    private String name;
    private List<Employee> employeesList;

    public Directory(final String name) {
        this.name = name;
        employeesList = new ArrayList<>();
    }

    @Override
    public void showEmployeeDetails(final int tabs) {
        System.out.println();
        for (int i=0;i<tabs;++i) System.out.print("\t");
        System.out.print(" Showing all employees under directory: " + name);
        for(final var emp: employeesList)
            emp.showEmployeeDetails(tabs+1);
        System.out.println();
    }

    public void addEmployee(final Employee employee) {
        employeesList.add(employee);
    }

    public void removeEmployee(final Employee employee) {
        employeesList.remove(employee);
    }
}
