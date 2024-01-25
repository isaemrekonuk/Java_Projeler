
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class MiniProje_GelismisNotHesaplama {

    public static void main(String[] args) 
    {
        Scanner degerAl = new Scanner(System.in); //Nesnemizi oluşturuyoruz.
        
        System.out.print("Lütfen Vize (Arasınav) Notunuzu Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
        int vize = degerAl.nextInt(); //Kullanıcıdan alınan değeri değişkenimize atıyoruz.
        System.out.print("Lütfen Final (Yılsonu) Notunuzu Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
        int yilsonu = degerAl.nextInt(); //Kullanıcıdan alınan değeri değişkenimize atıyoruz.
        System.out.print("Lütfen Ödev Notunuzu Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
        int odev = degerAl.nextInt(); //Kullanıcıdan alınan değeri değişkenimize atıyoruz.
        
        //Alınan değerlerle ilgili işlemleri yapıp sonucu değişkenimize atıyoruz.
        double ortalama = ((vize * 30 / 100.0) + (yilsonu * 50 / 100.0) + (odev * 20 /100.0)); 
        
        System.out.println("Ortalamanız..: " + ortalama); //Ekrana yazdırma işlemi yapıyoruz.
        
        if (ortalama >= 90 && ortalama <= 100) //Eğer ortalama değeri 90 ve 100 aralığında ise bu kod bloğu çalışır.
        {
            System.out.println("Harf Notunuz..: AA"); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else if (ortalama >= 85.00 && ortalama < 90)  //Eğer ortalama değeri 85 ve 90 aralığında ise bu kod bloğu çalışır.
        {
            System.out.println("Harf Notunuz..: BA"); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else if (ortalama >= 80 && ortalama < 85)  //Eğer ortalama değeri 80 ve 85 aralığında ise bu kod bloğu çalışır.
        {
            System.out.println("Harf Notunuz..: BB"); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else if (ortalama >= 75 && ortalama < 80)  //Eğer ortalama değeri 75 ve 80 aralığında ise bu kod bloğu çalışır.
        {
            System.out.println("Harf Notunuz..: CB"); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else if (ortalama >= 65 && ortalama < 75)  //Eğer ortalama değeri 65 ve 75 aralığında ise bu kod bloğu çalışır.
        {
            System.out.println("Harf Notunuz..: CC"); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else if (ortalama >= 58 && ortalama < 65)  //Eğer ortalama değeri 58 ve 65 aralığında ise bu kod bloğu çalışır.
        {
            System.out.println("Harf Notunuz..: DC"); //Ekrana yazdırma işlemi yapıyoruz.
            System.out.println("Harf Notunuz Düşük Bu Dersi Tekrar Almayı Düşünebilirsiniz."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else if (ortalama >= 50 && ortalama < 58)  //Eğer ortalama değeri 50 ve 58 aralığında ise bu kod bloğu çalışır.
        {
            System.out.println("Harf Notunuz..: DD"); //Ekrana yazdırma işlemi yapıyoruz.
            System.out.println("Harf Notunuz Düşük Bu Dersi Tekrar Almayı Düşünebilirsiniz."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else  //Hiçbir koşul sağlanmıyor ise bu kod bloğu çalışır.
        {
            System.out.println("Harf Notunuz..: FF"); //Ekrana yazdırma işlemi yapıyoruz.
            System.out.println("Maalesef Kaldınız..! Bu Dersi Tekrar Almak Zorundasınız.");
        }
    }
    
}
