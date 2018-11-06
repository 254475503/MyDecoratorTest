package sohu.auto.yifanshi.component;

public abstract class Drinks {
    private String name;

    public Drinks() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public Drinks(String name)
    {
        this.name = name;
    }
    public abstract int cost();
}
