package sohu.auto.yifanshi.Decorator;

import sohu.auto.yifanshi.component.Drinks;

public class Milk extends Drinks {
    private Drinks drinks;
    public Milk(Drinks drinks)
    {
        super("╪сдл╣д"+drinks.getName());
        this.drinks = drinks;
    }

    @Override
    public int cost() {
        return 5+drinks.cost();
    }
}
