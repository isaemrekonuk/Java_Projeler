
package com.isaemrekonuk;

public class Main {

    public static void main(String[] args) 
    {
        ATM atm = new ATM(); //ATM sınıfından bir nesne oluşturuyoruz.
        
        Hesap hesap = new Hesap("Isa Emre Konuk", "12345", 2000); //Hesap sınıfından bir nesne oluşturduk.
        
        atm.calistir(hesap); //Nesnemiz üzerinden ilgili metodu çağırıyoruz.
        
        System.out.println("Programdan Çıkılıyor..!"); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
}
