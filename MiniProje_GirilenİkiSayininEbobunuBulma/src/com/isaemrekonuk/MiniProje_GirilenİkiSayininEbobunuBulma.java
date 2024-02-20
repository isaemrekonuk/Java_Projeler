
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class MiniProje_GirilenİkiSayininEbobunuBulma 
{
    public static int ebobBul(int sayi1, int sayi2) //Parametreli, geri dönüş tipi int olan bir metod oluşturuyoruz.
    {
        int ebob = 1; //Değişkenimiz tanımladık ve değer atamasını yaptık.
        
        for (int i = 1; i <= sayi1 && i <= sayi2; i++) //i değeri sayi1 ve sayi2 değerlerinden küçük olduğu sürece her döngüde 1 artarak dönecek. 
        {
            if ((sayi1 % i == 0) && (sayi2 % i == 0)) //Eğer sayi1 ve sayi2 değerlerinin i'ye bölümünden kalan 0 ise bu kod bloğu çalışacak.
            {
                ebob = i; //i değeri ebob değişkenine atıyoruz.
            }
        }
        
        return ebob; //ebob değerini geriye döndürüyoruz.
    }
    
    public static void main(String[] args) 
    {
        Scanner girdiAl = new Scanner(System.in); //Nesnemizi oluşturuyoruz.
        
        System.out.print("Lütfen 1.Sayıyı Giriniz..: "); //Ekrana yazdırma işlemi yapıyoruz.
        int sayi1 = girdiAl.nextInt(); //Kullanıcıdan alınan değer ilgili değişkene atıyoruz.
        System.out.print("Lütfen 2.Sayıyı Giriniz..: "); //Ekrana yazdırma işlemi yapıyoruz.
        int sayi2 = girdiAl.nextInt(); //Kullanıcıdan alınan değer ilgili değişkene atıyoruz.
        
        System.out.println("İki Sayısının EBOB'u..: " + ebobBul(sayi1, sayi2)); //Ekrana yazdırma işlemi yapıyoruz.
       
                
    }
    
}
