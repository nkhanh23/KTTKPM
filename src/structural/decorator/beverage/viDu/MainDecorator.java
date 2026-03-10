package structural.decorator.beverage.viDu;

public class MainDecorator
{
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast("cafe");
        beverage =new Milk("Sua",beverage);
        beverage = new CaoCaoPowder("bot cao cao", beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        beverage = new Milk("Sua ong tho",beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
