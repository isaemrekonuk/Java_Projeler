
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class MiniProje_DöngulerleATMProgramı {

    public static void main(String[] args) 
    {
        Scanner degerAl = new Scanner(System.in); //Kullanıcıdan değer alabilmek için nesnemizi oluşturuyoruz.
        
        int bakiye = 1000; //Değişkenimiz tanımladık ve değer atamasını yaptık.
        
        //Menümüzü oluşturuyoruz.
        String islemler = "1- Bakiye Öğrenme \n"
                        + "2- Para Çekme \n"
                        + "3- Para Yatırma \n"
                        + "4- Çıkış";
        
        System.out.println("*********************");
        System.out.println(islemler); //Ekrana yazdırma işlemi yapıyoruz.
        System.out.println("*********************");
         
        while(true) //Sonsuz döngümüzü kuruyoruz.
        {
            System.out.print("Lütfen Bir İşlem Seçiniz..: ");
            int secim = degerAl.nextInt(); //Kullanıcıdan aldığımız değeri secim değişkenimize atıyoruz.

            if(secim == 1) //Kullanıcının girdiği değer 1 ise bu kod bloğu çalışacak.
            {
                System.out.println("Bakiyeniz..: " + bakiye); //Ekrana yazdırma işlemi yapıyoruz.  
            }
            else if(secim == 2) //Kullanıcının girdiği değer 2 ise bu kod bloğu çalışacak.
            {
                System.out.print("Çekmek İstediğiniz Tutarı Giriniz..: ");  //Kullanıcıdan değer girmesini istiyoruz.
                int cekilen = degerAl.nextInt(); //Girilen değeri cekilen değişkenine atıyoruz.
 
                if (cekilen > bakiye)  //Eğer çekilmek istenen tutar bakiyeden fazla ise bu kod bloğu çalışacak.
                {
                    System.out.println("Yeterli Bakiyenz Yok..!"); //Ekrana yazdırma işlemi yapıyoruz.
                    System.out.println("Bakiyeniz..: " + bakiye); //Ekrana yazdırma işlemi yapıyoruz.
                }
                else
                {  
                    bakiye -= cekilen; //cekilmek istenen tutarı bakiyeden çıkarıyoruz.
                    System.out.println("Para Başarılı Bir Şekilde Çekildi."); //Ekrana yazdırma işlemi yapıyoruz.
                    System.out.println("Güncel Bakiyeniz..: " + (bakiye)); //Ekrana yazdırma işlemi yapıyoruz.
                }
            }
            else if (secim == 3)  //Kullanıcının girdiği değer 3 ise bu kod bloğu çalışacak.
            {
                System.out.print("Yatırmak İstediğiniz Tutarı Giriniz..: ");  //Kullanıcıdan değer girmesini istiyoruz.
                int yatirilan = degerAl.nextInt(); //Girilen değeri cekilen değişkenine atıyoruz.
                System.out.println("Para Başarılı Bir Şekilde Yatırıldı."); //Ekrana yazdırma işlemi yapıyoruz.
                System.out.println("Güncel Bakiyeniz..: " + (bakiye + yatirilan)); //Ekrana yazdırma işlemi yapıyoruz.
            }   
            else if (secim == 4)  //Kullanıcının girdiği değer 4 ise bu kod bloğu çalışacak.
            {
                System.out.println("Güvenli Bir Şekilde Çıkış Yapıldı..: ");  //Ekrana yazdırma işlemi yapıyoruz.
                break; //break ile bloktan çıkıyoruz.
            }
            else //Hiçbir koşul sağlanmıyor ise bu kod bloğu çalışacak.
            {
                System.out.println("Geçersiz İşlem Seçimi Yaptınız..!"); //Ekrana yazdırma işlemi yapıyoruz.
            }
        }
    }
    
}
