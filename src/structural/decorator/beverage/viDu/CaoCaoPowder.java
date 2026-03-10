package structural.decorator.beverage.viDu;

public class CaoCaoPowder extends CondimentDecorator{
    public CaoCaoPowder(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "," + this.description;
    }

    @Override
    public int cost() {
        return super.cost() + 5;
    }
}
