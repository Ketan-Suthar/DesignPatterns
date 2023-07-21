public class DataSourceCompressionDecorator extends DataSourceDecorator {
    public DataSourceCompressionDecorator(IDataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        System.out.println("compressing data: " + data);
        super.writeData("Compressed(" + data + ")");
    }

    @Override
    public String readData() {
        String compressedData = super.readData();
        System.out.println("Decompressing data: "+ compressedData);

        return "Decompressed(" + compressedData + ")";
    }
}
