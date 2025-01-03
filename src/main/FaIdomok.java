/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import classes.Gomb;
import classes.Hasab;
import classes.Idom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Klau
 */
public class FaIdomok {

    
    private List<Idom>idomok;

    public FaIdomok() {
        this.idomok = new ArrayList<>();
    }
    
    public double idomoksulya(){
        
        double osszSuly = 0;
        
        for (Idom idom : idomok) {
            osszSuly += idom.suly(idom.terfogat());
            
            
        }
        return osszSuly;
    }
    
    public double gombokSulya(){
        double osszSuly = 0;
        
        for (Idom idom : idomok) {
            if(idom instanceof Gomb){
                osszSuly += idom.suly(idom.terfogat());
                
            }
            
        }
        return osszSuly;
        
        
    }
    
    public void minMaxTerfogat(){
        Idom legkisebb = null;
        Idom legnagyobb = null;
        
        for (Idom idom : idomok) {
            if(legkisebb == null || idom.terfogat()< legkisebb.terfogat()){
                legkisebb = idom;
            }  if(legnagyobb == null || idom.terfogat()> legnagyobb.terfogat()){
                legnagyobb = idom;
            }
            
        }
        
        System.out.println("A legkisebb térfogatú idom: " + legkisebb);
        System.out.println("A legnagyobb térfogatú idom: " + legnagyobb);

        
        
        
    }
    
    public Set<Double> kulonbozoSugaruGombok(){
        
        Set<Double> sugarak = new HashSet<>();
        
        for (Idom idom : idomok) {
            if(idom instanceof Gomb){
                sugarak.add(((Gomb) idom).getSugar());
            }
            
        }
        
        return new HashSet<>(sugarak);
        
    }
    
    public void run(){
        
        idomok.add(new Gomb(2.3));
        idomok.add(new Gomb(2.5));
        idomok.add(new Gomb(3.3));
        idomok.add(new Hasab(2.1, 3.1, 4.4));
        idomok.add(new Hasab(4.4, 1.5, 4.0));
        idomok.add(new Hasab(2.2, 3.2, 4.2));
        
        System.out.println("Idomok súlya: " + idomoksulya() );
        System.out.println("Gömbök súlya: " + gombokSulya());
        minMaxTerfogat();
        System.out.println("Különböző sugarú gömbök: " + kulonbozoSugaruGombok());
        
       
    }
    
    
    
    
    public static void main(String[] args) {
        FaIdomok idomok = new FaIdomok();
        idomok.run();
    }
    
}
