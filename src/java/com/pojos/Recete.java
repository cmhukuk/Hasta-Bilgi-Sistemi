package com.pojos;
// Generated 01.Ara.2014 13:53:21 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Recete generated by hbm2java
 */
public class Recete  implements java.io.Serializable {


     private int receteid;
     private Birey birey;
     private Doktor doktor;
     private Eczane eczane;
     private Hbirim hbirim;
     private IlacBilgi ilacBilgi;
     private Date tarih;

    public Recete() {
    }

	
    public Recete(int receteid) {
        this.receteid = receteid;
    }
    public Recete(int receteid, Birey birey, Doktor doktor, Eczane eczane, Hbirim hbirim, IlacBilgi ilacBilgi, Date tarih) {
       this.receteid = receteid;
       this.birey = birey;
       this.doktor = doktor;
       this.eczane = eczane;
       this.hbirim = hbirim;
       this.ilacBilgi = ilacBilgi;
       this.tarih = tarih;
    }
   
    public int getReceteid() {
        return this.receteid;
    }
    
    public void setReceteid(int receteid) {
        this.receteid = receteid;
    }
    public Birey getBirey() {
        return this.birey;
    }
    
    public void setBirey(Birey birey) {
        this.birey = birey;
    }
    public Doktor getDoktor() {
        return this.doktor;
    }
    
    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }
    public Eczane getEczane() {
        return this.eczane;
    }
    
    public void setEczane(Eczane eczane) {
        this.eczane = eczane;
    }
    public Hbirim getHbirim() {
        return this.hbirim;
    }
    
    public void setHbirim(Hbirim hbirim) {
        this.hbirim = hbirim;
    }
    public IlacBilgi getIlacBilgi() {
        return this.ilacBilgi;
    }
    
    public void setIlacBilgi(IlacBilgi ilacBilgi) {
        this.ilacBilgi = ilacBilgi;
    }
    public Date getTarih() {
        return this.tarih;
    }
    
    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }




}


