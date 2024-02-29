
package com.isaemrekonuk;

import java.util.Scanner;

public class ATM 
{
    public void calistir(Hesap hesap) //Metodumuzun parametre değerini obje olarak ayarlıyoruz.
    {
        Giris giris = new Giris(); //Giris sınıfından bir nesne oluşturuyoruz.
        
        Scanner girdi = new Scanner(System.in); //Nesnemizi oluşturuyoruz.
        
        //Ekrana yazdırma işlemi yapıyoruz.
        System.out.println("Bankamıza Hoş Geldiniz...");
        System.out.println("*****************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*****************************");
        
        int giris_hakki = 3; //Değişkenimizi tanımladık ve değer atamsını yaptık.
        
        while(true) //Sonsuz döngü kurduk.
        {
            //giris nesnemiz üzerinden ilgili metodumuza parametresini girerek çağırıyoruz. Eğer sonuç true ise bu kod bloğu çalışacak.
            if (giris.giris(hesap)) 
            {   
                System.out.println("Giriş Başarılı."); //Ekrana yazdırma işlemi yapıyoruz.
                break; //Döngüden çıkıyoruz.
            }
            else //Sonuc false ise bu kod bloğu çalışacak.
            {
                System.out.println("Giriş Başarısız..!"); //Ekrana yazdırma işlemi yapıyoruz.
                giris_hakki--; //giris_hakki değişkeninin değerini 1 azaltıyoruz.
                System.out.println("Giriş Hakkı..: " + giris_hakki); //Ekrana yazdırma işlemi yapıyoruz.
            }
            
            if (giris_hakki == 0) //giris_hakki değeri 0'a eşit ise bu kod bloğu çalışacak.
            {
                System.out.println("Giriş Hakkınız Kalmamıştır Lütfen Sonra Tekrar Deneyiniz..!");
                return; //Döngüyü sonlandırıyoruz.
            }   
        }
        
        //Ekrana yazdırma işlemlerini yapıyoruz.
        System.out.println("*****************************");
        String islemler = "1. Bakiye Görüntüle \n"
                        + "2. Para Yatırma \n"
                        + "3. Para Çekme \n"
                        + "4. Çıkış için q'ya basınız.";
        System.out.println(islemler);
        System.out.println("*****************************");
        
        while(true) //Sonsuz döngü kuruyoruz.
        {
            //Kullanıcıdan bir işlem seçmesini iztiyoruz.
            System.out.print("İşlem Seçiniz..: ");
            String islem = girdi.nextLine();
            
            if (islem.equals("q")) //Eğer q'ya basıldıysa bu kod bloğu çalışacak.
            {
                break; //Döngüyü sonlandırıyoruz.
            }
            else if (islem.equals("1"))  //Eğer 1'e basıldıysa bu kod bloğu çalışacak.
            {
                System.out.println("Bakiyeniz..: " + hesap.getBakiye()); //Ekrana yazdırma işlemi yapıyoruz.
            }
            else if (islem.equals("2")) //Eğer 2'ye basıldıysa bu kod bloğu çalışacak.
            {
                //Kullanıcıdan bir değer girmesini istiyoruz.
                System.out.print("Yatırmak İstediğiniz Tutar..: ");
                int tutar = girdi.nextInt();
                girdi.nextLine(); //int türünde veri aldıktan sonra tekrar string veri almak için kullanıyoruz.
                
                hesap.paraYatir(tutar); //hesap nesnemiz üzerinden ilgili metoda parametre göndererek çağırıyoruz.         
            }
            else if(islem.equals("3")) //Eğer 3'e basılırsa bu kod bloğu çalışacak.
            {
                //Kullanıcıdan bir değer girmesini istiyoruz.
                System.out.print("Çekmek İstediğiniz Tutar..: ");
                int tutar = girdi.nextInt();
                girdi.nextLine(); //int türünde veri aldıktan sonra tekrar string veri almak için kullanıyoruz.
                
                hesap.paraCek(tutar); //hesap nesnemiz üzerinden ilgili metoda parametre göndererek çağırıyoruz.
            }
            else //Hiçbir koşul sağlanmıyorsa bu kod bloğu çalışacak.
            {
                System.out.println("Geçersiz İşlem..!"); //Ekrana yazma işlemi yapıyoruz.
            }
        }
    }
}
