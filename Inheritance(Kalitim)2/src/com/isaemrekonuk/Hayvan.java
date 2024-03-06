
package com.isaemrekonuk;

public class Hayvan  //super class (ana class)
{
    //Değişkenlerimizi tanımlıyoruz.
    private String isim;
    private int kilo;
    private int boy;
    private int bacakSayisi;

    //Constructor (yapıcı) metodumuzu yazıyoruz.
    public Hayvan(String isim, int kilo, int boy, int bacakSayisi) 
    {
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacakSayisi = bacakSayisi;
    }
    
    //Parametresiz bir metod yazıyoruz.
    public void yemekYe()
    {
        System.out.println("Hayvan Şu anda Yemek Yiyor."); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
    //Parametreli bir metod yazıyoruz.
    public void hareketeGec(int hiz)
    {
        System.out.println("Hayvan " + hiz + " Hızında Harekete Geçiyor."); //Ekrana yazdırma işlemi yapıyoruz.
    }

    //Getter ve setter metodlarını yazıyoruz.
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getBacakSayisi() {
        return bacakSayisi;
    }

    public void setBacakSayisi(int bacakSayisi) {
        this.bacakSayisi = bacakSayisi;
    }
    
    
    
}
