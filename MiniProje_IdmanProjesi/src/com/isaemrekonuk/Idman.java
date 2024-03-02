
package com.isaemrekonuk;

public class Idman 
{
    private int burpee_sayisi;
    private int sinav_sayisi;
    private int mekik_sayisi;
    private int squat_sayisi;

    //Constructor'ımızı oluşturuyoruz.
    public Idman(int burpee_sayisi, int sinav_sayisi, int mekik_sayisi, int squat_sayisi) 
    {
        this.burpee_sayisi = burpee_sayisi;
        this.sinav_sayisi = sinav_sayisi;
        this.mekik_sayisi = mekik_sayisi;
        this.squat_sayisi = squat_sayisi;
    }
    
    //Getter ve setter metodlarımızı oluşturuyoruz.
    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getSinav_sayisi() {
        return sinav_sayisi;
    }

    public void setSinav_sayisi(int sinav_sayisi) {
        this.sinav_sayisi = sinav_sayisi;
    }

    public int getMekik_sayisi() {
        return mekik_sayisi;
    }

    public void setMekik_sayisi(int mekik_sayisi) {
        this.mekik_sayisi = mekik_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    
    public void hareketYap(String hareketTuru, int sayi)
    {
        if (hareketTuru.equals("Burpee")) //Eğer hareketTuru Burpee'ye eşit ise bu kod bloğu çalışacak.
        {
            burpeeYap(sayi); //Metodumuzu parametre göndererek çağırıyoruz.
        } 
        else if (hareketTuru.equals("Sinav")) //Eğer hareketTuru Şınav'a eşit ise bu kod bloğu çalışacak. 
        {
            sinavYap(sayi); //Metodumuzu parametre göndererek çağırıyoruz.
        }
        else if (hareketTuru.equals("Mekik")) //Eğer hareketTuru Mekik'e eşit ise bu kod bloğu çalışacak.
        {
            mekikYap(sayi); //Metodumuzu parametre göndererek çağırıyoruz.
        }
        else if (hareketTuru.equals("Squat")) //Eğer hareketTuru Squat'a eşit ise bu kod bloğu çalışacak.
        {
            squatYap(sayi); //Metodumuzu parametre göndererek çağırıyoruz.
        }
        else //Koşullar sağlanmıyor ise bu kod bloğu çalışacak.
        {
            System.out.println("Geçersiz Hareket Girdiniz..!"); //Ekrana yazdırma işlemi yapıyoruz.
        }
    }
    
    //Parametreli metodlarımızı oluşturuyoruz.
    public void burpeeYap(int sayi)
    {
        if (burpee_sayisi == 0) //Eğer burpee_sayisi 0'a eşit ise bu kod bloğu çalışacak.
        {
            System.out.println("Yapacak Burpee kalmadı..."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        
        if (burpee_sayisi - sayi < 0) //Eğer burpee_sayisi ile parametre olarak gelen sayi değerinin farkı 0'dan küçük ise bu kod bloğu çalışacak.
        {
            System.out.println("Hedeflediğiniz burpee sayısını geçtiniz. Tebrikler."); //Ekrana yazdırma işlemi yapıyoruz.
            burpee_sayisi = 0; //burpee_sayisi değişkenini 0'a eşitliyoruz.
            System.out.println("Kalan Burpee Sayısı..: " + burpee_sayisi); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else //Koşul sağlanmıyor ise bu kod bloğu çalışacak.
        {
            burpee_sayisi -= sayi; //burpee_sayisi'ndan sayi değerini çıkarıp burpee_sayisi değişkenine atıyoruz.
            System.out.println("Kalan Burpee Sayısı..: " + burpee_sayisi); //Ekrana yazdırma işlemi yapıyoruz.
        }
    }
    
    public void sinavYap(int sayi)
    {
        if (sinav_sayisi == 0) //Eğer sinav_sayisi 0'a eşit ise bu kod bloğu çalışacak.
        {
            System.out.println("Yapacak Şınav kalmadı..."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        
        if (sinav_sayisi - sayi < 0) //Eğer sinav_sayisi ile parametre olarak gelen sayi değerinin farkı 0'dan küçük ise bu kod bloğu çalışacak.
        {
            System.out.println("Hedeflediğiniz şınav sayısını geçtiniz. Tebrikler."); //Ekrana yazdırma işlemi yapıyoruz.
            sinav_sayisi = 0; //sinav_sayisi değişkenini 0'a eşitliyoruz.
            System.out.println("Kalan Şınav Sayısı..: " + sinav_sayisi); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else //Koşul sağlanmıyor ise bu kod bloğu çalışacak.
        {
            sinav_sayisi -= sayi; //sinav_sayisi'ndan sayi değerini çıkarıp sinav_sayisi değişkenine atıyoruz.
            System.out.println("Kalan Şınav Sayısı..: " + sinav_sayisi); //Ekrana yazdırma işlemi yapıyoruz.
        }
    }
    
    public void mekikYap(int sayi)
    {
        if (mekik_sayisi == 0) //Eğer mekik_sayisi 0'a eşit ise bu kod bloğu çalışacak.
        {
            System.out.println("Yapacak Mekik Kalmadı..."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        
        if (mekik_sayisi - sayi < 0) //Eğer mekik_sayisi ile parametre olarak gelen sayi değerinin farkı 0'dan küçük ise bu kod bloğu çalışacak.
        {
            System.out.println("Hedeflediğiniz mekik sayısını geçtiniz. Tebrikler."); //Ekrana yazdırma işlemi yapıyoruz.
            mekik_sayisi = 0; //mekik_sayisi değişkenini 0'a eşitliyoruz.
            System.out.println("Kalan Mekik Sayısı..: " + mekik_sayisi); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else //Koşul sağlanmıyor ise bu kod bloğu çalışacak.
        {
            mekik_sayisi -= sayi; //mekik_sayisi'ndan sayi değerini çıkarıp mekik_sayisi değişkenine atıyoruz.
            System.out.println("Kalan Mekik Sayısı..: " + mekik_sayisi); //Ekrana yazdırma işlemi yapıyoruz.
        }
    }
    
    public void squatYap(int sayi)
    {
        if (squat_sayisi == 0) //Eğer squat_sayisi 0'a eşit ise bu kod bloğu çalışacak.
        {
            System.out.println("Yapacak Squat Kalmadı..."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        
        if (squat_sayisi - sayi < 0) //Eğer squat_sayisi ile parametre olarak gelen sayi değerinin farkı 0'dan küçük ise bu kod bloğu çalışacak.
        {
            System.out.println("Hedeflediğiniz squat sayısını geçtiniz. Tebrikler."); //Ekrana yazdırma işlemi yapıyoruz.
            squat_sayisi = 0; //squat_sayisi değişkenini 0'a eşitliyoruz.
            System.out.println("Kalan Squat Sayısı..: " + squat_sayisi); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else //Koşul sağlanmıyor ise bu kod bloğu çalışacak.
        {
            squat_sayisi -= sayi; //squat_sayisi'ndan sayi değerini çıkarıp squat_sayisi değişkenine atıyoruz.
            System.out.println("Kalan Squat Sayısı..: " + squat_sayisi); //Ekrana yazdırma işlemi yapıyoruz.
        }
    }
    
    public boolean idmanBittiMi() //Boolean tipinde parametresiz bir metod yazıyoruz.
    {
        //İdman kapsamında tüm hareketler 0'a eşit olduğunda yani tüm hareketler yapıldığında metodumuz true değerini döndürecek.
        return (burpee_sayisi == 0) && (sinav_sayisi == 0) && (mekik_sayisi == 0) && (squat_sayisi == 0);
    }
}
