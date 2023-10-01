package Inheritance.ExamplePack001;

public class Class002 extends Class001{
    String job;
    int experience;


    public Class002(String name, String lastName, double salary, String job, int experience) {
        super(name, lastName, salary);
        this.job = job;
        this.experience = experience;
    }

    public Class002() {
        super();
    }
}
