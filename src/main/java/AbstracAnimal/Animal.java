package AbstracAnimal;

public abstract class Animal {
    protected String Name;
    protected String Color;
    protected int age;

    protected Animal() {
    }

    protected Animal(String name, String color, int age) {
        Name = name;
        Color = color;
        this.age = age;
    }
    public abstract String talk();
}
