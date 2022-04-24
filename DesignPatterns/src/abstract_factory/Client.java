package abstract_factory;

public class Client
{
    public static void main(String[] args)
    {
        final var shapeFactory = FactoryProducer.getFactory("shape");
        final var circle = shapeFactory.getShape("circle");
        circle.draw();

        final var square = shapeFactory.getShape("square");
        square.draw();

        final var rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        final var colorFactory = FactoryProducer.getFactory("color");
        final var red = colorFactory.getColor("red");
        red.fill();

        final var green = colorFactory.getColor("green");
        green.fill();

        final var blue = colorFactory.getColor("blue");
        blue.fill();
    }
}
