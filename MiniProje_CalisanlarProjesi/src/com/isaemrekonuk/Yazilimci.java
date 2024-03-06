
package com.isaemrekonuk;

public class Yazilimci extends Calisanlar //Yazilimci classımız Calisanlar classından miras alıyor.
{
    private String diller; //Değişkenimizi tanımlıyoruz.
    
    //Yapıcı metodumuzu yazıyoruz.
    public Yazilimci(String ad, String soyad, int id, String diller) 
    {
        super(ad, soyad, id);
        
        this.diller = diller;
    }
    
    //Parametreli bir metod yazıyoruz.
    public void formatAt(String isletimSistemi)
    {
        //Ekrana yazdırma işlemi yapıyoruz.
        System.out.println(getAd() + " " + isletimSistemi + "'ni yüklüyor.");
    }

    @Override //Metodu override yapıyoruz.
    public void bilgileriGoster() 
    {
        super.bilgileriGoster(); 
        System.out.println("Yazılımcının Bildiği Diller..: " + diller); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
    
    
}
