public class Driver2 {
    private static final boolean enabledEncryption = true;

    private static final boolean enabledCompression = true;

    public static void main(String[] args) {

        IDataSource source = new FileDataSource();

        if (enabledEncryption)
            source = new DataSourceEncryptionDecorator(source);
        if (enabledCompression)
            source = new DataSourceCompressionDecorator(source);

        var logger = new SalaryManager(source);
        logger.writeData("SalaryData");
    }
}
