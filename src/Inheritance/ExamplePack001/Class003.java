package Inheritance.ExamplePack001;

public class Class003 extends Class002 {
    String addres;

    public Class003(String name, String lastName, double salary, String job, int experience, String addres) {
        super(name, lastName, salary, job, experience);
        this.addres = addres;
    }

    public Class003(String teddy, String bear, int salary) {
        super();
    }
}
