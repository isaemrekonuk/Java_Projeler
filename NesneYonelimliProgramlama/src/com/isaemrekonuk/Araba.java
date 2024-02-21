
package com.isaemrekonuk;

public class Araba  //Sınıfmızı oluşturduk.
{
    //Değişkenlerimizi tanımlıyoruz.
    public String renk;
    public int kapiSayisi;
    public String marka;
    private String model;
    
    
    public void setModel (String model) //Parametreli bir metod oluşturuyoruz.
    {
        //this anahtar kelimesi, class içerisinde tanımlı olan ve parametre olarak gelecek değeri tutan değişkenlerin isimlerinin aynı olduğu durumda ayırt edilmesi için kullanıyoruz.
        //Burada parametre olarak marka yerine başka bir isim kullansaydık this anahtar kelimesini kullanmamıza gerek olmayacaktı. (Örneğin; marka (Araba classı içerisinde tanımlı değişken) = markaa (parametre olarak tutulan değişken))
        this.model = model; //Parametre olarak gelen marka değerini bu sınıf içerisinde tanımlı olan marka değerine atıyoruz.
    }
    
    public String getModel () //Parametresiz bir metod oluşturuyoruz.
    {
        return this.model; //Geriye bu sınıf içerisinde tanımlı olan marka değişkenini döndürüyoruz.
    }
}
