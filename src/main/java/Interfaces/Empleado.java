package Interfaces;

public class Empleado extends Persona implements Contratable {

    private String company;
    private String position;
    private String salary;

    public Empleado() {
    }

    public Empleado(String name, String lastName, int age, String company, String position, String salary) {
        super(name, lastName, age);
        this.company = company;
        this.position = position;
        this.salary = salary;
    }
    public Boolean contratable(){
        return true;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company) {this.company = company;}

    public String getPosition() {return position;}

    public void setPosition(String position) {this.position = position;}

    public String getSalary() {return salary;}

    public void setSalary(String salary) {this.salary = salary;}

    public String toString(){
        return "Nombre: " + getName() +
                "\nApellido: " + getLastName() +
                "\nEdad: " + getAge() +
                "\nEmpresa: " + getCompany() +
                "\nPosición: " + getPosition() +
                "\nSalario: " + getSalary() +
                "\nContratable: " + (contratable() ? "Si" : "No");
    }

    @Override
    public Boolean Contratable() {
        return null;
    }
}
