package C001_Constructors;

public class C01_Constructor {
    String str; // Bu, class seviyesinde tanımlanmış, ancak henüz değeri atanmamış bir değişkendir.
    String selam = "selam javaCAN"; // Bu ise başlangıç değeri "selam javaCAN" olan bir değişkendir.

    public static void main(String[] args) {
        String maindekiVariable = "java"; // main metodu içinde tanımlanmış bir değişkendir.

        C01_Constructor obj1 = new C01_Constructor(); // obj1 adında bir C01_Constructor sınıfı oluşturuldu.
        C01_Constructor obj2 = new C01_Constructor(); // obj2 adında bir C01_Constructor sınıfı oluşturuldu.
        C01_Constructor obj3 = new C01_Constructor(); // obj3 adında bir C01_Constructor sınıfı oluşturuldu.

        obj1.selam = "selam JavaTAR :)"; // obj1'in 'selam' değişkenine "selam JavaTAR :)" değeri atandı.
        obj2.selam = "sefil HalUk'a bol samırsaklı atom kelle-paça çeeekkk"; // obj2'nin 'selam' değişkenine uzun bir değer atandı.

        System.out.println("maindekiVariable = " + maindekiVariable); // maindekiVariable değeri ekrana yazdırıldı.

        System.out.println("obj1.selam = " + obj1.selam); // obj1'in 'selam' değişkeni ekrana yazdırıldı.
        System.out.println("obj2.selam = " + obj2.selam); // obj2'nin 'selam' değişkeni ekrana yazdırıldı.
        System.out.println("obj1.str = " + obj1.str); // obj1'in 'str' değişkeni henüz değeri atanmamış olduğu için ekrana yazdırıldığında "null" çıktısı alınır.
        System.out.println("obj2.str = " + obj2.str); // obj2'nin 'str' değişkeni henüz değeri atanmamış olduğu için ekrana yazdırıldığında "null" çıktısı alınır.
        System.out.println("obj3.selam = " + obj3.selam); // obj3'ün 'selam' değişkeni ekrana yazdırıldı.
        obj3.selam = "ceren hanım"; // obj3'ün 'selam' değişkenine "ceren hanım" değeri atanmış oldu.
        System.out.println("obj3.selam = " + obj3.selam); // obj3'ün 'selam' değişkeni ekrana yazdırıldı.

        obj2.str = "taha beyyyy"; // obj2'nin 'str' değişkenine "taha beyyyy" değeri atanmış oldu.
        System.out.println("obj2.str = " + obj2.str); // obj2'nin 'str' değişkeni ekrana yazdırıldı.

        obj1.agamaSelam(); // obj1 üzerinden non-static bir metod çağrıldı ve ekrana "agama bolcana selamkeee :)" çıktısı alındı.
        obj2.agamaSelam(); // obj2 üzerinden non-static bir metod çağrıldı ve ekrana "agama bolcana selamkeee :)" çıktısı alındı.
        obj3.agamaSelam(); // obj3 üzerinden non-static bir metod çağrıldı ve ekrana "agama bolcana selamkeee :)" çıktısı alındı.
    }

    private void agamaSelam() { // non-static, void (geri dönüş değeri olmayan) bir metodun tanımı.
        System.out.println("agama bolcana selamkeee :)"); // Metodun içeriği, ekrana "agama bolcana selamkeee :)" çıktısını yazdırmaktadır.
    }
}
