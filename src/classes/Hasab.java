/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Klau
 */
public class Hasab extends Idom {
    private double egyikOldalHossza;
    private double masikOldalHossza;
    private double magassag;

    public Hasab(double egyikOldalHossza, double masikOldalHossza, double magassag) {
        this.egyikOldalHossza = egyikOldalHossza;
        this.masikOldalHossza = masikOldalHossza;
        this.magassag = magassag;
    }
    
    public double alapTerulet(){
        
        double aTerulet = this.egyikOldalHossza * this.masikOldalHossza;
        return aTerulet;
    }
    
    @Override
    public double terfogat(){
        
        double terfogat = this.alapTerulet() * this.magassag;
        return terfogat;
        
    }

    @Override
    public String toString() {
        return "Hasab{" + "egyikOldalHossza=" + egyikOldalHossza + ", masikOldalHossza=" + masikOldalHossza + ", magassag=" + magassag + '}' + "térfogata: " + terfogat();
    }
    
    
    
}
