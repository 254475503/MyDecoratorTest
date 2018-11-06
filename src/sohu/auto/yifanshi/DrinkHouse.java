package sohu.auto.yifanshi;

import sohu.auto.yifanshi.Decorator.Milk;
import sohu.auto.yifanshi.Decorator.Sugar;
import sohu.auto.yifanshi.component.Coffe;
import sohu.auto.yifanshi.component.Drinks;
import sohu.auto.yifanshi.component.Tea;

import java.util.Scanner;

public class DrinkHouse {
    public static void main(String[] args) {
        System.out.println("which drink do you want?1.coffe 2.tea");
        Scanner scanner = new Scanner(System.in);
        Integer drinkType = Integer.parseInt(scanner.nextLine());
        System.out.println("do you want extra?0.no 1.sugar 2.milk");
        Integer drinkExtra = Integer.parseInt(scanner.nextLine());
        Drinks drinks = drinkMaker(drinkType,drinkExtra);
        System.out.println("sir this is your "+drinks.getName()+" please pay:"+drinks.cost());

    }
    public static Drinks drinkMaker(Integer drinkType,Integer drinkExtra)
    {
        Drinks drinks = null;
        if(drinkType==1)
            drinks = new Coffe();
        else
            drinks = new Tea();


        if(drinkExtra==0)
            return drinks;
        else if(drinkExtra==1)
            return new Sugar(drinks);
        else
            return new Milk(drinks);
    }
}
