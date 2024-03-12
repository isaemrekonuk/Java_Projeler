
package com.isaemrekonuk;


public class Bilgisayar
{
    //Değişkenlerimizi tanımlıyoruz.
    private Monitor monitor;
    private Kasa kasa;
    private Anakart anakart;

    //Yapıcı metodumuzu yazıyoruz.
    public Bilgisayar(Monitor monitor, Kasa kasa, Anakart anakart) {
        this.monitor = monitor;
        this.kasa = kasa;
        this.anakart = anakart;
    }

    //getter ve setter metdolarımız
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }
    
    
    
}
