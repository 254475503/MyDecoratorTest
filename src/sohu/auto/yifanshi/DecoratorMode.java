package sohu.auto.yifanshi;

import sohu.auto.yifanshi.Decorator.Singer;
import sohu.auto.yifanshi.component.Person;

public class DecoratorMode {
    public static void main(String[] args) {
        Person person = new Person();
        Singer singer = new Singer(person);
        singer.Sing();
        singer.Run();
    }
}
