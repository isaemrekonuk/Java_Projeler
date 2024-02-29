
package com.isaemrekonuk;

public class Hesap 
{
    //İlgili değişkenlerimizi tanımlıyoruz.
    private String kullanici_Adi;
    private String parola;
    private int bakiye;

    //Parametreli constructor'ımızı tanımlıyoruz.
    public Hesap(String kullanici_Adi, String parola, int bakiye) 
    {
        //Parametre olarak gelen değerleri ilgili değişkenlerimize atıyoruz.
        this.kullanici_Adi = kullanici_Adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    //Getter ve setter metodlarımızı yazıyoruz.
    public String getKullanici_Adi() {
        return kullanici_Adi;
    }

    public void setKullanici_Adi(String kullanici_Adi) {
        this.kullanici_Adi = kullanici_Adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    //Ekstra olarak paraYatir ve paraCek adında metodlarımızı yazıyoruz.
    public void  paraYatir(int tutar)
    {
        this.bakiye += tutar; //Parametre olarak gelen tutarı bakiyemize ekliyoruz.
        System.out.println("Yeni Bakiyeniz..: " + bakiye); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
    public void paraCek(int tutar)
    {
        if (bakiye - tutar < 0) //Eğer parametre olarak gelen tutar değeri bakiye değerinden büyük ise yani çekilmek istenen tutar bakiyeden fazla ise bu kod bloğu çalışacak.
        {
            System.out.println("Yeterli Bakiyeniz Yok..!"); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else //Koşul sağlanmıyorsa bu kod bloğu çalışacak.
        {
            this.bakiye -= tutar; //Tutar değerini bakiyeden çıkarıyoruz.
            System.out.println("Yeni Bakiyeniz..: " + bakiye); //Ekrana yazdırma işlemi yapıyoruz.
        }
    }
    
}
