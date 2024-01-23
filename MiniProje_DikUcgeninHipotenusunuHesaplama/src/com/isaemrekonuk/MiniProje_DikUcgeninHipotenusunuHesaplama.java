
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class MiniProje_DikUcgeninHipotenusunuHesaplama {

    public static void main(String[] args)
    {
       Scanner degerAl = new Scanner(System.in); //Nesnemizi oluşturduk.
       
        System.out.print("Lütfen Dik Üçgenin Kısa Kenar Uzunluğunu Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
        double kisaKenar = degerAl.nextDouble(); //Alınan değeri değişkenimize atıyoruz.
        
        System.out.print("Lütfen Dik Üçgenin Uzun Kenar Uzunluğunu Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
        double uzunKenar = degerAl.nextDouble(); //Alınan değeri değişkenimize atıyoruz.
        
        double hipotenus; //Değişken tanımlıyoruz.
        
        //Math sınıfından sqrt(karakök) işlemini kullanıyoruz.
        hipotenus = Math.sqrt((kisaKenar * kisaKenar) + (uzunKenar * uzunKenar)); //İşlemleri yapıp değişkenimize atıyoruz.
        
        System.out.println("Hipotenüs Değeri..: " + hipotenus); //Ekrana sonucu yazdırıyoruz.
    }
    
}
