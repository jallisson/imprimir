/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bilhete.imprimir;

import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author https://www.youtube.com/watch?v=ZdBCd-9vpT0
 * 
 */
public class TrayClass {

    static TrayIcon trayIcon;
    JPopupMenu jPopupMenu = new JPopupMenu();

    public TrayClass() {
        show();
    }

    public static void show() {
        if (!SystemTray.isSupported()){
         System.exit(0);
     }
     trayIcon = new TrayIcon(creatIcon("/com/bilhete/imagens/print_termica.png","Icon"));
     trayIcon.setToolTip("Sistema de Impressao Ativo SRVP\nBy Jallisson (99)99142-0419");
     final SystemTray tray = SystemTray.getSystemTray();
     
     final PopupMenu menu = new PopupMenu();
     
     MenuItem about = new MenuItem("About");
     MenuItem exit = new MenuItem("Exit");
     
     menu.add(about);
     menu.addSeparator();
     menu.add(exit);
     
     about.addActionListener((ActionEvent e) -> {
         JOptionPane.showMessageDialog(null, "Impressora Srvp v.1.0\nAuthor by: \nJallisson (99)99142-0419");
     });
          
     exit.addActionListener((ActionEvent e) -> {
         System.exit(0);
     });
     
     try{
         tray.add(trayIcon);
     }catch (Exception e){
         
     }
    }

    private void popupBtnTramitarViavelNaoViavel() {
        //cria os itens
        JMenuItem item1 = new JMenuItem("About");
        JMenuItem item2 = new JMenuItem("Exit");
        //cria o menu popup e acrescenta os itens

        jPopupMenu.add(item1);
        jPopupMenu.addSeparator();
        jPopupMenu.add(item2);

        //jPopupMenu.show(btnTramitar, 10, 10);
        //atribui uma ação para os itens
        item1.addActionListener((ActionEvent e) -> {
            //setSituacaoParecer("VIAVEL");
            JOptionPane.showMessageDialog(null, "Impressora Srvp v.1.0\nAuthor by: \nJallisson (99)99142-0419");
        });
        item2.addActionListener((ActionEvent e) -> {
            //JOptionPane.showMessageDialog(null, "Impressora Srvp v.1.0\nAuthor by: \nJallisson (99)99142-0419");
        });
    }

    protected static Image creatIcon(String path, String desc) {
        URL imageURL = TrayClass.class.getResource(path);
        return (new ImageIcon(imageURL, desc)).getImage();
    }
}
