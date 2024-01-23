
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class MiniProje_KilometreyeGoreOdenecekTutarHesaplama {

    public static void main(String[] args) 
    {
        //Bir aracın kilometre ne kadar yaktığı ve kaç kilometre yol yaptığı bilgilerini alıp sürücünün toplam ne kadar ödemesi gerektiğini hesaplıyoruz.
        
        Scanner degerAl = new Scanner(System.in); //Nesnemizi oluşturduk. 
        
        System.out.print("Lütfen Aracınızın Kilometre Başına Yaktığı Tutarı Giriniz (Örn : 0,32)..: "); //Kullanıcıdan değer istiyoruz.
        double kurus = degerAl.nextDouble(); //Kullanıcıdan alınan değer ilgili değişkene atıyoruz.
        
        System.out.print("Lütfen Aracınızla Gittiğiniz Kilometreyi Giriniz..: "); //Kullanıcıdan değer istiyoruz.
        double km = degerAl.nextDouble(); //Kullanıcıdan alınan değer ilgili değişkene atıyoruz.
        
        double toplamTutar; //Değişkenimizi tanımladık.
         
        toplamTutar = kurus * km; //İlgili işlemleri yapıp değişkenimize atadık.
        
        System.out.println("Toplam Ödemeniz Gereken Tutar..: " + toplamTutar + " TL "); //Ekranan sonucumuzu yazdırıyoruz.
    }
    
}
