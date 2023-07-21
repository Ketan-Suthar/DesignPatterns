public class DataSourceEncryptionDecorator extends DataSourceDecorator {

    public DataSourceEncryptionDecorator(IDataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        System.out.println("encrypting data: " + data);
        super.writeData("Encrypted(" + data + ")");
    }

    @Override
    public String readData() {
        String encryptedData = super.readData();
        System.out.println("Decrypting data: "+ encryptedData);

        return "Decrypted(" + encryptedData + ")";
    }
}
