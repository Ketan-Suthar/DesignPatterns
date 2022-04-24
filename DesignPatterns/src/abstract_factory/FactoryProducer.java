package abstract_factory;

public class FactoryProducer
{
    public static AbstractFactory getFactory(final String choice)
    {
        if(choice == null)
            return null;
        if(choice.equalsIgnoreCase("color"))
            return new ColorFactory();
        if(choice.equalsIgnoreCase("shape"))
            return new ShapeFactory();
        return null;
    }
}
