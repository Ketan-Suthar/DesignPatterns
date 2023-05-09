package calculator_example;

interface ICalculator
{
    double getArea(Rectangle r);
}

class Calculator implements ICalculator
{
    Rectangle rectangle;

    @Override
    public double getArea(final Rectangle r)
    {
        rectangle = r;
        return r.l * r.w;
    }
}
