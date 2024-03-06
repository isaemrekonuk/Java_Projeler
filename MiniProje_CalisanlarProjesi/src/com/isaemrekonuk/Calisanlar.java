
package com.isaemrekonuk;


public class Calisanlar  //super class (ana class)
{
    //Değişkenlerimizi tanımlıyoruz.
    private String ad;
    private String soyad;
    private int id;

    
    //Yapıcı metodumuzu yazıyoruz.
    public Calisanlar(String ad, String soyad, int id) 
    {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }
    
    //Parametresiz bir metod yazıyoruz.
    public void bilgileriGoster()
    {
        //Ekrana yazdırma işlemi yapıyoruz.
        System.out.println("Çalışan Bilgileri...");
        System.out.println("Ad..: " + ad);
        System.out.println("Soyad..: " + soyad);
        System.out.println("Id..: " + id);
    }
            
            
    //Getter ve setter metodlarımızı yazıyoruz.

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
