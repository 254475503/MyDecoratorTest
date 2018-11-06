package sohu.auto.yifanshi.component;

import sohu.auto.yifanshi.Interfaces.Run;
import sohu.auto.yifanshi.Interfaces.Sing;

public class Person implements Sing, Run {
    @Override
    public void Run() {
        System.out.print("Run");
    }

    @Override
    public void Sing() {
        System.out.print("Sing");
    }
}
