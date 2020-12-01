/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author parrarodriguez.manue
 */
public class JavaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Processo T1 = new Processo("t1");
        Processo T2 = new Processo("t2");
        T1.start();
        
        try {
            T1.sleep(5000);
            T1.stop();
        } catch (InterruptedException interruption) {
            Logger.getLogger(JavaThread.class.getName()).log(Level.SEVERE, null, interruption);
        }
        //ProcessoRunnable p1 = new ProcessoRunnable("p1");
        //Thread t1 = new Thread(p1);
        //t1.start();
    }
    
}
