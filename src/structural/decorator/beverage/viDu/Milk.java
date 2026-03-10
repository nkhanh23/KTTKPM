package structural.decorator.beverage.viDu;

public class Milk extends CondimentDecorator
{
    public Milk(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "," + this.description;
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
