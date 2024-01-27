package C001_Constructors;

public class C02_Constructor {
    String str;
    String hello = "Hello World";

    public static void main(String[] args) {
        C02_Constructor obj1 = new C02_Constructor();
        C02_Constructor obj2 = new C02_Constructor();
        C02_Constructor obj3 = new C02_Constructor();

        System.out.println(obj1.str);
        obj1.str = "Hello, Mr.Aytekin";
        System.out.println(obj1.str);

        System.out.println(obj2.hello);
        obj2.hello = "Hello, Ahmed Yusuf";
        System.out.println(obj2.hello);

        obj3.hello = "Özlem Kaplan";
        System.out.println(obj3.hello);
        System.out.println(obj2.hello);


    }
}
