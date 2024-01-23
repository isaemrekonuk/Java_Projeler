
package scannerıleınputalma;

import java.util.Scanner; //Scanner sınıfını import ettik.
import javax.swing.JOptionPane; //JOptionPane sınıfını import ettik.

/**
 *
 * @author Emre
 */
public class ScannerIleInputAlma {

    public static void main(String[] args) 
    {
        //Scanner Sınıfı ve JOptionPane ile klavyeden veri alma
        
        //Scanner Sınıfı
        //Herhangi bir programlama dilinde, kullanıcıdan veri girişi yapmasını isteyebiliriz. 
        //Kullanıcının girdiği bu verilere göre işlemler, ekrana yazdırma veya parametreler olarak sunabiliriz. Bunuda Scanner sınıfı ile yaparız.
        //Scanner sınıf, java.util paketinde bulunur. Scanner sınıflarını kullanabilmek için java.util.Scanner sınıfı import edilmelidir.
        //Scanner sınıfı ile klavyeden veri okumak için bu sınıftan nesne oluşturmamız gerekir.
        
        Scanner degerAl = new Scanner(System.in); //degerAl isimli nesnemizi oluşturduk.
        
        //Kullanıcıdan alınan değerler ile işlemler yapmak için girilen değerleri değişkenlere atamamız gerekir.
        //Alınan değerlerin değişkenlere atamalarını yaparken verinin türüne göre atama yapmamız gerekmetedir.
        /*
         * nextInt(); Klavyeden int türünde değerler okur.
         * nextByte(): Klavyeden byte türünde değerler okur.
         * nextShort(): Klavyeden Short türünde değerler okur.
         * nextFloat(): Klavyeden Float türünde değerler okur.
         * nextDouble(): Klavyeden Double türünde değerler okur.
         * nextBoolean(): Klavyeden matıksal değerler okur.
         * nextLine(): Klavyeden String değerler okur. Kelimeler arası boşluk olsa bile tamamını okur.
         * next(): Klavyeden String değerler okur. Kelimeler arası boşluk varsa boşluğa kadar olan kısmı okur fakat kelimeler arası boşluk yoksa tamamını okur.
        */
        
        System.out.print("Lütfen bir sayı giriniz..: "); //Ekrana yazdırma işlemi yapıyoruz.
        
        int sayi = degerAl.nextInt(); //kullanıcıdan alınan değer sayi değişkenine atadık.
    
        System.out.println("Girilen sayı..: " + sayi);
        
        
        //JOptionPane Kullanımı
        //JOptionPane, kullanıcı ile etkileşimi sağlar. Kullanıcıdan veri alır veya kullanıcıya mesaj gösterir.
        //Veri alıp gösterme işlemini, bir pencere yardımıyla yapar. Konsol uygulamaları yerine form uygulaması özelliği getirmiştir. 
        // Bu özelliği kullanabilmek için ilk olarak java.swing.JOptionPane sınıfı import edilmelidir.
        
        //Kullanıcıdan veri alma
        //JOptionPane.showInputDialog(Buraya mesaj yazılacak);
        
        //Bilgi mesajı gösterme
        //JOptionPane.showMessageDialog(null, buraya mesaj yazılacak);
        
        String mesaj; //Değişkenimizi tanımlıyoruz.
        
        //JOptionPane ile kullanıcıdan veri alıyoruz.
        mesaj = JOptionPane.showInputDialog("Lütfen bir mesaj giriniz.");
        
        //JOptionPane ile kullanıcıya bilgi veriyoruz.
        JOptionPane.showMessageDialog(null, mesaj);
    }
    
}
