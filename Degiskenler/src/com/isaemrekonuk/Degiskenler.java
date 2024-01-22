
package com.isaemrekonuk;

/**
 *
 * @author Emre
 */
public class Degiskenler {

    public static void main(String[] args)
    {
        /*
            Değişkenler (Variable)
        
            * Değişkenler bilgisayar programlama da geçici bilgilerin tutulduğu ve içeriğinin yazılımcı tarafından atandığı bilgilerdir.
            * veriTipi degiskenIsmi = degiskenDegeri; olarak değişkenlerimizi tanımlıyoruz.
            * Bir değişken, değeri atanmadan ekrana yazdırılamaz. Bunu yaptığımızda hata alırız.
            * Sabitler, değeri değiştirilemeyen değişkenler için kullanılır. final anahtar kelimesi ile tanımlanmaktadır.
            * Sabit olarak tanımlanacak değişkenlerin ilk değer ataması zorunluluğu vardır. İlk değerleri atanmadan kullanılamazlar.
        */
        
        /*
            * byte --> tam sayı, 1 byte
            * short --> tam sayı, 2 byte
            * int --> tam sayı, 4 byte
            * long --> tam sayı, 8 byte
            * float --> ondalıklı sayı, 4 byte
            * double --> ondalıklı sayı, 8 byte
            * char --> karakter, 2 byte
            * boolean --> true ya da false, 1 byte
        */
        
        int a; //İnt veri türünde a isimli bir değişken tanımladık.
        int b = 10;  //İnt veri türünde b isimli bir değişken tanımladık ve değer ataması yaptık.
        
        a = 5; //Daha önce tanımlamış olduğumuz değişkene değer ataması yaptık.
        
        //Tanımladığımız değişkenleri ekrana yazdırıyoruz.
        System.out.println("a değeri..: " + a);
        System.out.println("b değeri..: " + b);
        
        b += 2; //b değişkenine 2 değerini ekledik. Yeni değeri 12 oldu. b = b + 2 işlemi ile aynıdır.
        
        int c = a + b; //c değişkeni tanımladık ve a ve b değişkenlerini toplayıp c değişkenine atadık.
        
        //Ekrana yazdırma işlemlerini yapıyoruz.
        System.out.println("********************");
        System.out.println("a değeri..: " + a);
        System.out.println("b değeri..: " + b);
        System.out.println("c değeri..: " + c);
        System.out.println("********************");
        
        float  d, e, f, k; //float türünde bir değişken tanımladık.
        
        d = b / a; //değişkene atama işlemini yaptık.
        
        //Değişkenlerimize değer atamlarını yapıyoruz.
        e = 17;
        f = 6;
        
        k = e / f;
        
        //Ekrana yazdırma işlemlerini yapıyoruz.
        System.out.println("d değeri..: " + d); 
        System.out.println("e değeri..: " + e);
        System.out.println("f değeri..: " + f);
        System.out.println("k değeri..: " + k);
        System.out.println("********************");
        
        final double m = 3.14; //sabit bir değişken tanımladık. Artık bu değişkenin değeri hiçbir şekilde değiştirilemez.
        
        System.out.println("Sabit değişken değeri..: " + m);
    }
    
}
