public class dog extends Animal{
    public dog() {
    }

    public dog(String name, String color, int age, String type) {
        super(name, color, age, type);
    }
    @Override
    public String talk(){
        String s = "El animal " + this.getName()+ " dice " + "Guaau";
        return s;    }
}
