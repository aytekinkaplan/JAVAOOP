package Inheritance.ExamplePack001;

public class Class004 {
    public static void main(String[] args) {
        Class003 aPerson = new Class003("Teddy","Bear",4000);
        aPerson.job ="Teacher";
        aPerson.experience = 15;
        aPerson.addres ="ANGARA";
        System.out.println(aPerson.name);
        System.out.println(aPerson.lastName);
        System.out.println(aPerson.salary);
        System.out.println(aPerson);
    }
}
