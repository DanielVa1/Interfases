package AbstracAnimal;

public class PetStore {
    public static void main(String[] args) {
        Cat garfiel = new Cat("Garfiel", "naranja", 5);
        Cat Felix = new Cat("Felix", "Gris", 3);
        Dog Firulais = new Dog("Firulais", "cafe",2 );
        Rooster Claudio = new Rooster("Claudio", "rojo", 2);



        System.out.println("< ejemplo de polimorfismo usando clase abstracta>");
        System.out.println("Invocando al metodo toString");
        System.out.println(garfiel.toString());
        System.out.println(Felix.toString());
        System.out.println(Firulais.toString());
        System.out.println(Claudio.toString());

    }
}
