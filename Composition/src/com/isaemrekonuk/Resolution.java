
package com.isaemrekonuk;

public class Resolution 
{
    private int en;
    private int boy;
    

    //Yapıcı metodumuzu yazıyoruz.
    public Resolution(int en, int boy) {
        this.en = en;
        this.boy = boy;
        
    }
    
    //Getter ve setter metodlarımız

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

}
