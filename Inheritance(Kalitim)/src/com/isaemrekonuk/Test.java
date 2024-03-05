
package com.isaemrekonuk;

public class Test {

    public static void main(String[] args) 
    {
        //Inheritance (Kalıtım)
        //Nesneye yönelik programlamanın temel taşlarından biri olan kalıtım, sınıflardan yeni sınıflar türetmeyi sağlar.
        //Türetilen bu yeni sınıflar, türetildiği sınıfların özelliklerine sahip olur.
        //Java'da kalıtım yapmak için kullanacağımız kelime "extends" dır.
        
        //Nesnemizi oluşturuyoruz ve parametrelerini gönderiyoruz.
        Yonetici yonetici = new Yonetici("İsa Emre Konuk", 2500, "IT", 10);
        yonetici.bilgileriGoster(); //Nesnemiz üzerinden ilgili metodumuzu çağırıyoruz.
        yonetici.zamYap(200); //Nesnemiz üzerinden ilgili metodumuza parametre girerek çağırıyoruz.
    }
    
}
