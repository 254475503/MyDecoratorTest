package sohu.auto.yifanshi.Decorator;

import sohu.auto.yifanshi.component.Drinks;

public class Sugar extends Drinks {
    private Drinks drinks;

    public Sugar(Drinks drinks) {
        super("╪слг╣д"+drinks.getName());
        this.drinks = drinks;
    }

    @Override
    public int cost() {
        return 2+drinks.cost();
    }
}
