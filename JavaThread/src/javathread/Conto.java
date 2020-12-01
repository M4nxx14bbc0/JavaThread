/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author parrarodriguez.manue
 */
public class Conto {
    private int totale;
    private final int tasse = 100;
    
    public Conto(int totale){
        this.totale = totale;
    }
    
    synchronized void versa(int importo){
        totale = totale + importo - tasse;
        System.out.println("Conto : "+ totale);
    }
    
    synchronized int saldo(){
        return totale;
    }
            
}
