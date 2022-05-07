package example;

public class Client
{
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck says ...");
        duck.quack();
        duck.fly();

        System.out.println("\nTurkeyAdapter says ...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
