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
public class Processo {
    private String t1;
    
    public Processo(String printValue){
        t1 = printValue;
        run();
    }
    
    public void run(){
        for (;;) {
            System.out.println(t1);
        }
    }
}
