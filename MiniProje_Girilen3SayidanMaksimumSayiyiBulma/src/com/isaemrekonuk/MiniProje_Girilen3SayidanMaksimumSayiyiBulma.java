
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class MiniProje_Girilen3SayidanMaksimumSayiyiBulma {

    public static void main(String[] args) 
    {
        int sayi1, sayi2, sayi3, max; //Değişkenlerimizi tanımladık.
        
        Scanner degerAl = new Scanner(System.in); //Nesnemizi oluşturduk.
        
        System.out.print("Lütfen 1.Sayıyı Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
        sayi1 = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkenimize atıyoruz.
        System.out.print("Lütfen 2.Sayıyı Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
        sayi2 = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkenimize atıyoruz.
        System.out.print("Lütfen 3.Sayıyı Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
        sayi3 = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkenimize atıyoruz.
        
        if (sayi1 >= sayi2 && sayi1 >= sayi3) //Eğer sayi1, sayi2 ve sayi3 değerlerinden büyük veya eşit ise bu kod bloğu çalışacak.
        {
            max = sayi1; //max değişkenimize sayi1 değerini atıyoruz.
        }
        else if(sayi2 >= sayi1 && sayi2 >= sayi3) //Eğer sayi2, sayi1 ve sayi2 değerlerinden büyük veya eşit ise bu kod bloğu çalışacak.
        { 
            max = sayi2; //max değişkenimize sayi2 değerini atıyoruz.
        }
        else //Hiçbir koşul sağlanmıyor ise bu kod bloğu çalışacak.
        {
            max = sayi3; //max değişkenimize sayi2 değerini atıyoruz.
        }
            
        System.out.println("Maksimum Sayı..: " + max); //Ekrana sonucu yazdırıyoruz.
    }
    
}
