
package com.isaemrekonuk;

/**
 *
 * @author Emre
 */
public class Donguler {

    public static void main(String[] args) 
    {
        //Döngüler
        //Yazılan kodlarda belirli satırların birden fazla tekrar edilmesi istenebilir. Böyle durumlarda döngü yapıları kullanılır. 
        //Döngü ya while, do-while, for olmak üzere 3 tip döngü vardır.
        
        
        //While Döngüsü
        //While döngüsünde tekrar sayısı belli değildir. Döngü içerisinde oluşturacağımız şartlara göre döngü devam eder veya sonlanır.
        //Belirtilen koşulda true değeri döndüğü sürece döngü çalışır ve false değeri dönüp döngüden çıkınca program, döngünün bittiği yerden çalışmasına devam eder.
        //İken anlamına gelen bu döngü türünde, koşul ...'iken şunları yap diyebiliriz.
        /*
            while(koşul)
            {
                işlemler
            }
        */
        
        int sayi = 5; //Değişkenimizi tanımladık ve değer ataması yaptık.
        
        while(sayi > 0) //sayi değeri 0'dan büyük olduğu sürece bu döngü dönecek.
        {
            System.out.println("Sayının Değeri..: " + sayi); //Ekrana yazdırma işlemi yapıyoruz.
            sayi--; //Döngü her döndüğünde sayi değeri 1 azalacak.
        }
        
        
        
        
        //Do - while Döngüsü
        //Bu döngünün while döngüsünden tek farkı, döngüye girildikten sonra koşula bakıldığı için koşul yanlış olsa bile döngüye en az bir defalığına girilir.
        /*
            do 
            {
                işlemler
            }while(koşul);
        */
        
        
        int sayi2 = 10; //Değişkenimizi tanımladık ve değer ataması yaptık.
        
        do //İlk olarak do bloğunun içine girecek ve buradaki işlemleri yapacak sonrasında while koşuluna bakacak true ise döngü false olana kadar dönecek. False ise bir daha do bloğuna girmeden devam edecek.
        {
            System.out.println("Sayi2 Değeri..: " + sayi2); //Ekrana yazdırma işlemi yapıyoruz.
        }while(sayi2 > 10); //sayi2 değeri 10'dan büyük ise döngü false olana kadar dönecek.
        
        
        
        //For Döngüsü
        //İçerisinde tanımlanan değişkenin değeri, büyüklük koşulunu sağladığı sürece döngü devam eder.
        //Her döngü turu tamamlandığında, yeni tura geçmeden önce değişkenin değeri bir arttırılır ve koşul test edilir. Eğer koşul hala geçerli ise döngü turu başlar. Koşulun geçerliliği bittiğinde döngü biter ve program kaldığı yerden devam eder.
        //Bu döngü türünde bir aralık belirtilir ve bu aralık boyunca döngü çalışır.
        /*
            for(başlangıç_değeri; koşul; artım miktarı)
            {
                işlemler
            }
        */
        
        for (int i = 0; i < 10; i++)  //i değişkeni 0'dan başlayarak 10'a kadar her seferinde 1 artarak dönecek.
        {
            System.out.println("i değeri..: " + i); //Ekrana yazdırma işlemi yapıyoruz.
        }
        
        //for döngüsünde artımı yapılacak olan değişkenimiz birden fazla da olabilir. Bir değişkenimiz artarken diğer değişkenimiz azalabilir veya senkron olarak çalışabilir, her ikisi de artabilir. 
        //Bu değişkenlerin sayısını artırabiliriz. Farklı değişkenlerin arasına virgül koyulur.
    
        int sayac = 0; //Değişken tanımlıyoruz.
        
        for (int k = 0, m = 5; k < m; k++, m--)  //k, 0'dan başlayıp 1 artarak, m ise 5'den başlayıp 1 eksilerek devam edecek.
        {
            
            System.out.println(k + " değeri " + m + " değerinden küçüktür."); //Ekrana yazdırma işlemi yapıyoruz.
            sayac++; //Sayacımızı 1 arttırıyoruz.
        }
        
        System.out.println("For döngüsü " + sayac + " defa döndü ve döngü bitti."); //Ekrana yazdırma işlemi yapıyoruz.
    
    
        
        //Gelişmi For Döngüsü (Foreach)
        //for döngüsünde parantezler içerisine yazdığımız artım miktarı, başlangıç değeri gibi ifadeleri yazmak yerine daha kısa bir şekilde bu döngüyü oluşturabiliriz. 
        //Diğer dillerde bu yöntemin adı foreach döngüleridir. Java’da bu döngüye foreach döngüsü denmez, fakat biz akılda kalması için foreach döngüsü diyelim. 
        //Bu döngü, for döngüsünün gelişmiş şeklidir. Aynı işi daha pratik şekilde yapabiliriz.
        /*
          Bir dizinin içerisindeki elemanları listelediğimizi düşünelim. Bunu for döngüsü ile yapmak isteseydik; başlangıç olarak dizinin ilk indisi, bitiş
          değerini ve artış miktarını vererek dizinin her elemanını ekrana yazmamız gerekirdi. Bunun daha kolay bir yolu olan foreach dediğimiz döngüler ile bu
          işlemi daha az kod ile yapabiliriz.
        */
        
        int [] dizi = {1, 2, 3, 4, 5}; //Dizimizi oluşturduk.
        
        for (int j : dizi) //Tanımlamış olduğumuz diziyi j değişkeni ile tek tek geziyoruz.
        {
            System.out.println(j + " sayısı dizinin elemanıdır."); //Ekrana yazdırma işlemi yapıyoruz.
        }
        
        
        
        //break ve contiune ifadeleri
        //break ve continue ifadeleri döngümüzün, if else veya switch yapımızın herhangi bir yerinde kullanılabilir.
        //Örneğin; bir for döngüsünün 1’den 10’a kadar gittiğini düşünelim. Biz 5’ten sonraki değerlerini yazdırmak istemiyorsak break ifadesini kullanmalıyız. break ifadesi ile bloktan çıkıldığı gibi döngü de sona erdirilir. break ifadesine switch yapısında çok rastlanır.
        //Eğer sayı 5’e geldiğinde 5’i atlayarak 6’dan devam etsin istiyorsak, continue kullanmamız gerekir. continue ise istenmeyen değerler için döngünün çalıştırılması istenmiyorsa kullanılır.
        
        
        int g = 0; //Değişkenimizi tanımladık.
        
        while(true) //sonsuz döngümüzü kurduk.
        {   
            if (g == 6)  //g değeri 6'ya eşit ise bu kod bloğuna girecek.
            {
                System.out.println("g değeri 6'ya eşit oldu."); //Ekrana yazdırma işlemini yapıyoruz.
                break; //bu ifade ile bloğun dışına çıkıyoruz.
            }
            else //Koşul sağlanmıyorsa bu kod bloğu çalışacak.
            {
                System.out.println("g değeri..: " + g); //Ekrana yazdırma işlemi yapıyoruz.
            }
            
            g++; //g değerini 1 arttırıyoruz.
        }
        
        
        int h; //Değişkenimizi tanımladık.
        
        for (h = 0; h <= 10; h++)  //h değeri 0'dan başlayarak 10'a eşit olana kadar her seferinde 1 artarak dönecek.
        {
            if (h % 2 == 0) //h değerinin 2'ye bölümünden kalan 0'a eşit ise bu kod bloğuna girecek. (Yani çift sayı ise) 
            {
                continue; //bu ifade ile çift sayıları atlıyoruz.
            }
            else
            {
                System.out.println(h + " sayısı tek sayıdır."); //Ekrana yazdırma işlemi yapıyoruz.
            }
        }
    }
    
}
