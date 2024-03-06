
package com.isaemrekonuk;

public class Kopek extends Hayvan //sub class (alt class)
{
    private int disSayisi; //Değişkenimizi tanımlıyoruz.
    
    //Constructor (yapıcı) metodumuzu yazıyoruz.
    public Kopek(String isim, int kilo, int boy, int bacakSayisi, int disSayisi) 
    {
        super(isim, kilo, boy, bacakSayisi); //Super anahtar kelimesi ile miras alınan classın yapıcı metodunu çağırıyoruz.
        
        this.disSayisi = disSayisi; //Parametre olarak gelen değeri bu class içerisinde tanımlı değişkene atıyoruz.
        
    }  

    //Parametreli bir metod yazıyoruz.
    public void hareketeGec(int hiz)
    {
        System.out.println("Kopek " + hiz + " Hızında Harekete Geçiyor."); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
    //Parametreli bir metod yazıyoruz.
    public void kos(int hiz)
    {
        System.out.println("Köpek Koşuyor."); //Ekrana yazdırma işlemi yapıyoruz.
        
        hareketeGec(hiz); //Bu class içerisinde tanımlı metodumuzu çağırıyoruz.
        //super.hareketeGec(hiz); //super anahtar kelimesi ile miras alınan class içerisinde tanımlı metodu çağırıyoruz.
    }
    
    //getter ve setter metodlarını yazıyoruz.
    public int getDisSayisi() {
        return disSayisi;
    }

    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }
    
}
