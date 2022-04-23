package factory_method.shape_example;

public class Client {
    public static void main(String[] args)
    {
        var shape1 = new CircleFactory().getShape();
        shape1.draw();

        var shape2 = new SquareFactory().getShape();
        shape2.draw();

        var shape3 = new RectangleFactory().getShape();
        shape3.draw();
    }
}
