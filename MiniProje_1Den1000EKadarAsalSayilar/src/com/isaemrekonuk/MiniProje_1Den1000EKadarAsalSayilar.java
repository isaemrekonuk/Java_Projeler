
package com.isaemrekonuk;

public class MiniProje_1Den1000EKadarAsalSayilar 
{
    public static boolean asalMi(int sayi) //Parametreli bir metod oluşturduk.
    {
        for (int i = 2; i < sayi; i++) //Parametre olarak gelen değere kadar, her döngüde 1 artarak döngü dönecek.
        {
            if (sayi % i == 0) //Eğer sayi değeri i değerine bölümünden kalan 0 ise bu kod bloğu çalışacak.
            {
                return false; //Geriye false değeri döner.
            }
        }
        
        return true; //Geriye true değeri döner.
    }

    public static void main(String[] args) 
    {
        for (int i = 2; i < 1000; i++) //2'den başlayarak 1000'e kadar dönecek bir döngü oluşturduk. 
        {
            if (asalMi(i)) //Her i değerini metodumuza gönderiyoruz. Eğer geri dönen değer true ise bu kod bloğuna girecek.
            {
                System.out.println(i); //Ekrana yazdırma işlemi yapıyoruz.
            }
        }
    }
    
}
