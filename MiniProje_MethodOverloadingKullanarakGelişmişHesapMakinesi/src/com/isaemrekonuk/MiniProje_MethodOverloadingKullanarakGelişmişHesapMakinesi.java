
package com.isaemrekonuk;

import java.util.Scanner;

public class MiniProje_MethodOverloadingKullanarakGelişmişHesapMakinesi 
{
    public static int cikarma (int a, int b) //Parametreli bir metod oluşturuyoruz.
    {
        return (a - b); //Geriye döndürme yapıyoruz.
    }
    
    public static double bolme (int a, int b) //Parametreli bir metod oluşturuyoruz.
    {
        return ((double)a / b); //Geriye döndürme yapıyoruz.
    }
    
    public static int toplama (int a, int b) //Parametreli bir metod oluşturuyoruz.
    {
        return (a + b); //Geriye döndürme yapıyoruz.
    }
    
    public static int toplama (int a, int b, int c) //Parametreli bir metod oluşturuyoruz.
    {
        return (a + b + c); //Geriye döndürme yapıyoruz.
    }
    
    public static int carpma (int a, int b) //Parametreli bir metod oluşturuyoruz.
    {
        return (a * b); //Geriye döndürme yapıyoruz.
    }
    
    public static int carpma (int a, int b, int c) //Parametreli bir metod oluşturuyoruz.
    {
        return (a * b * c); //Geriye döndürme yapıyoruz.
    }
    
    public static void main(String[] args) 
    {
        Scanner girdiAl = new Scanner(System.in); //Nesnemizi oluşturuyoruz.
        
        //Menümüzü değişkenimize yazıyoruz.
        String islemler = "1. Toplama İşlemi\n"
                        + "2. Çıkarma İşlemi\n"
                        + "3. Çarpma İşlemi\n"
                        + "4. Bölme İşlemi\n"
                        + "Çıkış için q'ya basınız.";
        System.out.println("*********************************");
        System.out.println(islemler); //Menümüzü ekrana yazdırıyoruz.
        System.out.println("*********************************");

        while(true) //Sonsuz döngü oluşturuyoruz.
        {
            System.out.print("İşlem Seçiniz..: "); //Kullanıcıdan bir değer girmesini istiyoruz.
            String islem = girdiAl.nextLine(); //Girilen değer ilgili değişkene atıyoruz.
            
            if (islem.equals("q") || islem.equals("Q")) //Eğer islem değeri q veya Q'ya eşit ise bu kod bloğu çalışacak.
            {
                System.out.println("Programdan Çıkılıyor..."); //Ekrana yazdırma işlemi yapılıyor.
                break; //Bloğu sonlandırıyoruz.
            }
            else if (islem.equals("1")) //Eğer islem değeri 'e eşit ise bu kod bloğu çalışacak.
            {
                System.out.print("Kaç Sayı Toplamak İstiyorsunuz (2 veya 3)..: "); //Kullanıcıdan bir değer girmesini istiyoruz.
                int kacSayi = girdiAl.nextInt();  //Girilen değer ilgili değişkene atıyoruz.
                
                if (kacSayi == 2) //kacSayi değeri 2'ye eşit ise bu kod bloğu çalışacak.
                {
                    System.out.print("Lütfen 1.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                    int sayi1 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                    System.out.print("Lütfen 2.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                    int sayi2 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                    girdiAl.nextLine(); //String değerden sonra int değer aldığımız için kullanıyoruz.
                    System.out.println(sayi1 + " sayısı ile " + sayi2 + " sayısının toplamı..: " + toplama(sayi1, sayi2)); //Ekrana yazdırma işlemi yapıyoruz.
                }
                else if (kacSayi == 3) //kacSayi değeri 3'ye eşit ise bu kod bloğu çalışacak.
                {
                    System.out.print("Lütfen 1.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                    int sayi1 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                    System.out.print("Lütfen 2.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                    int sayi2 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                    System.out.print("Lütfen 3.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                    int sayi3 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                    girdiAl.nextLine(); //String değerden sonra int değer aldığımız için kullanıyoruz.
                    System.out.println(sayi1 + ", " + sayi2 + " sayısı ve " + sayi3 + " sayısının toplamı..: " + toplama(sayi1, sayi2, sayi3)); //Ekrana yazdırma işlemi yapıyoruz.
                }
                else //Koşullar sağlanmıyor ise bu kod bloğu çalışacak.
                {
                    System.out.println("Hatalı Seçim Yaptınız..!"); //Ekrana yazdırma işlemi yapıyoruz.
                    girdiAl.nextLine(); //String değerden sonra int değer aldığımız için kullanıyoruz.
                }
                
            }
            else if (islem.equals("2"))  //islem değeri 2'ye eşit ise bu kod bloğu çalışacak.
            {
                System.out.print("Lütfen 1.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                int sayi1 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                System.out.print("Lütfen 2.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                int sayi2 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                girdiAl.nextLine(); //String değerden sonra int değer aldığımız için kullanıyoruz.
                System.out.println(sayi1 + " sayısı ile " + sayi2 + " sayısının farkı..: " + cikarma(sayi1, sayi2)); //Ekrana yazdırma işlemi yapıyoruz.
            }
            else if (islem.equals("3"))  //islem değeri 3'ye eşit ise bu kod bloğu çalışacak.
            {
                System.out.print("Kaç Sayı Çarpmak İstiyorsunuz (2 veya 3)..: "); //Ekrana yazdırma işlemi yapıyoruz.
                int kacSayi = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                
                if (kacSayi == 2)  //kacSayi değeri 2'ye eşit ise bu kod bloğu çalışacak.
                {
                    System.out.print("Lütfen 1.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                    int sayi1 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                    System.out.print("Lütfen 2.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                    int sayi2 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                    girdiAl.nextLine(); //String değerden sonra int değer aldığımız için kullanıyoruz.
                    System.out.println(sayi1 + " sayısı ile " + sayi2 + " sayısının çarpımı..: " + carpma(sayi1, sayi2)); //Ekrana yazdırma işlemi yapıyoruz.
                }
                else if (kacSayi == 3)  //kacSayi değeri 3'ye eşit ise bu kod bloğu çalışacak.
                {
                    System.out.print("Lütfen 1.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                    int sayi1 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                    System.out.print("Lütfen 2.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                    int sayi2 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                    System.out.print("Lütfen 3.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                    int sayi3 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                    girdiAl.nextLine(); //String değerden sonra int değer aldığımız için kullanıyoruz.
                    System.out.println(sayi1 + ", " + sayi2 + " sayısı ve " + sayi3 + " sayısının çarpımı..: " + carpma(sayi1, sayi2, sayi3)); //Ekrana yazdırma işlemi yapıyoruz.
                }
                else 
                {
                    System.out.println("Hatalı Seçim Yaptınız..!"); //Ekrana yazdırma işlemi yapıyoruz.
                    girdiAl.nextLine(); //String değerden sonra int değer aldığımız için kullanıyoruz.
                }
                
            }
            else if (islem.equals("4"))  //islem değeri 4'ye eşit ise bu kod bloğu çalışacak.
            {
                System.out.print("Lütfen 1.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                int sayi1 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                System.out.print("Lütfen 2.Sayıyı Giriniz..:"); //Kullanıcıdan bir değer girmesini istiyoruz.
                int sayi2 = girdiAl.nextInt(); //Girilen değer ilgili değişkene atıyoruz.
                girdiAl.nextLine(); //String değerden sonra int değer aldığımız için kullanıyoruz.
                System.out.println(sayi1 + " sayısı ile " + sayi2 + " sayısının bölümü..: " + bolme(sayi1, sayi2)); //Ekrana yazdırma işlemi yapıyoruz.
            }
            else  //Koşullar sağlanmıyor ise bu kod bloğu çalışacak.
            {
                System.out.println("Hatalı Seçim Yaptınız..!"); //Ekrana yazdırma işlemi yapıyoruz.
            }
        }
        
    }
    
}
