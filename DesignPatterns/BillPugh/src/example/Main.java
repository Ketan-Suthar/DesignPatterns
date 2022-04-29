package example;

public class Main
{
    public static void main(String[] args) {
        var s1 = Singleton.getInstance();
        s1.setData(123);
        var s2 = Singleton.getInstance();

        System.out.println("s1: " + s1 + " s1.data: " + s1.getData());
        System.out.println("s2: " + s2 + " s2.data: " + s2.getData());
    }
}
