package duck_example;

interface Turkey
{
    void gobble();
    void fly();
}

class WildTurkey implements Turkey
{

    @Override
    public void gobble() {
        System.out.println("Gobbling");
    }

    @Override
    public void fly() {
        System.out.println("Short distance flying");
    }
}
