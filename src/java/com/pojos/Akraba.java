package com.pojos;
// Generated 01.Ara.2014 13:53:21 by Hibernate Tools 4.3.1



/**
 * Akraba generated by hbm2java
 */
public class Akraba  implements java.io.Serializable {


     private int akrabaid;
     private Aile aile;
     private Birey birey;
     private Durum durum;
     private Konum konum;

    public Akraba() {
    }

	
    public Akraba(int akrabaid) {
        this.akrabaid = akrabaid;
    }
    public Akraba(int akrabaid, Aile aile, Birey birey, Durum durum, Konum konum) {
       this.akrabaid = akrabaid;
       this.aile = aile;
       this.birey = birey;
       this.durum = durum;
       this.konum = konum;
    }
   
    public int getAkrabaid() {
        return this.akrabaid;
    }
    
    public void setAkrabaid(int akrabaid) {
        this.akrabaid = akrabaid;
    }
    public Aile getAile() {
        return this.aile;
    }
    
    public void setAile(Aile aile) {
        this.aile = aile;
    }
    public Birey getBirey() {
        return this.birey;
    }
    
    public void setBirey(Birey birey) {
        this.birey = birey;
    }
    public Durum getDurum() {
        return this.durum;
    }
    
    public void setDurum(Durum durum) {
        this.durum = durum;
    }
    public Konum getKonum() {
        return this.konum;
    }
    
    public void setKonum(Konum konum) {
        this.konum = konum;
    }




}

