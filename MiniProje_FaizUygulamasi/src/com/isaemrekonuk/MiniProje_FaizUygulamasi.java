
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class MiniProje_FaizUygulamasi 
{

    public static void main(String[] args)
    {
        Scanner degerAl = new Scanner(System.in); //Nesnemizi oluşturduk.
        
        System.out.println("Bankamıza Hoş Geldiniz... Faiz Oranı %6"); //Ekrana yazdırma işlemi yapıyoruz.
        
        int anapara, vade; //Değişkenlerimiz tanımladık.
        
        System.out.print("Lütfen Yatırmak İstediğiniz Tutarı Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
        anapara = degerAl.nextInt(); //Girilen değeri değişkenimize atıyoruz.
        System.out.print("Paranızı Kaç Yıl Vadeli Yatırmak İstiyorsunuz?..: "); //Kullanıcıdan değer girmesini istiyoruz.
        vade = degerAl.nextInt(); //Girilen değeri değişkenimize atıyoruz.
        
        //Değişkenlerimizi tanımladık ve değer atamalarını yaptık.
        double toplamPara = anapara; 
        double faizOrani = 0.06; 
        
        for (int i = 1; i <= vade; i++) // i değeri 1'den başlayarak vade miktarına kadar 1 artarak dönecek.
        {
            toplamPara = (toplamPara * faizOrani) + toplamPara; //İlgili işlemlerimizi yapıp değişkenimize atadık.
            
            System.out.println(i + ". Yılın Sonunda Toplam Paranız..: " + toplamPara + " TL"); //Ekrana yazdırma işlemi yapıyoruz.
        }
    }
    
}
