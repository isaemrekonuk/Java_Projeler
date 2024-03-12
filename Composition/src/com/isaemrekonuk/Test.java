
package com.isaemrekonuk;

public class Test {

    public static void main(String[] args) 
    {
        Resolution resolution = new Resolution(1920, 1080); //Resolution sınıfından bir nesne oluşturup parametrelerini gönderiyoruz.
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution); //Monitor sınıfından bir nesne oluşturup parametrelerini gönderiyoruz.
        
        Kasa kasa = new Kasa("Shadow Black", "Shadow", "Temperli Cam"); //Kasa sınıfından bir nesne oluşturup parametrelerini gönderiyoruz.
        
        Anakart anakart = new Anakart("B250-PRO", "ASUS", 10, "Windows 11"); //Anakart sınıfından bir nesne oluşturup parametrelerini gönderiyoruz.
        
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart); //Bilgisayar sınıfından bir nesne oluşturup parametrelerini gönderiyoruz.
    
        //pc nesnesi üzerinden ilgili classlar içerisindeki metodları çağırıyoruz.
        pc.getKasa().bilgisayariAc();
        pc.getMonitor().monitoruKapat();
        pc.getAnakart().isletimSistemiYukle("Ubuntu");
    }
    
}
