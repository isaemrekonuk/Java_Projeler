
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class MiniProje_KullaniciGirisProgrami {

    public static void main(String[] args) 
    {
        Scanner degerAl = new Scanner(System.in); //Nesnemizi oluşturduk.
        
        int girisHakki = 3; //Değişkenimizi tanımladık ve değer ataması yaptık.
        
        //Değişkenlerimiz tanımladık ve değer atamalarını yaptık.
        String kullaniciAdi = "isaemrekonuk";
        String sifre = "12345";
        
        //Ekrana yazdırma işlemlerini yapıyoruz.
        System.out.println("****************");
        System.out.println("Kullanıcı Giriş Paneline Hoş Geldiniz...");
        System.out.println("****************");
        
        while(true) //Sonsuz döngü kurduk.
        {
            System.out.print("Kullanıcı Adınız..: "); //Kullanıcıdan giriş yapmasını istiyoruz.
            String k_Adi = degerAl.nextLine(); //Girilen değeri değişkenimize atıyoruz.
            System.out.print("Şifreniz..: "); //Kullanıcıdan giriş yapmasını istiyoruz.
            String k_Sifre = degerAl.nextLine(); //Girilen değeri değişkenimize atıyoruz.
            
            if (kullaniciAdi.equals(k_Adi) && sifre.equals(k_Sifre)) //Kullanıcı adı ve şifre doğru ise bu kod bloğu çalışacak. 
            {
                System.out.println(kullaniciAdi + " Hoş Geldiniz..."); //Ekrana yazdırma işlemi yapıyoruz.
                break; //döngüden çıkmak için kullanıyoruz.
            }
            else
            {
                girisHakki--; //girisHakki değerimizi 1 azaltıyoruz.
                System.out.println("Kullnıcı Adınız veya Şifreniz Yanlış..!"); //Ekrana yazdırma işlemi yapıyoruz.
                System.out.println("Giriş Hakkınız..: " + girisHakki); //Ekrana yazdırma işlemi yapıyoruz.
            }
            
            if (girisHakki == 0) //Eğer girisHakki değeri 0 olursa bu kod bloğu çalışacak.
            {
                System.out.println("Giriş Hakkınız Bitti..!"); //Ekrana yazdırma işlemi yapıyoruz.
                break; //Döngüden çıkmak için kullanıyoruz.
            }
        }
    }
    
}
