package beverages;

public class HouseBlend extends IBeverage {
    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.9;
    }

    public void setDescription(final String description) {
        this.description = description;
    }
}
