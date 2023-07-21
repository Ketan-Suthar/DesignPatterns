
public abstract class DataSourceDecorator implements IDataSource {
    protected IDataSource dataSource;

    protected DataSourceDecorator(final IDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
