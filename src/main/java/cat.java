public class cat extends Animal{
    public cat() {
    }

    public cat(String name, String color, int age, String type) {
        super(name, color, age, type);
    }

    @Override
    public String talk(){
        String s = "El animal " + this.getName()+ " dice " + "miauuuuu";
        return s;    }


}
