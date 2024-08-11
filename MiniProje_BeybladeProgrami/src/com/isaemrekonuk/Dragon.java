
package com.isaemrekonuk;

public class Dragon extends  Beyblade //Dragon sınıfı Beyblade sınıfından miras alıyor.
{
    //Ortak olmayan özelliklerimizi tanımlıyoruz.
    private String kutsalCanavar;
    private String gizliYetenek;

    //Yapıcı metodumuzu yazıyoruz.
    public Dragon(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar,String gizliYetenek) 
    {
        super(beybladeci, donusHizi, saldiriGucu); //Miras alınan sınıfın yapıcı metodunu çağırıyoruz.
        //Ortak olmayan özelliklerimizi ekliyoruz.
        this.kutsalCanavar = kutsalCanavar; 
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() //Metodumuzu override ediyoruz.
    {
        super.bilgileriGoster(); //Miras alınan sınıfın metodunu çağırıyoruz.
        //Ekstra ekrana yazdırma işlemi yapıyoruz
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);
        System.out.println("Gizli Yetenek : " + gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar()  //Metodumuzu override ediyoruz. 
    {
        //Ekrana yazdırma işlemi yapıyoruz.
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + " ın Saldırısı  : Hayalet Kasırgası");
    }    
}

