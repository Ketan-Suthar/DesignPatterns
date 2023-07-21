
public class FileDataSource implements IDataSource {

    @Override
    public void writeData(String data) {
        System.out.println("Writing data to file");
        System.out.println("data: " + data);
    }

    @Override
    public String readData() {
        System.out.println("Reading data from file");
        String DATA = "dummy data";
        System.out.println("data: " + DATA);
        return DATA;
    }
}
