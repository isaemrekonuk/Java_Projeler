
package com.isaemrekonuk;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class Metodlar 
{
    //Metodumuzu oluşturuyoruz.
    public static void EkranaYaz() //Parametresiz bir metod oluşturduk.
    {
        System.out.println("Java Öğreniyorum..."); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
    //Metodumuzu oluşturuyoruz.
    public static void faktoriyel(int sayi) //Parametresiz bir metod oluşturduk.
    {   
        int faktoriyel = 1; //Değişkenimizi tanımladık ve değer ataması yaptık.
        
        while(sayi > 1) //sayi değeri 1'den büyük olduğu sürece bu kod bloğu çalışacak.
        { 
            faktoriyel *= sayi; //sayi değerini faktoriyel değeri ile çarpıp faktoriyel değişkenine atıyoruz.
            sayi--; //sayi değişkenini 1 azaltıyoruz.
        }
        System.out.println(sayi + " Sayısının Faktoriyeli..: " + faktoriyel); //Ekrana yazdırma işlemi yapıyoruz.
    } 
    
    //Metodumuzu oluşturuyoruz.
    public static void toplama(int a, int b) //Parametreli bir metod tanımladık.
    {
        int toplam = a + b; //değişkenimizi tanımladık ve parametre olarak gelecek değerleri toplayıp değişkenimize atadık.
        
        System.out.println(a + " sayısı ile " + b + " sayısının toplamı..: " +toplam );
    }
    
    //Metodumuzu oluşturuyoruz.
    public static int ikiylecarp(int a) //int geri dönüş tipli parametreli bir metod oluşturduk.
    {
        //Geri dönüş tipini kullanmamızın amacı, metodun sonuç olarak döndürdüğü değeri sonrasında kullanbiliyor olmamızdır. Aksi halde sonucu sadece ekrana yazdırabilir, üzerinde işlem yapamayız.
        return a * 2; //Geriye, parametre olarak gönderilen değeri 2 ile çarpıp döndürüyoruz.
    }
    
    //Metodumuzu oluşturuyoruz.
    public static int ikiyletopla(int a) //int geri dönüş tipli parametreli bir metod oluşturduk.
    {
        return a + 2; //Geriye, parametre olarak gönderilen değeri 2 ile toplayıp döndürüyoruz.
    }
     
    //Metodumuzu oluşturuyoruz.
    public static void hesapla(int s1, int s2) //Parametreli bir metod oluşturduk.
    {
        System.out.println("Hesapla (int) Metodu Sonuç..: " + (s1 + s2)); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
    //Metodumuzu oluşturuyoruz.
    public static void hesapla(double s1, double s2) //Parametreli bir metod oluşturduk. Overloading yapıyoruz.
    {
        System.out.println("Hesapla (double) Metodu Sonuç..: " + (s1 + s2)); //Ekrana yazdırma işlemi yapıyoruz.
    }
    
    public static void main(String[] args) 
    {
        //Metodlar
        //Metodlar, bir programın ayrılmış küçük parçacıkları olarak adlandırılır.
        //Yapılacak işlemleri, metodlar ile ayrı bir yerde yapabiliriz. Böylelikle aynı işlemi birden falza yapmak yerine tek metod ile defalarca kez çağırarak yapabiliriz.
        //Yapılacak olan bu işlemlerden herhangi bir değer dönebilir veya doğrudan işlemler yapıp bitirilebilir.
        
        //Parametreli ve Parametresiz Metod
        /*
        Örneğin; kullanıcıdan iki değer alınsın ve bunlar toplansın, daha sonra ekrana yazdırılsın istiyoruz. Bu işlemleri bir metod ile yapabiliriz. Bu
        işlemleri metod içerisinde tanımladıktan sonra, bize sadece o metodu çağırmak kalır. 
        Buradaki metoda kullanıcıdan aldığımız iki değer göndermemiz gerekir. Bu tür metodlara parametreli metodlar denir.
        */
        //Eğer biz bu metoda herhangi bir değer göndermeden işlem yaptırmak istiyorsak, kullanacağımız metodlara parametresiz metodlar denir. 
        
        
        //Metod Oluşturma
        //Erişim Belirleyici : Metoda nasıl erişileceğini belirtir. Yazmak zorunlu değildir. (public, private, proctected)
        //        Dönüş Tipi : Metoddan dönecek olan değerin tipidir. Bu int, string, object gibi tiplar olabilir. Metod eğer geriye bir değer döndürmüyorsa, void olarak tanımlanmalıdır.
        //         Metod Adı : Metoda verilecek isimdir. Metodu çağıracağımız zaman bu ismi kullanarak çağıracağız.
        // Parametre Listesi : Metoda kullanması için göndereceğimiz değerlerdir. Bu değerlerin sırası ve tipi önemlidir. Gönderilecek olan bu değerlerin tipide belirtilmelidir.
        //     Metod Gövdesi : Metodun yapacağı işlerin yazıldığı bölümdür.
        /*
          (E. Belileyici)  (Dönüş Tipi)    (Metod Adı)   (Parametreler)
            public            int            toplama     (int a, int b)
            {
                //Metod gövdesi
            }
        */
        
        EkranaYaz(); //Metodumuzu çağırdık.
        faktoriyel(5); //Metodumuzu çağırdık ve parametre olarak değer gönderdik.
        
        Scanner girdiAl = new Scanner(System.in); //Nesnemizi tanımlıyoruz.
        
        System.out.print("Lütfen 1.Sayıyı Giriniz..: "); //Ekrana yazdırma işlemi yapıyoruz.
        int a = girdiAl.nextInt(); //Kullanıcıdan alınan değeri ilgili değişkene atıyoruz.
        System.out.print("Lütfen 2.Sayıyı Giriniz..: "); //Ekrana yazdırma işlemi yapıyoruz.
        int b = girdiAl.nextInt();//Kullanıcıdan alınan değeri ilgili değişkene atıyoruz.
        
        toplama(a, b);  //Metodumuzu çağırdık ve kullanıcıdan alınan değerleri parametre olarak metoda gönderdik.
        
        System.out.println("Sonuç..: " + (ikiyletopla(ikiylecarp(8)))); //Metodun sonucundaki değer üzerinde işlem yapıp ekrana yazdırıyoruz.
        
        
        
        //Metodların Aşırı Yüklenmesi (Method Overloading)
        //Overloading kavramına göre, aynı isimli birden fazla metod olabilir.
        //Fakat bu metodların parametre tipleri, parametre sıraları veya parametre sayılarından herhangi birinin farklı olması gerekir.
        /*
        Örneğin ; 
            public static int hesapla(int s1)
            public static int hesapla(int s1, int s2)
            public static int hesapla(int s1, int s2, int s3)
            public static int hesapla(int s1, double s2, int s3)
            public static int hesapla(int s1, float s2, float s3)
        */
        
        hesapla(15, 10); //Metodumuzun parametrelerini girerek çağırıyoruz.
        hesapla(10.5, 12.4); //Overloading metodumuzun parametrelerini girerek çağırıyoruz.
        
    }
    
}
