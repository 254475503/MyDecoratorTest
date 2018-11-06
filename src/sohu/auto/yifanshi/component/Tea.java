package sohu.auto.yifanshi.component;

public class Tea extends Drinks {
    public  Tea(){
        super("Tea");
    }
    @Override
    public int cost() {
        return 15;
    }
}
