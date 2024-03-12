
package com.isaemrekonuk;

public class Anakart 
{
    //Değişkenlerimizi tanımlıyoruz.
    private String model;
    private String uretici;
    private int yuvaSayisi;
    private String isletimSistemi;

    //Yapıcı metodumuzu yazıyoruz.
    public Anakart(String model, String uretici, int yuvaSayisi, String isletimSistemi) {
        this.model = model;
        this.uretici = uretici;
        this.yuvaSayisi = yuvaSayisi;
        this.isletimSistemi = isletimSistemi;
    }

    //Parametreli bir metod yazıyoruz.
    public void isletimSistemiYukle(String isletimSistemi)
    {
        this.isletimSistemi = isletimSistemi; //Parametre olarak gelen değeri bu class içerisinde tanımlı değişkene atıyoruz.
        
        System.out.println("İşletim Sistemi Yüklendi..: " + isletimSistemi); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
    //Getter ve setter metodlarımızı yazıyoruz.
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuvaSayisi() {
        return yuvaSayisi;
    }

    public void setYuvaSayisi(int yuvaSayisi) {
        this.yuvaSayisi = yuvaSayisi;
    }

    public String getIsletimSistemi() {
        return isletimSistemi;
    }

    public void setIsletimSistemi(String isletimSistemi) {
        this.isletimSistemi = isletimSistemi;
    }
    
    
}
