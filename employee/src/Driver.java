public class Driver {
    public static void main(String[] args) {
        Employee e1 = new Developer("Luffy", "SDE-3", "D01", 1000);
        Employee e2 = new Developer("Zero", "SDE-2", "E01", 1000);

        Directory sdeDirectory = new Directory("SDE Directory");
        sdeDirectory.addEmployee(e1);
        sdeDirectory.addEmployee(e2);
//        sdeDirectory.showEmployeeDetails(0);

        Employee e3 = new Manager("Naruto", "PM-1", "PM01", 1000);
        Employee e4 = new Manager("Sasuke", "Senior-PM", "PM02", 1000);

        Directory managerDirectory = new Directory("Manager Directory");
        managerDirectory.addEmployee(e3);
        managerDirectory.addEmployee(e4);
        managerDirectory.addEmployee(sdeDirectory);
//        managerDirectory.showEmployeeDetails(0);

        Directory companyDirectory = new Directory("Google Directory");

        Directory executivesDirectory = new Directory("Executives Directory");
        executivesDirectory.addEmployee(new Manager("Jeff", "L11", "002", 1000));
        executivesDirectory.addEmployee(new Manager("Sanjay", "L11", "003", 1000));

        Employee ceo = new Manager("Sundar", "CEO", "001", 1000);

        companyDirectory.addEmployee(ceo);
        companyDirectory.addEmployee(managerDirectory);
        companyDirectory.addEmployee(executivesDirectory);
        companyDirectory.showEmployeeDetails(0);
    }
}
