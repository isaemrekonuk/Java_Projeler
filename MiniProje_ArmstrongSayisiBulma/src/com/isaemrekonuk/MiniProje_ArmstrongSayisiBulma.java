
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class MiniProje_ArmstrongSayisiBulma {

    public static void main(String[] args) 
    {
        /*
            Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir.
            1634 = 1^4 + 6^4 + 3^4 + 4^4
            
            Örneğin, 3 basamaklı bir sayı
            371 = 3^3 + 7^3 + 1^3
        */
        
        Scanner degerAl = new Scanner(System.in); //Nesnemizi oluşturduk.
        
        System.out.print("Lütfen Bir Sayı Giriniz..: "); //Kullanıcıdan bir sayı girmesini istiyoruz.
        int sayi = degerAl.nextInt(); //Kullanıcının girdiği sayıyı değişkenimize atıyoruz.
        System.out.print("Lütfen Basamak Sayısını Giriniz..: "); //Kullanıcıdan basamak sayısını girmesini istiyoruz.
        int basamak = degerAl.nextInt(); //Kullanıcının girdiği sayıyı değişkenimize atıyoruz.
        
        int gecici = sayi; //Girilen sayıyı başka bir değişkende yedekliyoruz.
        int toplam = 0; //Değişkenimizi oluşturduk ve değer ataması yaptık.
        
        do 
        {
            int basamakDegeri = gecici % 10; //gecici değerinin 10'a bölümünden kalanını basamakDegeri değişkenine atıyoruz.
            gecici /= 10; //gecici'nin yeni değeri 10'a bölümü yapıyoruz.
            
            toplam += Math.pow(basamakDegeri, basamak); //Formülümüzü uyguluyoruz.
            
        }while(gecici > 0); //gecici değeri 0'dan büyük ise döngü dönecek.
                
        if (sayi == toplam)  //Eğer kullanıcının girmiş olduğu sayi ile toplam değerşi eşit ise bu kod bloğu çalışacak.
        {
            System.out.println(sayi + " sayısı bir armstrong sayısıdır."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        else //Koşul sağlanmıyor ise bu kod bloğu çalışacak.
        {
            System.out.println(sayi + " sayısı bir armstrong sayısı değildir..!"); //Ekrana yazdırma işlemi yapıyoruz.
        }
    }
    
}
