public class Driver {
    public static void main(String[] args) {
        var data = "Secret Data";
        var source = new FileDataSource();
        source.writeData(data);

        var encryptDatasource = new DataSourceEncryptionDecorator(source);
        encryptDatasource.writeData(data);

        var compressedDatasource = new DataSourceCompressionDecorator(encryptDatasource);
        compressedDatasource.writeData(data);
    }
}
