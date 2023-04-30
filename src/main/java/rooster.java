public class rooster extends Animal{
    public rooster() {
    }

    public rooster(String name, String color, int age, String type) {
        super(name, color, age, type);
    }
    @Override
    public String talk(){
        String s = "El animal " + this.getName()+ " dice " + "kirikiriki";
        return s;    }
}
