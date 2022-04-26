package example;

public class Singleton
{
    private int data = 0;
    private static class SingletonHolder
    {
        private static final Singleton uniqueInstance = new Singleton();
    }

    private Singleton() {}

    public static Singleton getInstance()
    {
        // since instance is already initialize we can return without null checking
        return  SingletonHolder.uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
