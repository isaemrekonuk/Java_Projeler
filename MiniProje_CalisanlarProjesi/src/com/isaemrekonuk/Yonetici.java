
package com.isaemrekonuk;

public class Yonetici extends Calisanlar //Yonetici classı Calisanlar classından miras alıyor.
{
    private int sorumluKisiSayisi; //Değişkenimizi tanımlıyoruz.

    //Yapıcı metodumuzu yazıyoruz.
    public Yonetici(String ad, String soyad, int id, int sorumluKisiSayisi) 
    {
        super(ad, soyad, id);
        
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    @Override //Metodumuzu override yapıyoruz.
    public void bilgileriGoster() 
    {
        super.bilgileriGoster(); 
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı..: " + sorumluKisiSayisi); //Ekrana yazdırma işlemi yapıyoruz.
    }
 
    //Parametreli bir metod yazıyoruz.
    public void zamYap(int zamMiktari)
    {
        //Ekrana yazdırma işlemi yapıyoruz.
        System.out.println(getAd() + " çalışanlara " + zamMiktari + " kadar zam yapıyor.");
    }
}
