/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bilhete.imprimir;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jallisson
 */
public class Imprimir {


    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            executaSpooler();
        } catch (InterruptedException ex) {
            Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public static void executaSpooler() throws InterruptedException{
       try {
           
	Process p = Runtime.getRuntime().exec("net stop spooler");
	p.waitFor();
        //Process d1 = Runtime.getRuntime().exec("del %systemroot%\\system32\\spool\\printers\\*.shd");
	//p.waitFor();
        //Process d2 = Runtime.getRuntime().exec("del %systemroot%\\system32\\spool\\printers\\*.spl");
	//p.waitFor();
	p = Runtime.getRuntime().exec("net start spooler");
	p.waitFor();
	JOptionPane.showMessageDialog(null,"Spooler Reiniciado com Sucesso");
} catch (IOException e) {
	JOptionPane.showMessageDialog(null,"Este serviço não pode ser Reiniciado");		
}
   }
}