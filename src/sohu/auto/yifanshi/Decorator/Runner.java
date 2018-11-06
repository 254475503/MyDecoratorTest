package sohu.auto.yifanshi.Decorator;

import javafx.util.converter.PercentageStringConverter;
import sohu.auto.yifanshi.Interfaces.Run;
import sohu.auto.yifanshi.Interfaces.Sing;
import sohu.auto.yifanshi.component.Person;

public class Runner implements Sing, Run {
    private Person person;

    Runner(Person person)
    {
        this.person = person;
    }

    @Override
    public void Run() {
        person.Run();
        System.out.print("quickly");
    }

    @Override
    public void Sing() {
        person.Sing();
        System.out.print("normally");
    }
}
