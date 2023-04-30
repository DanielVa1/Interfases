
public class PetStore {
    public static void main(String[] args) {
        cat garfiel=new cat("Garfiel", "Naranja", 5,"gato");
        dog firulais= new dog("firulais", "manchado", 3, "perro" );
        rooster claudio= new rooster("claudio", "blanco con rojo", 1, "gallo");

        System.out.println("Ejemplo de polimorfismo");
        System.out.println(garfiel.talk());
        System.out.println(firulais.talk());
        System.out.println(claudio.talk());
    }
}
