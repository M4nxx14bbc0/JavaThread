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
public class ProcessoRunnable implements Runnable {
    private String s;
    
    public ProcessoRunnable(String s) {
        this.s = s;
    }
    
    @Override
    public void run(){
        for (;;) {
            System.out.println(s);
        }
    }
}
