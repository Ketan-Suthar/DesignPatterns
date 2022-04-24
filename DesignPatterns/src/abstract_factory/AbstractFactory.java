package abstract_factory;

public abstract class AbstractFactory
{
    // here we're not following integration segregation principle
    // because all class must implement both of these methods
    abstract Color getColor(final String color);
    abstract Shape getShape(final String shape);
}

class ShapeFactory extends AbstractFactory
{
    @Override
    public Shape getShape(final String shapeType)
    {
        if(shapeType == null)
            return null;
        else if (shapeType.equalsIgnoreCase("circle"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("square"))
            return new Square();
        else if (shapeType.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}


class ColorFactory extends AbstractFactory
{
    @Override
    public Color getColor(final String colorType)
    {
        if(colorType == null)
            return null;
        else if (colorType.equalsIgnoreCase("red"))
            return new Red();
        else if (colorType.equalsIgnoreCase("green"))
            return new Green();
        else if (colorType.equalsIgnoreCase("blue"))
            return new Blue();
        return null;
    }

    @Override
    Shape getShape(String color) {
        return null;
    }
}
