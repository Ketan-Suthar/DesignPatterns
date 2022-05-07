package example;

interface Duck
{
    void quack();
    void fly();
}

class MallardDuck implements Duck
{
    @Override
    public void quack() {
        System.out.println("Quacking");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
