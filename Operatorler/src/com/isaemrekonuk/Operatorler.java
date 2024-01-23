
package com.isaemrekonuk;

/**
 *
 * @author Emre
 */
public class Operatorler {

    public static void main(String[] args) 
    {
        //Operatörler
        //Programlamada gerek matematiksel, gerekse karşılaştırma gibi işlemlerde operatörler kullanılır.
        
        //Atama Operatörleri 
        //Atama operatörleri, bir değişkeni başka bir değişkene atamak veya bir değişkene bir değer atamak için kullanılır.
        //Bu atama işlemi yapılırken aynı zamanda aritmetik operatörlerde kullanılabilir.
        /*
         *   =   , En temel atama operatörüdür. Atamalar her zaman sağdan sola doğrudur.
         *  +=   , Soldaki değere kendi değeri ile beraber sağdaki değeri de ekleyerek tekrar soldaki değere atar.
         *  -=   , Soldaki değerden sağdaki değeri çıkararak tekrar soldaki değere atar.
         *  *=   , Soldaki değeri sağdaki değer ile çarparak tekrar soldaki değere atar.
         *  /=   , Soldaki değeri sağdaki değere bölerek sonucu tekrar soldaki değere atar.
         */
        
        int a = 5; //a değişkenine 5 değerini atadık.
            
            //Ekrana yazdırma yapıyoruz.
            System.out.println("a değeri..: " + a);
            System.out.println("*****************");
        
            a += 2; //a değişkenindeki değer ile  2'yi toplayıp tekrar a değişkenine atadık. Böylelikle a'nı yeni değeri 7 oldu.
            
            System.out.println("a değeri..: " + a);
            System.out.println("*****************");
            
            a *= 3; //a değişkenindeki değer ile 3'ü çarpıp tekrar a değişkenine atadık. Böylelikle a'nın yeni değeri 21 oldu.
        
            System.out.println("a değeri..: " + a);
            System.out.println("*****************");
            
        int x, y;  //Değişken tanımladık.
        
            x = y = a; //Çoklu atama yaparak a değerini x ve y değişkenlerine atadık.
            
            System.out.println("a değeri..: " + a);
            System.out.println("x değeri..: " + x);
            System.out.println("y değeri..: " + y);
            System.out.println("*****************");
            
            
        //İlişkisel Operatörler
        //İlişkisel operatörler, veriler arasında karşılaştırma yapmaya yarar.
        /*
         *  <   (küçüktür)
         *  >   (büyüktür)
         *  <=  (küçük eşittir)
         *  >=  (büyük eşittir)
         *  ==  (eşittir)
         *  !=  (eşit değildir)
         */
        
        //Değişkenlerimizi tanımlıyoruz.
        int k = 10;
        int m = 8;
        
        //Ekrana yazdırma yapıyoruz.
        System.out.println("k (10) değeri m (8) değerinden büyüktür..: " + (k > m)); //ekrana true yazar.
        System.out.println("*****************");
        
        
        //Aritmetik Operatörler
        //Aritemtik operatörler matematiksel işlemler yapmak için kullanılır.
        /*
         *   +  , Toplama işlemi yapar.
         *   -  , Çıkarma işlemi yapar.
         *   *  , Çarpma işlemi yapar.
         *   /  , Bölme işlemi yapar.
         *   %  , Mod alma işlemi yapar.
         *  ++  , Değeri 1 arttırır.
         *  --  , Değeri 1 azaltır.
         */
        //Matematik işlemlerinde olduğu gibi yazılım dillerinde de işlem önceliği vardır. Çarpma ve bölme işlemi, toplama ve çıkarmaya göre daha önceliklidir.
        
        //Ekrana yazdırma yapıyoruz.
        System.out.println("k ve m değerlerinin toplamı..: " + (k + m));
        System.out.println("k ve m değerlerinin farkı..: " + (k - m));
        k++; //k değerini 1 arttırıyoruz.
        m--; //m değerini 1 azaltırıyoruz.
        System.out.println("k değerinin yeni değeri..: " + k);
        System.out.println("m değerinin yeni değeri..: " + m);
        System.out.println("*****************");
        
        
        //Mantıksal Operatörler
        //Bilgisayar dillerinin hemen hepsinde program akışında kontol edebilmek için ve yönlendirmek için mantıksal operatörler kullanılır.
        /*
         *   &   , Mantıksal VE (AND) işlemi yapar.
         *   |   , Mantıksal VEYA (OR) işlemi yapar.
         *   &&  , Koşullu VE işlemi yapar. Karşılaştırılan iki değerden her ikiside true olduğu sürece true değeri döndürülür.
         *   ||  , Koşullu VEYA işlemi yapar. Karşılaştırılan iki değerden en az biri true ise true değeri döndürülür.
         *   !   , Mantıksal DEĞİL (NOT) işlemi yapar. Verilen boolean tipindeki verinin tersini verir.
         *   ^   , Mantıksal XOR işlemi yapar.
         */
        
        //Değişkenlerimiz tanımlıyoruz. 
        boolean q = true;
        boolean p = false;
        
        //Ekrana yazdırma yapıyoruz.
        System.out.println("q && p  : " + (q && p));
        System.out.println("q || p  : " + (q || p));
        System.out.println("q ^ p  : " + (q ^ p));
        System.out.println("!q (değil) : " + (!q));
        System.out.println("*****************");
        
        
        
        //Bitsel Operatörler
        //Programlamada çok fazla kullanılmayan bitsel operatörler bitleri kaydırmak için tersini almak gibi işlemler için kullanılır.
        /*
         *   ~   , Bütün bitlerin tersini alır.
         *   &   , Bitsel olarak VE işlemi yapar.
         *   |   , Bitsel olarak VEYA işlemi yapar.
         *   ^   , Bitsel olarak XOR işlemi yapar.
         *   >>  , Bitsel olarak sayısı istenilen değer kadar sağa kaydırır.
         *   <<  , Bitsel olarak sayısı istenilen değer kadar sola kaydırır.
         */
        
    }
    
}
