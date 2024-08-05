
package com.isaemrekonuk;

class Hayvan //Sınıfmızı oluşturuyoruz. Başına public yazsaydık diğer class adıyla aynı olmak zorundaydı.
{
    private String isim; //Değişkenimizi tanımlıyoruz.

    public Hayvan(String isim) //Yapıcı metodumuzu oluşturuyoruz.
    {
        this.isim = isim; //Parametre olarak gelen değeri bu class içinde tanımlı değişkenimize atıyoruz.
    }

    public String getIsim() //Getter metodumuzu yazıyoruz.
    {
        return isim;
    }

    public void setIsim(String isim)  //Setter metodumuzu yazıyoruz.
    {
        this.isim = isim;
    }
    
    public String konus() //Metodumuzu yazıyoruz.
    {
        return "Hayvan konuşuyor..."; //Geriye değerimizi döndürüyoruz.
    }
    
}

class Kedi extends Hayvan //Kedi isimli bir class oluşturuyoruz ve Hayvan classından miras alıyor.
{

    public Kedi(String isim) //Yapıcı metodumuzu yazıyoruz.
    {
        super(isim); //Miras aldığımız classın yapıcı metodunu çağırıyoruz.
    }

    @Override
    public String konus() //Konus metdomuzu override ediyoruz.
    {
        return this.getIsim() + " miyavlıyor...";
    }
    
}

class Kopek extends Hayvan //Kopek isimli bir class oluşturuyoruz ve Hayvan classından miras alıyor.
{

    public Kopek(String isim) //Yapıcı metodumuzu yazıyoruz.
    {
        super(isim); //Miras aldığımız classın yapıcı metodunu çağırıyoruz.
    }

    @Override
    public String konus() //Konus metdomuzu override ediyoruz.
    {
        return this.getIsim() + " havlıyor...";
    }
    
}

class At extends Hayvan //At isimli bir class oluşturuyoruz ve Hayvan classından miras alıyor.
{

    public At(String isim) //Yapıcı metodumuzu yazıyoruz.
    {
        super(isim); //Miras aldığımız classın yapıcı metodunu çağırıyoruz.
    }

    @Override
    public String konus() //Konus metdomuzu override ediyoruz.
    {
        return this.getIsim() + " kişniyor...";
    }
    
}

public class Main {

    public static void konustur(Hayvan hayvan) //Metodumuzu yazıyoruz ve parametre olarak hayvan türünde bir nesne alıyoruz.
    {
        System.out.println(hayvan.konus()); //Ekrana nesnemiz üzerinden konus metodunu yazdırıyoruz.
    }
    
    public static void main(String[] args)
    {
        //Polymorphsim için nesnenin birden fazla nesne gibi davranması denebilir.
        
        //Hayvan nesnesi başka bir nesne gibi davranıyor. (Polymorphsim)
        Hayvan hayvan1 = new Kedi("Tekir"); //Hayvan sınıfından kedi nesnesi oluşturuyoruz.
        Hayvan hayvan2 = new Kopek("Karabaş"); //Hayvan sınıfından kopek nesnesi oluşturuyoruz.
        Hayvan hayvan3 = new At("Şahbatur"); //Hayvan sınıfından at nesnesi oluşturuyoruz.
       
        //Ekrana yazdırma işlemi yapıyoruz.
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());
        
        //Farklı bir kullanım. Parametre olarak gönderilen nesne metod içerisinde hayvan nesnesine eşitleniyor ve hayvan nesnesi başka bir nesne olarak davranıyor.
        konustur(new Kedi("Sarmal")); //metodumuzu çağırıyoruz ve parametremizi gönderiyoruz.
        konustur(new Kopek("Duman")); //metodumuzu çağırıyoruz ve parametremizi gönderiyoruz.
        konustur(new At("Düldül")); //metodumuzu çağırıyoruz ve parametremizi gönderiyoruz.
    }
    
}
