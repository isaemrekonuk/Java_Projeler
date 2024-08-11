
package com.isaemrekonuk;

public class Drayga extends Beyblade //Drayga sınıfı Byeblade sınıfından miras alıyor.
{
    //Ortak olmayan özelliğimizi tanımlıyoruz.
    private String kutsalCanavar;
    
    //Yapıcı metodumuzu tanımlıyoruz.
    public Drayga(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) 
    {
        super(beybladeci, donusHizi, saldiriGucu); //Miras alınan sınıfın yapıcı metodunu çağırıyoruz.
        this.kutsalCanavar = kutsalCanavar; //Ekstra özelliğimizi ekliyoruz.
    }

    @Override
    public void bilgileriGoster() //Metodumuzu override ediyoruz.
    {
        super.bilgileriGoster(); //Miras alınan sınıfın metodunu çağırıyoruz.
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar); //Ekstra yazdırma işlemi yapıyoruz.
    }

    @Override
    public void kutsalCanavarOrtayaCikar() //Metodumuzu override ediyoruz.
    {
        //Ekrana yazdırma işlemi yapıyoruz.
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + " ın Saldırısı : Kaplan Pençesi");
    }
}

