package AbstracAnimal;

public class Rooster extends Animal{
    public Rooster() {
    }

    public Rooster(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public String talk(){
        return "kikiriki";
    }
    public String toString(){
        return super.Name + " es un gallo"+
                " de color " + super.Color +
                " tiene " + super.age + " años" +
                " y dice " + this.talk();}
}
