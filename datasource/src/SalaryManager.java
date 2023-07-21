public class SalaryManager implements IDataSource {
    private final IDataSource dataSource;

    public SalaryManager(final IDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void writeData(String data) {
        dataSource.writeData(data);
    }

    public String readData() {
        return dataSource.readData();
    }
}
