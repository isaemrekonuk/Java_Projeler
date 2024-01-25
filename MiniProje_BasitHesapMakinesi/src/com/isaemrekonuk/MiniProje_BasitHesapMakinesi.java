
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class MiniProje_BasitHesapMakinesi {

    public static void main(String[] args) 
    {
        Scanner degerAl = new Scanner(System.in); //Nesnemizi oluşturduk.
        
        //İşlem menümüzü string bir değişkenimize yazıyoruz.
        String islemler = "1. Toplama İşlemi \n"
                        + "2. Çıkarma İşlemi \n"
                        + "3. Çarpma İşlemi \n"
                        + "4. Bölme İşlemi";
        
        //Ekrana yazdırıyoruz.
        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");
        System.out.print("Lütfen İşlemi Seçiniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
        int islem = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkenimize atıyoruz.
        
        switch(islem) //Kullanıcıdan alına islem değeri gönderiliyor
        {
            case 1: //Seçilen islem 1 ise bu kod bloğu çalışacak.
                System.out.print("Lütfen 1.Sayıyı Giriniz..: ");  //Kullanıcıdan değer girmesini istiyoruz.
                int sayi1 = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkenimize atıyoruz.
                System.out.print("Lütfen 2.Sayıyı Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
                int sayi2 = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkenimize atıyoruz.
                System.out.println("Sonuç..: " + (sayi1 + sayi2)); //Sonucu ekrana yazdırıyoruz.
                break; //Yukarıdaki işlemlerden sonra switchten çıkması için break ifadesini kullanıyoruz.
                
            case 2: //Seçilen islem 1 ise bu kod bloğu çalışacak.
                System.out.print("Lütfen 1.Sayıyı Giriniz..: ");  //Kullanıcıdan değer girmesini istiyoruz.
                sayi1 = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkenimize atıyoruz.
                System.out.print("Lütfen 2.Sayıyı Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
                sayi2 = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkenimize atıyoruz.
                System.out.println("Sonuç..: " + (sayi1 - sayi2)); //Sonucu ekrana yazdırıyoruz.
                break; //Yukarıdaki işlemlerden sonra switchten çıkması için break ifadesini kullanıyoruz.
                
            case 3: //Seçilen islem 1 ise bu kod bloğu çalışacak.
                System.out.print("Lütfen 1.Sayıyı Giriniz..: ");  //Kullanıcıdan değer girmesini istiyoruz.
                sayi1 = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkenimize atıyoruz.
                System.out.print("Lütfen 2.Sayıyı Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
                sayi2 = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkenimize atıyoruz.
                System.out.println("Sonuç..: " + (sayi1 * sayi2)); //Sonucu ekrana yazdırıyoruz.
                break; //Yukarıdaki işlemlerden sonra switchten çıkması için break ifadesini kullanıyoruz.
                
            case 4: //Seçilen islem 1 ise bu kod bloğu çalışacak.
                System.out.print("Lütfen 1.Sayıyı Giriniz..: ");  //Kullanıcıdan değer girmesini istiyoruz.
                sayi1 = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkenimize atıyoruz.
                System.out.print("Lütfen 2.Sayıyı Giriniz..: "); //Kullanıcıdan değer girmesini istiyoruz.
                sayi2 = degerAl.nextInt(); //Kullanıcının girdiği değeri değişkenimize atıyoruz.
                System.out.println("Sonuç..: " + (sayi1 / sayi2)); //Sonucu ekrana yazdırıyoruz.
                break; //Yukarıdaki işlemlerden sonra switchten çıkması için break ifadesini kullanıyoruz.
            
            default: //Case yapılarında yer almayan bir seçim yapıldığında bu kod bloğu çalışacak.
                System.out.println("Geçersiz İşlem Seçtiniz..!"); //Ekrana yazdırma yapıyoruz.
                break; //Yukarıdaki işlemlerden sonra switchten çıkması için break ifadesini kullanıyoruz.
        }
    }
    
}
