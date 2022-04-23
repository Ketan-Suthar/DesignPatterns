package factory_method.shape_example;

class ShapeFactory
{
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
}

public class ConcreteCreatorExample
{
    public static void main(String[] args)
    {
        var shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.draw();
    }
}

