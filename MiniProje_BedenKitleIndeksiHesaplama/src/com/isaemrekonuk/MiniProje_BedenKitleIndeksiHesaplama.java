
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class MiniProje_BedenKitleIndeksiHesaplama {

    public static void main(String[] args) 
    {
        //Beden kitle endeksi = kilo (kg) / boy (m) * boy (m)
        
        //Değişkenlerimizi tanımlıyoruz.
        int kilo; 
        double boy, bki;
        
        Scanner degerAl = new Scanner(System.in); //degerAl isimli bir nesne oluşturduk.
        
        System.out.print("Lütfen Kilonuzu (kg) Giriniz..: "); //Kullanıcıdan değer girilmesini istiyoruz.
        kilo = degerAl.nextInt(); //Kullnıcıdan alınan değer kilo değişkenine atadık.
        
        System.out.print("Lütfen Boyunuzu (m) Giriniz (Örn : 1,80)..: "); //Kullanıcıdan değer girilmesini istiyoruz.
        boy = degerAl.nextDouble(); //Kullanıcıdan alınan değer boy değişkenine atadık.
        
        bki = kilo / (boy * boy); //İlgili işlemleri yapıp değişkenimize atıyoruz.
        
        System.out.println("Beden Kitle İndeksiniz..: " + bki); //Değişkenimizi ekrana yazdırıyoruz.
    }
    
}
