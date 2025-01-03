/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Klau
 */
public class Gomb extends Idom{
    
    private double sugar;

   
    public Gomb(double sugar) {
        this.sugar = sugar;
    }
    
    public double getSugar(){
        
        return this.sugar;
    }
    
    @Override
    public double terfogat(){//felülírjuk az ősosztály metódusát a gömbre vonatkozóképlettel
        return (4.0 / 3.0) * Math.PI * Math.pow(sugar, 3);
        
    }

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar + '}' + "térfogata: " + terfogat();
    }

 

   
    
    
    
    
}
