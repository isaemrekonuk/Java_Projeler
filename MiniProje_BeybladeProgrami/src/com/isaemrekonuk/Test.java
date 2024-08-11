
package com.isaemrekonuk;

import java.util.Scanner;

public class Test {

    public static void main(String[] args)
    {
        // Polymorphism kullanarak Beyblade Programı
        System.out.println("Beyblade Programına Hoşgeldiniz...");
        System.out.println("Çıkış için q'ya basın...");
        
        Scanner scanner =  new Scanner(System.in); //nesnemizi oluşturuyoruz.
        
        while(true)  //Sonsuz döngü
        {
            //Kullanıcıdan veri alıyoruz.
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz ? ");
            String islem = scanner.nextLine(); //Girilen değeri islem değişkenine atıyoruz.
            
            if (islem.equals("q")) //Girilen değer q ise bu kod bloğu çalışacak.
            {    
                System.out.println("Programdan Çıkılıyor..."); //Ekrana yazdırma işlemi yapıyoruz.
                break; //Döngüden çıkıyoruz.
            }
            else //Koşul sağlanmıyorsa bu kod bloğu çalışacak. 
            {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi(); //Nesnemizi oluşturuyoruz.
                
                Beyblade beyblade = fabrika.beybladeUret(islem); //Girilen değeri nesnemiz ile gönderiyoruz.
                
                if (beyblade == null) //beyblade değeri null ise bu kod bloğu çalıaşacak.
                {
                    System.out.println("Lütfen geçerli bir beyblade ismi girin..."); //Ekrana yazdırma işlemi yapıyoruz.
                }
                else //Koşul sağlanmıyorsa bu kod bloğu çalışacak.
                {
                    //Metodlarımızı çağırıyoruz.
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }   
            }
        }
    }
}
