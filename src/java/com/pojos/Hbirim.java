package com.pojos;
// Generated 01.Ara.2014 13:53:21 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Hbirim generated by hbm2java
 */
public class Hbirim  implements java.io.Serializable {


     private int hbid;
     private Birim birim;
     private Hastane hastane;
     private Set<Recete> recetes = new HashSet<Recete>(0);

    public Hbirim() {
    }

	
    public Hbirim(int hbid) {
        this.hbid = hbid;
    }
    public Hbirim(int hbid, Birim birim, Hastane hastane, Set<Recete> recetes) {
       this.hbid = hbid;
       this.birim = birim;
       this.hastane = hastane;
       this.recetes = recetes;
    }
   
    public int getHbid() {
        return this.hbid;
    }
    
    public void setHbid(int hbid) {
        this.hbid = hbid;
    }
    public Birim getBirim() {
        return this.birim;
    }
    
    public void setBirim(Birim birim) {
        this.birim = birim;
    }
    public Hastane getHastane() {
        return this.hastane;
    }
    
    public void setHastane(Hastane hastane) {
        this.hastane = hastane;
    }
    public Set<Recete> getRecetes() {
        return this.recetes;
    }
    
    public void setRecetes(Set<Recete> recetes) {
        this.recetes = recetes;
    }




}


