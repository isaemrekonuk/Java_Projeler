
package com.isaemrekonuk;


public class Test {

    public static void main(String[] args) 
    {
        //Constructor Metodlar (Yapıcı Metodlar)
        //Sınıftan bir nesne oluşturulduğunda, derleyici otomatik olarak bir constructor(yapıcı) metod çağırır.
        //Bu metod, oluşturulan her nesne için çağrılır.
        //Yapıcılar, nesnenin ilk oluşturulduğunda alması gereken değerleri, kullanacağı metodları belirler.
        //Yapıcıların adı, sınıf adı ile aynı olmak zorundadır.
        //Yapıcı metodlar, geriye bir değer döndürmezler.
        //Yapıcı metodlar, aşırı yüklenebilir(overloading).
        //Her sınıf için bir default(varsayılan) constructor(yapıcı) vardır. Bu default yapıcılar herhangi bir parametre almazlar.
        //Eğer biz bu default constructor'u kullanmak istemiyorsak parametre alan bir constructor kullanmak istiyorsak, kendimiz bir yapıcı metod yazmamız gerekir.
        
        Hesap hesap = new Hesap(); //Hesap sınıfından bir nesne oluşturuyoruz.
    
        hesap.bilgileriGoster(); //hesap nesnemiz üzerinden bilgileriGoster metodumuzu çağırıyoruz.
        
        
        //Programı sadece nesne oluşturup çalıştırdığımızda bizim yazmış olduğumuz yapıcı metod çalıştırılır.
        
        System.out.println("**********************************");
        
        //Hesap sınıfından hesap2 adında bir nesne oluşturduk ve parametreli yapıcı metodumuza değerlerimmizi gönderdik. 
        Hesap hesap2 = new Hesap("12345", 1000.0, "İsa Emre Konuk", "isaemrekonuk9@gmail.com", "+90 555 555 55 55");
        
        hesap2.paraYatir(500); //hesap2 nesnemiz üzerinden paraYatir metodunu kullanarak para yatırma işlemini yapıyoruz.
        //hesap2 nesnemiz üzerinden paraCek metodunu kullanarak para çekme işlemi yapıyoruz.
        hesap2.paraCek(700); 
        hesap2.paraCek(1500);
        
        System.out.println("**********************************");
        
        
    }
    
}
