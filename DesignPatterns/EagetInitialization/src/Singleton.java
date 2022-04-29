public class Singleton
{
    private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance()
    {
        // since instance is already initialize we can return without null checking
        return  uniqueInstance;
    }
}
