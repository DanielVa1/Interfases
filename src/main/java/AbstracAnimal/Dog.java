package AbstracAnimal;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public String talk(){
        return "Guauu";
    }
    public String toString(){
        return super.Name + " es un perro"+
                " de color " + super.Color +
                " tiene " + super.age + " años" +
                " y dice " + this.talk();}

}
