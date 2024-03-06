
package com.isaemrekonuk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in); //Nesnemizi oluşturuyoruz.
        
        System.out.println("Hoş Geldiniz..."); //Ekrana yazdırma işlemi yapıyoruz.
        
        //Değişkenimizi tanımladık ve değer atamasını yaptık.
        String islemler = "İşlemler...\n"
                        + "1. Yazılımcı İşlemleri\n"
                        + "2. Yönetici İşlemleri\n"
                        + "Çıkış İçin q'ya Basınız.";
        
        System.out.println("**************************");
        System.out.println(islemler); //Ekrana yazdırma işlemi yapıyoruz.
        System.out.println("**************************");
        
        while(true) //Sonsuz döngü 
        {
            System.out.print("Lütfen İşlem Seçiniz..: "); //Ekrana yazdırma işlemi yapıyoruz.
            String islem = girdi.nextLine(); //Kullanıcıdan alınan değeri değişkenimize atıyoruz.
            
            if (islem.equals("1"))  //Girilen değer 1'e eşit ise bu kod bloğu çalışacak.
            {
                Yazilimci yazilimci = new Yazilimci("Emre", "Konuk", 567, "Java"); //Yazilimci sınıfından bir nesne oluşturuyoruz ve parametrelerini gönderiyoruz.
                
                //Değişkenimizi tanımladık ve değer atamasını yapıyoruz.
                String yazilimciIslemler = "1. Format At\n"
                                         + "2. Bilgileri Göster\n"
                                         + "Çıkış İçin q'ya Basınız.";
                        
                System.out.println(yazilimciIslemler); //Ekrana yazdırma işlemi yapıyoruz.
                
                while(true) //Sonsuz döngü
                {
                    System.out.print("İşlemi Seçiniz..: "); //Ekrana yazdırma işlemi yapıyoruz
                    String yazilimciIslem = girdi.nextLine(); //Kullanıcıdan alınan değeri değişkenimize atıyoruz.
                    
                    if (yazilimciIslem.equals("1")) //Girilen değer 1'e eşit ise bu kod bloğu çalışacak.
                    {
                        System.out.print("Format Atılmasını İstediğiniz İşletim Sistemi..: "); //Ekrana yazdırma işlemi yapıyoruz.
                        String isletimSistemi = girdi.nextLine(); //Girilen değeri değişkenimize atıyoruz.
                        
                        yazilimci.formatAt(isletimSistemi); //Nesnemiz üzerinden ilgili metodumuzu çağırıyoruz.
                    }
                    else if (yazilimciIslem.equals("2")) //Girilen değer 2'ye eşit ise bu kod bloğu çalışacak.
                    {
                        yazilimci.bilgileriGoster(); //Nesnemiz üzerinden ilgili metodumuzu çağırıyoruz.
                    }
                    else if (yazilimciIslem.equals("q")) //Girilen değer q'ya eşit ise bu kod bloğu çalışacak. 
                    {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor..."); //Ekrana yazdırma işlemi yapıyoruz.
                        break; //Döngüden çıkıyoruz.
                    }
                    else //Koşullar sağlanmıyorsa bu kod bloğu çalışacak.
                    {
                        System.out.println("Geçersiz Yazılımcı İşlemi Seçtiniz..!"); //Ekrana yazdırma işlemi yapıyoruz.
                    }
                }
            }
            else if (islem.equals("2"))  //Giilen değer 2'ye eşit ise bu kod bloğu çalışacak.
            {
                Yonetici yonetici = new Yonetici("Sena", "Konuk", 123, 10); //Yonetici sınıfından bir nesne oluşturuyoruz ve parametrelerini giriyoruz.
                
                //Değişkenimizi tanımladık ve değer atamasını yapıyoruz.
                String yoneticiIslemler = "1. Zam Yap\n"
                                        + "2. Bilgileri Göster\n"
                                        + "Çıkış İçin q'ya Basınız.";
                        
                System.out.println(yoneticiIslemler); //Ekrana ayzdırma işlemi yapıyoruz.
                
                while(true) //Sonsuz döngü
                {
                    System.out.print("Lütfen İşlem Seçiniz..: "); //Ekrana yazdırma işlemi yapıyoruz.
                    String yoneticiIslem = girdi.nextLine(); //Girilen değeri ilgili değişkenimize atıyoruz.
                    
                    if (yoneticiIslem.equals("1")) //Girilen değer 1'e eşit ise bu kod bloğu çalışacak.
                    {
                        System.out.print("Yöneticiden Ne Kadar Zam İstediğinizi Giriniz..: "); //Ekrana yazdırma işlemi yapıyoruz.
                        int zamMiktari = girdi.nextInt(); //Girilen değeri değişkenimize atıyoruz.
                        girdi.nextLine(); //İnt değerden sonra string bir değer girmeyi garanti altına almak için kullanıyoruz.
                        
                        yonetici.zamYap(zamMiktari); //Nesnemiz üzerinden ilgili metodumuzu çağırıyoruz.
                    }
                    else if (yoneticiIslem.equals("2")) //Girilen değer 2'ye eşit ise bu kod bloğu çalışacak.
                    {
                        yonetici.bilgileriGoster(); //Nesnemiz üzerinden ilgili metodumuzu çağırıyoruz.
                    }
                    else if (yoneticiIslem.equals("q")) //Girilen değer q'ya eşit ise bu kod bloğu çalışacak. 
                    {
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor..."); //Ekrana yazdırma işlemi yapıyoruz.
                        break; //Döngüden çıkıyoruz.
                    }
                    else //Koşullar sağlanmıyorsa bu kod bloğu çalışacak.
                    {
                        System.out.println("Geçersiz Yönetici İşlemi Seçtiniz..!"); //Ekrana yazdırma işlemi yapıyoruz.
                    }
                }
            }
            else if (islem.equals("q")) //Girilen değer q'ya eşit ise bu kod bloğu çalışacak.
            {
                System.out.println("Programdan Çıkılıyor..."); //Ekrana yazdırma işlemi yapıyoruz.
                break; //Döngüden çıkıyoruz.
            }
            else //Koşullar sağlanmıyorsa bu kod bloğu çalışacak.
            {
                System.out.println("Geçersiz İşlem Seçtiniz..!"); //Ekrana yazdırma işlemi yapıyoruz.
            }
            
        }
        
            
        
        
    }
    
}
