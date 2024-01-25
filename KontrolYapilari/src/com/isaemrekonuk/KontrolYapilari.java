
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class KontrolYapilari {

    public static void main(String[] args) 
    {
        //Kontrol Yapıları
        /*
         * if
         * if - else
         * if - else if
         * switch
         */
        
        //if yapısı
        //if, İngilizcede “eğer” anlamına gelmektedir. Kullanım şekli ise, “belirtilen şart/şartlar sağlanırsa şu işlemi/işlemleri gerçekleştir” şeklindedir.
        /*
            if (koşul)
            {
                eğer koşul sağlanıyorsa burada bulunan kodlar çalışır.
            }
        */
        
        //Değişkenlerimizi tanımlıyoruz.
        int a = 10;
        int b = 8;
        
        if (a > b)  //Eğer a değeri b değerinden büyük ise bu kod bloğu çalışacak.
        {
           System.out.println("a değeri b değerinden büyüktür."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        
        
        
        //if - else yapısı
        //If-Else kontrol yapısında bir koşul belirtilir ve koşulun sonucu true ya da false değer alır. True ise if bloğu, false ise else bloğu çalışır.
        /*
            if (koşul)
            {
                eğer koşul sağlanıyorsa burada bulunan kodlar çalışır.
            }
            else
            {
                eğer koşul sağlanmıyorsa burada bulunan kodlar çalışır.
            }
        */
        
        if (a <= b) //Eğer a değeri b değerinden küçük veya eşit ise bu kod bloğu çalışacak.
        {
            System.out.println("a değeri küçük veya eşittir b değerine.");  //Ekrana yazdırma işlemi yapıyoruz.
        }
        else //Koşul sağlanmıyorsa bu kod bloğu çalışcak.
        {
            System.out.println("a değeri b değerinden küçük veya eşit değildir."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        
        
        
        //if - else if yapısı
        //if - else if kontrol yapısında birden fazla koşul belirtilir ve koşulların hangisinin sonucu true diye kontrol edilir. Eğer belirtilen koşullardan herhangi biri sağlanıyorsa o koşulun bulunduğu blok çalışır. Aksi takdirde else bloğu çalışır.
        /*
            if (koşul)
            {
                koşul sağlanıyor ise bu kod bloğu çalışır.
            }
            else if (koşul 2)
            {
                koşul 2 sağlanıyor ise bu kod bloğu çalışır.
            }
            .
            .
            .
            else 
            {
                koşulların hiçbiri sağlanmıyor ise bu kod bloğu çalışır.
            }
        */
        
        if (a == b)  //Eğer a değeri b değerine eşitse bu kod bloğu çalışacak.
        {
            System.out.println("a değeri ile b değeri birbirine eşittir."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else if (a > b)  //Eğer a değeri b değerinden büyük ise bu kod bloğu çalışacak.
        {
            System.out.println("a değeri b değerinden büyüktür."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else    //Koşulların hiçbiri sağlanmıyorsa bu kod bloğu çalışacak.
        {
            System.out.println("a değeri b değerinden küçüktür."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        
        
        
        //Swtich yapısı
        //Switch Kontrolü, if else yapısının bir alternatifi olarak oluşturulmuştur. Uzun uzun else if şartları koymak yerine, bunu tek bir switch kontrolü ile yapabiliriz.
        //Switch kontrolleri belli bir aralık değil de doğrudan değer kontrolü yapar. O yüzden her if else yerine switch yapılarını kullanamayız.
        /*
            switch (sayi)
            {
                case 1:
                    sayi değeri 1 ise bu kod bloğu çalışacak.
                break;
                case 2:
                    sayi değeri 2 ise bu kod bloğu çalışacak.
                break;
                    .
                    .
                    .
                default:
                    sayi değeri sağlanımıyorsa bu kod bloğu çalışır.
                break;
            }
        */
        //Switch case yapısında, programın kontrolünün ifadenin değerine göre case seçeneklerinden sadece birini çalıştırıp bundan sonra switch case yapısını terk etmesini istiyorsak bu durumda her case seçeneğinden sonra break komutu yazmalıyız.
        
        Scanner degerAl = new Scanner(System.in); //Nesnemizi oluşturduk.
        
        System.out.print("Lütfen 1-5 arasında bir sayı giriniz..: "); //Kullanıcıdan bir değer istiyoruz.
        int sayi = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkene atıyoruz.
        
        switch(sayi) //Sayi değerini swtich'e gönderiyoruz.
        {
            case 1: //Sayi değeri 1 ise bu kod bloğu çalışacak.
                System.out.println("Girilen Değer..: 1"); //Ekrana yazdırma işlemi yapıyoruz.
                break;
            case 2: //Sayi değeri 2 ise bu kod bloğu çalışacak.
                System.out.println("Girilen Değer..: 1"); //Ekrana yazdırma işlemi yapıyoruz.
                break;
            case 3: //Sayi değeri 3 ise bu kod bloğu çalışacak.
                System.out.println("Girilen Değer..: 1"); //Ekrana yazdırma işlemi yapıyoruz.
                break;
            case 4: //Sayi değeri 4 ise bu kod bloğu çalışacak.
                System.out.println("Girilen Değer..: 1"); //Ekrana yazdırma işlemi yapıyoruz.
                break;
            case 5: //Sayi değeri 5 ise bu kod bloğu çalışacak.
                System.out.println("Girilen Değer..: 1"); //Ekrana yazdırma işlemi yapıyoruz.
                break;
            default: //Sayi değeri sağlanmıyor ise bu kod bloğu çalışacak.
                System.out.println("Geçersiz bir değer girdiniz..!"); //Ekrana yazdırma işlemi yapıyoruz.
                break;
        }
    
    }
    
}
