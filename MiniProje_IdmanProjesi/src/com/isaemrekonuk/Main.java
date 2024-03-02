
package com.isaemrekonuk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in); //Nesnemizi oluşturduk.
        
        System.out.println("İdman Programına Hoş Geldiniz..."); //Ekrana yazdırma işlemi yapıyoruz.
        
        //Değişken tanımlıyoruz ve değişkenimize menümüzü oluşturuyoruz.
        String idmanlar = "Geçerli Hareketler...\n"
                        + "Burpee\n"
                        + "Şınav\n"
                        + "Mekik\n"
                        + "Squat";
        System.out.println(idmanlar); //Menüyü ekrana yazdırıyoruz.
        
        System.out.println("Lütfen Bir İdman Oluşturun."); //Ekrana yazdırma işlemi yapıyoruz.
 
        //Kullanıcıdan ilgili değerleri alıyoruz ve ilgili değişkenlere atıyoruz.
        System.out.print("Burpee Sayısı..: ");
        int burpee_sayisi = girdi.nextInt();
        System.out.print("Şınav Sayısı..: ");
        int sinav_sayisi = girdi.nextInt();
        System.out.print("Mekik Sayısı..: ");
        int mekik_sayisi = girdi.nextInt();
        System.out.print("Squat Sayısı..: ");
        int squat_sayisi = girdi.nextInt();
        girdi.nextLine(); //İnt türünden sonra tekrar döngü dönerse nextLine değer alacağımız için nesnemizi güvence altına almak için kullanıyoruz. 
        
        Idman idman = new Idman(burpee_sayisi, sinav_sayisi, mekik_sayisi, squat_sayisi); //İdman sınıfından bir nesne oluşturuyoruz ve parametrelerini gönderiyoruz.
        
        System.out.println("İdmanınız Başlıyor..."); //Ekrana yazdırma işlemi yapıyoruz.
        
        //idman class'ı içerisinde yazmış olduğumuz idmanın bitip bitmediğini kontrol eden metodumuzu çağırıyoruz.
        while(idman.idmanBittiMi() == false) //Geriye dönen değer false olduğu sürece yani idman bitmediği sürece döngü dönecek.
        {
            //Kullanıcıdan değer alıyoruz ve ilgili değişkenlere atama yapıyoruz.
            System.out.print("Hareket Türü (Burpee, Sinav, Mekik, Squat)..: ");
            String hareketTuru = girdi.nextLine();
            System.out.print(hareketTuru + " hareketini yapmak istediğiniz sayı..: ");
            int sayi = girdi.nextInt();
            girdi.nextLine(); //İnt türünden sonra tekrar döngü dönerse nextLine değer alacağımız için nesnemizi güvence altına almak için kullanıyoruz. 
            
            idman.hareketYap(hareketTuru, sayi); //idman class'ındaki ilgili metodu parametrelerini göndererek çağırıyoruz.
        }
       
        System.out.println("Tebrikler. İdmanınızı Başarıyla Bitirdiniz. :)"); //Ekrana yazdırma işlemi yapıyoruz.
    }      
}
