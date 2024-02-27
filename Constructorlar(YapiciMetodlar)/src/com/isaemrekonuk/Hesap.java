
package com.isaemrekonuk;


public class Hesap 
{
    //Alanlarımızı erişim belirleyicisiyle birlikte yazıyoruz.
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;
    
    //Constructor (Yapıcı) Metodumuzu yazıyoruz.
    public Hesap()
    {
        /*
        this.hesapNo = "Bilgi Yok..!";
        this.bakiye = 0.0;
        this.isim = "Bilgi Yok..!";
        this.email = "Bilgi Yok..!";
        this.telefonNo = "Bilgi Yok..!";
        */
        
        //Yukarıdaki kullanım yerine aşağıdaki gibi pratik bir kullanım yaparak parametreli yapıcı metodumuzu ile değişkenlerimize değer ataması yapıyoruz.
        
        this("Bilgi Yok..!", 0.0, "Bilgi Yok..!", "Bilgi Yok..!", "Bilgi Yok..!");
    }

    //Yapıcı metodumuza overloading(aşırı yükleme) yapıyoruz.
    public Hesap(String hesapNo, double bakiye, String isim, String email, String telefonNo)
    {
        //Yapıcı metodumuza parametre olarak gelen gelen değerleri sınıfımızın içerisinde tanımlı değişkenlerimize atıyoruz.
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }
    
    public void bilgileriGoster() //Bilgilerin hepsini yazdırmak için bir metod yazıyoruz.
    {
        //Ekrana yazdırma işlemlerini yapıyoruz.
        System.out.println("Hesap No..: " + this.hesapNo);
        System.out.println("Bakiye..: " + this.bakiye);
        System.out.println("İsim..: " + this.isim);
        System.out.println("Emial..: " + this.email);
        System.out.println("Telefon No..: " + this.telefonNo);
    }
    
    //Tek parametreli metodumuzu yazıyoruz.
    public void paraYatir(double miktar)
    {
        bakiye += miktar; //Parametre olarak gelen miktar değerini Hesap classımızın içerisinde tanımlı olan bakiye değeriyle toplayıp atıyoruz.
        
        System.out.println("Yeni Bakiye..: " + bakiye); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
    //Tek parametreli metodumuzu yazıyoruz.
    public void paraCek(double miktar)
    {
        if (miktar > 1500)  //Eğer mmiktar değeri 1500'den büyük ise bu kod bloğu çalışacak.
        {
            System.out.println("Bir Günde 1500 TL'den Fazla Para Çekemezsiniz..!"); //Ekrana yazdırma işlemi yapıyoruz.
        }
        if (bakiye - miktar < 0) //Eğer bakiyeden miktar değerini çıkarınca sonuç 0'dan küçük oluyorsa bu kod bloğu çalışacak.
        {
            //Ekrana yazdırma işlemlerini yapıyoruz.
            System.out.println("Yeterli Bakiye Yok..!");
            System.out.println("Bakiyeniz..: " + bakiye);
        }
        else //Eğer koşul sağlanmıyorsa bu kod bloğu çalışacak.
        {
            bakiye -= miktar; //bakiyeden miktar değerini çıkarıp bakiyeye atadık.
            System.out.println("Yeni Bakiye..: " + bakiye); //Ekrana yazdırma işlemi yapıyoruz.
        }
    }
    
    //Getter ve setter metodlarımızı otomatik olarak netbeans'e yazdırdık.
    
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
