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
public class Sportello implements Runnable{
    Conto conto;
    public Sportello(Conto conto) {
        this.conto = conto;
    }
    
    @Override
    public void run(){
    }
    
    public void versa(int somma){
        conto.versa(somma);
        System.out.println("Conto : "+conto.saldo());
    }
}
