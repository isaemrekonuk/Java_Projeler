
package com.isaemrekonuk;

//Extends anahtar kelimesi ile Yonetici classımızı Calisan classından miras almasını sağlıyoruz.
public class Yonetici extends Calisan //Subclass yani alt class
{
    //Yonetici classımız Calisan classından miras aldığı için Calisan classı içerisindeki tüm değişkenleri ve metodları kullanabilir.
    
    //Değişkenimizi tanımlıyoruz.
    private int sorumluKisi; //Bu değişken sadece bu class'a aittir. Yonetici classı Calisan classından miras almış olsada Yonetici classındaki veriler doğrudan Calisan classında kullanılamaz.
    
    //Yapıcı metodumuzu yazıyoruz.
    public Yonetici(String isim, int maas, String departman, int sorumluKisi)
    {
        //super anahtar kelimesi ile miras alınan classın constructırını parametreleri göndererek çağırıyoruz.
        super(isim, maas, departman);
        
        this.sorumluKisi = sorumluKisi; //Parametre olarak alınan değeri bu class içerisinde tanımlı değişkene atıyoruz. 
    }
    
    public void zamYap(int zamMiktari)
    {
        System.out.println("Çalışanlara " + zamMiktari + " TL Zam Yapıldı.");
    }
    
    //Parametresiz bir metod yazıyoruz. 
    public void bilgileriGoster()
    {
        //Ekrana yazdırma işlemi yapıyoruz.
        /*
        System.out.println("İsim..: " + getIsim());
        System.out.println("Maaş..: " + getMaas());
        System.out.println("Departman..: " + getDepartman());
        */
        
        //veya 
        
        super.bilgileriGoster(); //super anahtar kelimesi ile ilgili metodu çağırabiliriz.
        
        System.out.println("Sorumlu Kişi Sayısı..: " + this.sorumluKisi);
    
        
    }
}
