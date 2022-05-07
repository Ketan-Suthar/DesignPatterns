package calculator_example;

public class CalculatorAdaptor implements ICalculator
{
    Calculator calculator;
    Triangle triangle;

    public CalculatorAdaptor(final Triangle t){
        this.triangle = t;
    }

    @Override
    public double getArea(Rectangle rectangle){
        calculator = new Calculator();

        final var r = new Rectangle();
        r.l = triangle.base;
        r.w = triangle.height * 0.5;

        return calculator.getArea(r);
    }
}
