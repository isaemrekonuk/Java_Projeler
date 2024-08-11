
package com.isaemrekonuk;

public class Draciel extends Beyblade //Draciel sınıfımız Beyblade sınıfından miras alıyor.
{
    private String kutsalCanavar; //Draciel sınıfımızın ortak olmayan özelliğini tanımlıyoruz.
    
    public Draciel(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) //Yapıcı metodumuzu yazıyoruz.
    {
        super(beybladeci, donusHizi, saldiriGucu); //Miras aldığımız sınıfın yapıcı metodunu çağırıyoruz.
        this.kutsalCanavar = kutsalCanavar; //Ortak olmayan özelliğimizide ekliyoruz.
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
        System.out.println(getBeybladeci() + " ın Savunması  : Kale Savunması");
    }   
}

