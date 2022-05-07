package calculator_example;

public class Client
{
    public static void main(String[] args) {
        Triangle t = new Triangle(20, 10);
        ICalculator adaptor = new CalculatorAdaptor(t);

        System.out.println("Area of Triangle: " + adaptor.getArea(null));
    }
}
