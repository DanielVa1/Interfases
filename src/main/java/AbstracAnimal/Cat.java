package AbstracAnimal;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public String talk(){
        return "miau";
    }
    public String toString(){
        return super.Name + " es un gato"+
                " de color " + super.Color +
                " tiene " + super.age + " años" +
                " y dice " + this.talk();

    }

}
