
package com.isaemrekonuk;

public class BeybladeFabrikasi
{
    public Beyblade beybladeUret(String beyblade_turu) //Parametreli metodumuzu yazıyoruz.
    {    
        if (beyblade_turu.equals("Dragon")) //Eğer gelen değer Dragon ise bu kod bloğu çalışacak.
        {
            return new Dragon("Takao", 800, 300,"Mavi Ejderha","Kutsal Canavarla Konuşma"); //Geriye Dragon nesnesini parametreleri ile döndürüyoruz.
        }
        else if (beyblade_turu.equals("Dranza")) //Eğer gelen değer Dranza ise bu kod bloğu çalışacak.
        {    
            return new Dranza("Kai",600,400,"Kırmızı Anka Kuşu"); //Geriye Dranza nesnesini parametreleri ile döndürüyoruz.
        }
        else if (beyblade_turu.equals("Drayga")) //Eğer gelen değer Drayga ise bu kod bloğu çalışacak.
        {    
            return new Dranza("Rei",800,250,"Beyaz Kaplan"); //Geriye Drayga nesnesini parametreleri ile döndürüyoruz.
        }
        else if (beyblade_turu.equals("Draciel")) //Eğer gelen değer Draciel ise bu kod bloğu çalışacak.
        {    
            return new Dranza("Max",400,1000,"Kara Kaplumbağa"); //Geriye Draciel nesnesini parametreleri ile döndürüyoruz.
        }
        else //Koşulların hiçbiri sağlanmıyorsa bu kod bloğu çalışacak.
        {
            return null; //Geriye null değerini döndürüyoruz.
        }
    }
}

