public class Developer implements Employee {
    private String name;
    private String position;
    private String empId;
    private int salary;

    public Developer(final String name, final String position, final String empId, final int salary) {
        this.name = name;
        this.position = position;
        this.empId = empId;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails(final int tabs) {
        System.out.println();
        for (int i=0;i<tabs;++i) System.out.print("\t");
        System.out.println(name + "'s Details");
        for (int i=0;i<tabs;++i) System.out.print("\t");
        System.out.print("\tid: " + empId);
        System.out.print(", salary: " + salary);
        System.out.print(", position: " + position);
        System.out.println();
    }
}
