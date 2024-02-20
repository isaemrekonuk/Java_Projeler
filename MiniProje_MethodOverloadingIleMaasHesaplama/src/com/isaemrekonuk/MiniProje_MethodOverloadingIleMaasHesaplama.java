
/*
    Uygulama Açıklama : 

    Ana Metodda (public static void main (String[] args)) klavyeden aşağıdaki değerler istenecek.
    -> Kişinin hafta içi çalıştığı gün sayısı
    -> Kişinin hafta sonu çalıştığı gün sayısı
    -> Kişinin resmi tatillerde çalıştığı gün sayısı
    -> Kişinin dini bayram tatillerinde çalıştığı gün sayısı
    
    Aşırı yüklenmiş metodlarda aşağıdaki hesaplamalar yapılacak (3 metod)
    -> Hafta içi çalışan gün sayısı * 50 + hafta sonu çalıştığı gün sayısı * 70 TL
    -> Hafta içi çalışan gün sayısı * 50 + hafta sonu çalıştığı gün sayısı * 70 + resmi tatilde çalıştığı gün sayısı * 100 TL
    -> Hafta içi çalışan gün sayısı * 50 + hafta sonu çalıştığı gün sayısı * 70 + resmi tatilde çalışıtğı gün sayısı * 100 + dini bayram tatillerinde çalıştığı gün sayısı * 120 TL

    Bu hesaplamalar yapıldıktan sonra ana metodda (public static void main(String[] args)) hesaplama sonuçlaır ekrana yazdıralacak.
*/

package com.isaemrekonuk;

import java.util.Scanner;

public class MiniProje_MethodOverloadingIleMaasHesaplama 
{
    public static void maasHesapla(int haftaici, int haftasonu) //Parametreli bir metod tanımlıyoruz.
    {
        int maas; //Değişkenimizi tanımlıyoruz.
        
        maas = haftaici * 50 + haftasonu * 70; //İlgili işlemleri yapıp değişkenimize atadık.
        
        System.out.println(maas + " TL"); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
    public static void maasHesapla(int haftaici, int haftasonu, int resmiTatil) //Parametreli bir metod tanımlıyoruz.
    {
        int maas; //Değişkenimizi tanımlıyoruz.
        
        maas = haftaici * 50 + haftasonu * 70 + resmiTatil * 100; //İlgili işlemleri yapıp değişkenimize atadık.
        
        System.out.println(maas + " TL"); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
    public static void maasHesapla(int haftaici, int haftasonu, int resmiTatil, int diniBayram) //Parametreli bir metod tanımlıyoruz.
    {
        int maas; //Değişkenimizi tanımlıyoruz.
        
        maas = haftaici * 50 + haftasonu * 70 + resmiTatil * 100 + diniBayram * 120; //İlgili işlemleri yapıp değişkenimize atadık.
        
        System.out.println(maas + " TL"); //Ekrana yazdırma işlemi yapıyoruz.
    }

    public static void main(String[] args) 
    {
        int haftaici, haftasonu, resmiTatil, diniBayram; //Değişkenlerimiz tanımladık.
        
        Scanner girdiAl = new Scanner(System.in); //Nesnemizi oluşturduk.
        
        System.out.print("Lütfen Hafta İçi Çalıştığınız Gün Sayısını Giriniz..: "); //Kullanıcıdan değer istiyoruz.
        haftaici = girdiAl.nextInt(); //Girilen değeri ilgili değişkene atıyoruz.
        System.out.print("Lütfen Hafta Sonu Çalıştığınız Gün Sayısını Giriniz..: "); //Kullanıcıdan değer istiyoruz.
        haftasonu = girdiAl.nextInt(); //Girilen değeri ilgili değişkene atıyoruz.
        System.out.print("Lütfen Resmi Tatillerde Çalıştığınız Gün Sayısını Giriniz..: "); //Kullanıcıdan değer istiyoruz.
        resmiTatil = girdiAl.nextInt(); //Girilen değeri ilgili değişkene atıyoruz.
        System.out.print("Lütfen Dini Bayramlarda Çalıştığınız Gün Sayısını Giriniz..: "); //Kullanıcıdan değer istiyoruz.
        diniBayram = girdiAl.nextInt(); //Girilen değeri ilgili değişkene atıyoruz.
        
        System.out.print("Kişinin Hafta İçi ve Hafta Sonu Çalıştığı Gün Sayılarına Göre Maaşı..: "); //Ekrana yazdırma işlemi yapıyoruz.
        maasHesapla(haftaici, haftasonu); //Metodumuza parametrelerini göndererek çağırıyoruz.
        
        System.out.print("Kişinin Hafta İçi, Hafta Sonu ve Resmi Tatillerde Çalıştığı Gün Sayılarına Göre Maaşı..: "); //Ekrana yazdırma işlemi yapıyoruz.
        maasHesapla(haftaici, haftasonu, resmiTatil);  //Metodumuza parametrelerini göndererek çağırıyoruz.
        
        System.out.print("Kişinin Hafta İçi, Hafta Sonu, Resmi Tatil ve Dini Bayramlarda Çalıştığı Gün Sayılarına Göre Maaşı..: "); //Ekrana yazdırma işlemi yapıyoruz.
        maasHesapla(haftaici, haftasonu, resmiTatil, diniBayram); //Metodumuza parametrelerini göndererek çağırıyoruz.
        
        
    }
    
}
