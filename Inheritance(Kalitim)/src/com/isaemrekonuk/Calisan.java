
package com.isaemrekonuk;

public class Calisan  //Superclass veya Baseclass yani ana class 
{
    //Değişkenlerimizi tanımlıyoruz.
    private String isim;
    private int maas;
    private String departman;

    //Yapıcı metodumuzu tanımlıyoruz.
    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }
    
    //Parametresiz bir metod yazıyoruz.
    public void calis()
    {
        System.out.println("Çalışan Çalışıyor."); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
    //Parametresiz bir metod yazıyoruz.
    public void bilgileriGoster()
    {
        //Ekrana yazdırma işlemi yapıyoruz.
        System.out.println("İsim..: " + isim);
        System.out.println("Maaş..: " + maas);
        System.out.println("Departman..: " + departman);
    }
    
    //Bir parametreli bir metod yazıyoruz.
    public void departmanDegistir(String yeniDepartman)
    {
        System.out.println("Departman Değiştiriliyor..."); //Ekrana yazdırma işlemi yapıyoruz.
        this.departman = yeniDepartman; //Parametre olarak gelen değeri bu classta tanımlı değişkenimize atıyoruz.
        System.out.println("Yeni Departman..: " + departman); //Ekrana yazdırma işlemi yapıyoruz.
    }

    //Getter ve setter metodlarımızı yazıyoruz.
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
    
}
