
package com.isaemrekonuk;

import java.util.Scanner;

public class Giris 
{
    public boolean giris(Hesap hesap) //Metodumuza parametre olarak hesap objesi giriyoruz. 
    {
        Scanner girdi = new Scanner(System.in); //Nesnemizi oluşturuyoruz.
        
        //Değişken tanımlaması yapıyoruz.
        String kullaniciAdi;
        String parola;
        
        //Kullanıcıdan değer girmesini istiyoruz ve girilen değerleri ilgili değişkenlere atıyoruz.
        System.out.print("Kullanıcı Adı..: ");
        kullaniciAdi = girdi.nextLine();
        System.out.print("Parola..: ");
        parola = girdi.nextLine();
        
        //Eğer girilen kullanıcı adı ve parola doğru ise bu kod bloğu çalışacak.
        if ((hesap.getKullanici_Adi().equals(kullaniciAdi)) && (hesap.getParola().equals(parola))) 
        {
            return true; //Geriye true değerini dönecek.
        }
        else //Koşul sağlanmıyor ise bu kod bloğu çalışacak.
        { 
            return false; //Geriye false değeri dönecek.
        }
    }
}
