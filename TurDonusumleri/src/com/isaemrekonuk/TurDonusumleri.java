
package com.isaemrekonuk;

/**
 *
 * @author Emre
 */
public class TurDonusumleri {

    public static void main(String[] args) 
    {
        //Tür Dönüşümleri
        //Tür dönüşümü, belli bir veri türündeki değişkeni başka bir veri türüne dönüştürmektir.
        //Genelde küçük veri türlerini büyük veri türlerine çevirirken sorun yaşanmaz. 
        //Ancak büyük veriyi küçük veriye çevirirken sorunlar(bilgi kaybı) olabilir.
        
        //Int veri türünü String türüne dönüştürme
        
        int sayi = 15; //int türünde bir değişken tanımladık.
        
        String deger = String.valueOf(sayi); //1.yöntem
        String deger1 = Integer.toString(sayi); //2.yöntem
        
        //Ekrana yazdırma işlemlerini yapıyoruz.
        System.out.println(deger);
        System.out.println(deger1);
        System.out.println("**************");
        
       
        //String türünü int türüne dönüştürmek
        
        String metin = "2024"; //String türünde değişken tanımladık.
        
        int yeniSayi = Integer.parseInt(metin); //1.yöntem
        int yeniSayi1 = Integer.valueOf(metin); //2.yöntem
        
        //Ekrana yazdırma işlemlerini yapıyoruz.
        System.out.println(yeniSayi);
        System.out.println(yeniSayi1);
        System.out.println("**************");
        
               
        //Double'ı int'e dönüştürme
        
        double dSayi = 13.133d; //Double türünde değişkenimizi tanımladık.
        
        int iSayi = (int) dSayi; //Tür dönüşümü yapıp değişkenimize atadık.
        
        //Ekrana yazdırma işlemini yapıyoruz.
        System.out.println(iSayi);
        System.out.println("**************");
        
        
        //Float'ı long'a dönüştürme
        
        float fSayi = 112.153f; //float türünde değişkenimizi tanımladık.
        
        long lSayi = (long) fSayi; //tür döünşümünü yapıp değişkenimize atadık.
        
        //Ekrana yazdırıyoruz.
        System.out.println(lSayi);
        System.out.println("**************");
        
        
        //int'i double'a dönüştürme
        
        int intSayi = 151; //Değişkenimizi tanımladık.
        
        double doubleSayi = (double) intSayi; //Tür dönüşümünü yaptık değişkenimize atadık.
        
        //Ekrana yazdırıyoruz.
        System.out.println(doubleSayi);
    }
    
}
