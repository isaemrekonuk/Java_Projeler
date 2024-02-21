
package com.isaemrekonuk;

public class Main 
{

    public static void main(String[] args) 
    {
        //Nesne Yönelimli Programlama
        //Nesne yönelimli programlamanın temelinde hiyerarşi yatar.
        //Bu hiyerarşiyi de sınıflar (class) ve nesneler (object) oluşturur.
        
        //Nesne (object)
        //Doğada her şey bir nesnedir. Bu nesnelerin iki özelliği vardır; Durum ve Davranış
        //Örnek olarak bir araba düşünelim. Bu arabanın rengi, markası, modeli gibi özellikler onun durumunu belirtir. Buna attribute (özellik) de denir.
        //Bu arabanın hızlanması, yavaşlaması, kaza yapması gibi özellikleri ise onun davranışını belirtir.
        //Dolayısıyla durumu ve davranışı olan her şey bir nesnedir.
        //Arabamızın durumundaki belirtilen özellikler, nesne yönelimli programlama da değişkenlerde üzerinde saklanır.
        //Davranışların nesne yönelimli programlama da karşılığı ise metodlardır. Metodlar, bir çeşit nesne fonksiyonudur.
        
        //Sınıf (class)
        //Sınıflar, nesnelerden oluşur. Nesnelerin durum ve davranışlarını tutar.
        //Örnek olarak bir insan nesnesi düşünelim. İnsan nesnesinin durumu olan boy, kilo ve davranışı olan nefes alıp verme gibi özellikleri ile beraber tutulduğu yer sınıftır.
        //Bu insan nesnesinin sınıfına canlı sınıfı diyebiliriz. Daha sonra bu canlı sınıfından istediğimiz kadar insan nesnesi oluşturabiliriz.
        
        //new Anahtar Kelimesi
        //Java'da bir sınıftan nesne oluşturmak için new anahtar kelimesi kullanılır.
        
        Araba araba = new Araba(); //Araba türünde bir nesne oluşturduk.
        
        //Araba türünde oluşturduğumuz nesnemiz üzerinden Araba sınıfındaki değişkenlere ulaşarak değer ataması yapıyoruz.
        //Araba sınıfında tanımlanan değişkenlerin erişim belirleyicisi public olduğu için istediğimiz yerden erişim sağlayabiliyoruz.
        araba.renk = "Beyaz";
        araba.kapiSayisi = 4;  
        araba.marka = "Renault";
        
        //Erişim belirleyicisi public olmadığı durumlarda özel metodlar yazarak yazma ve okuma işlemlerini dolaylı olarak yapabiliriz.
        araba.setModel("Clio"); //Aynı nesnemiz üzerinden özel yazdığımız metod aracılığıyla değişkenimize ulaştık ve değer atamasını yaptık.
        
        //Ekrana yazdırma işlemlerini yapıyoruz.
        System.out.println("Arabanın Rengi..: " + araba.renk);
        System.out.println("Arabanın Kapı Sayısı..: " + araba.kapiSayisi);
        System.out.println("Arabanın Markası..: " + araba.marka);
        System.out.println("Arabanın Modeli..: " + araba.getModel()); //model değişkeni Araba sınıfında public olmadığı için özel yazdığımız metod ile dolaylı olarak okuma yapıyoruz.
        
        
        
        
        
    }
    
}
