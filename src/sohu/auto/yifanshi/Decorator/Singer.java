package sohu.auto.yifanshi.Decorator;

import sohu.auto.yifanshi.Interfaces.Run;
import sohu.auto.yifanshi.Interfaces.Sing;
import sohu.auto.yifanshi.component.Person;
import sohu.auto.yifanshi.component.Tea;

import java.io.ObjectInputStream;
import java.time.Period;

public class Singer implements Sing, Run {
    private Person person;
    Class<?>[] interfaces ;
    public Singer(Person person)
    {
        this.person = person;
        interfaces = person.getClass().getInterfaces();
    }

    @Override
    public void Run() {
        person.Run();
        System.out.print("normally");
    }

    @Override
    public void Sing() {
        person.Sing();
        System.out.print("vividlly");
    }
}
