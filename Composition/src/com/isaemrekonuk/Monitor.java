
package com.isaemrekonuk;

public class Monitor 
{
    private String model;
    private String uretici;
    private String boyut;
    private Resolution resolution;

    //Yapıcı metodumuzu yazıyoruz.
    public Monitor(String model, String uretici, String boyut, Resolution resolution) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }
    
    //Parametresiz bir metod yazıyoruz.
    public void monitoruKapat()
    {
        System.out.println("Monitör Kapatılıyor..."); //Ekrana yazdırma işlemi yapılıyor.
    }
    
    //Getter ve setter metodlarımız

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
    
}
