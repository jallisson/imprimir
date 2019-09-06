/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.bilhete.imprimir;

/*
 * TrayIconDemo.java
 */
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.HashPrintServiceAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.PrinterName;
import javax.swing.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;

public final class ExecutaImpressao {

    private String origem;
    private String destino;
    private String data_viagem;
    private String hora_viagem;
    private String servico;
    private String poltrona;
    private String plataforma;
    private String prefixo;
    private String tipo;
    private String linha;
    private String tarifa;
    private String taxa;
    private String valorTotal;
    private String desconto;
    private String valorApagar;
    private String chaveAcesso;
    private String passageiro;
    private String documento;
    private String data_venda;
    private String hora_venda;
    private String num_sistema;
    private String tipoBpe;
    private String icms;
    
    //TrayIconDemo t = new TrayIconDemo();
    //Impressora i = new Impressora();

    public ExecutaImpressao() {
        //createAndShowGUI();
        //executaTudo();
        //metodoTeste();
        piscarIcone1();
        excluiArquivo();

    }

    public static void main(String[] args) {
        // Use an appropriate Look and Feel 
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        //Schedule a job for the event-dispatching thread:
        //adding TrayIcon.
        javax.swing.SwingUtilities.invokeLater(() -> new ExecutaImpressao());
        /* SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
                
            }
        });*/
    }

    private void piscarIcone1() {
         //Check the SystemTray support
        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }
        final PopupMenu popup = new PopupMenu();
        TrayIcon trayIcon
                = new TrayIcon(createImage("/com/bilhete/imagens/testImp.gif", "tray icon"));
        
               
        
        final SystemTray tray = SystemTray.getSystemTray();

         try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
            return;
        }

        trayIcon.setImageAutoSize(true);
        
    }

    private void lerArquivo4() throws FileNotFoundException {
        try ( //https://blog.caelum.com.br/lendo-arquivos-texto-em-java/
                Scanner scanner = new Scanner(new InputStreamReader(
                        new FileInputStream("C:/dist/teste.txt"), Charset.forName("ISO-8859-1")))
                        .useDelimiter("\\n")) {
                    while (scanner.hasNext()) {
                        String pulo1 = scanner.nextLine();
                        origem = scanner.nextLine();
                        String pulo2 = scanner.nextLine();
                        destino = scanner.nextLine();
                        String pulo3 = scanner.nextLine();
                        data_viagem = scanner.nextLine();
                        String pulo4 = scanner.nextLine();
                        hora_viagem = scanner.nextLine();
                        String pulo5 = scanner.nextLine();
                        servico = scanner.nextLine();
                        String pulo6 = scanner.nextLine();
                        poltrona = scanner.nextLine();
                        String pulo7 = scanner.nextLine();
                        plataforma = scanner.nextLine();
                        String pulo8 = scanner.nextLine();
                        prefixo = scanner.nextLine();
                        String pulo9 = scanner.nextLine();
                        tipo = scanner.nextLine();
                        String pulo10 = scanner.nextLine();
                        linha = scanner.nextLine();
                        String pulo11 = scanner.nextLine();
                        tarifa = scanner.nextLine();
                        String pulo12 = scanner.nextLine();
                        taxa = scanner.nextLine();
                        String pulo13 = scanner.nextLine();
                        valorTotal = scanner.nextLine();
                        String pulo14 = scanner.nextLine();
                        desconto = scanner.nextLine();
                        String pulo15 = scanner.nextLine();
                        valorApagar = scanner.nextLine();
                        String pulo16 = scanner.nextLine();
                        chaveAcesso = scanner.nextLine();
                        String pulo17 = scanner.nextLine();
                        passageiro = scanner.nextLine();
                        String pulo18 = scanner.nextLine();
                        documento = scanner.nextLine();
                        String pulo19 = scanner.nextLine();
                        data_venda = scanner.nextLine();
                        String pulo20 = scanner.nextLine();
                        hora_venda = scanner.nextLine();
                        String pulo21 = scanner.nextLine();
                        num_sistema = scanner.nextLine();
                        String pulo22 = scanner.nextLine();
                        tipoBpe = scanner.nextLine();
                        String pulo23 = scanner.nextLine();
                        icms = scanner.nextLine();
                        System.out.println(origem);
                        System.out.println(destino);
                        System.out.println(data_viagem);
                        System.out.println(hora_viagem);
                        System.out.println(servico);
                        System.out.println(poltrona);
                        System.out.println(plataforma);
                        System.out.println(prefixo);
                        System.out.println(tipo);
                        System.out.println(linha);
                        System.out.println(tarifa);
                        System.out.println(taxa);
                        System.out.println(valorTotal);
                        System.out.println(desconto);
                        System.out.println(valorApagar);
                        System.out.println(chaveAcesso);
                        System.out.println(passageiro);
                        System.out.println(documento);
                        System.out.println(data_venda);
                        System.out.println(hora_venda);
                        System.out.println(num_sistema);
                        System.out.println(tipoBpe);
                        System.out.println(icms);
                        //System.out.println(numero);
                        //JOptionPane.showMessageDialog(this, nota, "Linha", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    }
                }
    }
    
    private void PrintReportToPrinter(JasperPrint jp) throws JRException {
    // TODO Auto-generated method stub
    PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
    // printRequestAttributeSet.add(MediaSizeName.ISO_A4); //setting page size
    printRequestAttributeSet.add(new Copies(1));

    PrinterName printerName = new PrinterName("XP-80C", null); //gets printer 

    PrintServiceAttributeSet printServiceAttributeSet = new HashPrintServiceAttributeSet();
    printServiceAttributeSet.add(printerName);

    JRPrintServiceExporter exporter = new JRPrintServiceExporter();

    exporter.setParameter(JRExporterParameter.JASPER_PRINT, jp);
    exporter.setParameter(JRPrintServiceExporterParameter.PRINT_REQUEST_ATTRIBUTE_SET, printRequestAttributeSet);
    exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, printServiceAttributeSet);
    exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
    exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, Boolean.FALSE);
    exporter.exportReport();
}

    public void ImprimirBilhete(java.util.List lista) {

        /*String caminhoRelJasper = "/com/bilhete/relatorio/bilheteteste.jasper";

        InputStream relJasper = getClass().getResourceAsStream(caminhoRelJasper);*/
        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lista);

        Map parametros = new HashMap();
        JasperPrint impressao = null;
        //parametros.put("CAMINHO_IMAGEM", System.getProperty("user.dir") + "\\imagem\\logocidade.jpg");

        try {
            //parametros.put("CAMINHO_IMAGEM", System.getProperty("user.dir") + "\\imprimir\\barra.jpeg");
            //*para funcionario abrir os relatorio dentro do pacote tem q configurar o parametros no ireport como InputScream
            InputStream caminhoImagemBrasao = getClass().getResourceAsStream("/com/bilhete/imagens/barra.jpeg");
            parametros.put("CAMINHO_IMAGEM", caminhoImagemBrasao);
            InputStream is = getClass().getResourceAsStream("/com/bilhete/relatorio/bilheteteste.jasper");
            impressao = JasperFillManager.fillReport(is, parametros, ds);
            //impressao = JasperFillManager.fillReport(relJasper, parametros, ds);
            //JasperViewer viewer = new JasperViewer(impressao, true);
            //*aparece o relatorio na tela
            //*JasperViewer.viewReport(impressao, false);
            //viewer.setVisible(true);
            
            //manda direto pra impressora padrao
            //JasperPrintManager.printPage(impressao, 0, false);
            PrintReportToPrinter(impressao);//call method
            

        } catch (JRException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, "Erro Ireport", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private java.util.List registraBilhete() {

        java.util.List lista = new ArrayList();
        Bilhete bilhete = new Bilhete();

        bilhete.setOrigem(origem);
        bilhete.setDestino(destino);
        bilhete.setData_viagem(data_viagem);
        bilhete.setHora_viagem(hora_viagem);
        bilhete.setServico(servico);
        bilhete.setPoltrona(poltrona);
        bilhete.setPlataforma(plataforma);
        bilhete.setPrefixo(prefixo);
        bilhete.setTipo(tipo);
        bilhete.setLinha(linha);
        bilhete.setTarifa(tarifa);
        bilhete.setTaxa(taxa);
        bilhete.setValorTotal(valorTotal);
        bilhete.setDesconto(desconto);
        bilhete.setValorApagar(valorApagar);
        bilhete.setChaveAcesso(chaveAcesso);
        bilhete.setPassageiro(passageiro);
        bilhete.setDocumento(documento);
        bilhete.setData_venda(data_venda);
        bilhete.setHora_venda(hora_venda);
        bilhete.setNum_sistema(num_sistema);
        bilhete.setTipoBpe(tipoBpe);
        bilhete.setIcms(icms);
        lista.add(bilhete);
        return lista;
    }

    public void excluiArquivo() {

        Path destination = Paths.get("C:\\dist\\teste.txt");
        //int i = 0;
        /* if (destination.toFile().exists()) {
                    executaTudo();
                    destination.toFile().delete();
                }*/

        while (true) {
           
            if (destination.toFile().exists()) {
                executaTudo();
                destination.toFile().delete();
            }
            try {
                new Thread().sleep(2000);
               

            } catch (InterruptedException ex) {
                Logger.getLogger(ExecutaImpressao.class.getName()).log(Level.SEVERE, null, ex);
            }

          //  i = 0;

        }

    }

    public void executaTudo() {
        try {
            lerArquivo4();
            java.util.List dados = registraBilhete();
            ImprimirBilhete(dados);
            //excluiArquivo();
            //System.exit(0);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaImprimir.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Erro Leitura do txt", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //é usado é para criar menuItem não funciona com repetição
    
    private void createAndShowGUI() {

        //Check the SystemTray support
        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }
        final PopupMenu popup = new PopupMenu();
        final TrayIcon trayIcon
                = new TrayIcon(createImage("/com/bilhete/imagens/bulb.gif", "tray icon"));
        final SystemTray tray = SystemTray.getSystemTray();

        // Create a popup menu components
        MenuItem aboutItem = new MenuItem("About");
        CheckboxMenuItem cb1 = new CheckboxMenuItem("Set auto size");
        CheckboxMenuItem cb2 = new CheckboxMenuItem("Set tooltip");
        Menu displayMenu = new Menu("Display");
        MenuItem errorItem = new MenuItem("Error");
        MenuItem warningItem = new MenuItem("Warning");
        MenuItem infoItem = new MenuItem("Info");
        MenuItem noneItem = new MenuItem("None");
        MenuItem exitItem = new MenuItem("Exit");

        //Add components to popup menu
        popup.add(aboutItem);
        popup.addSeparator();
        popup.add(cb1);
        popup.add(cb2);
        popup.addSeparator();
        popup.add(displayMenu);
        displayMenu.add(errorItem);
        displayMenu.add(warningItem);
        displayMenu.add(infoItem);
        displayMenu.add(noneItem);
        popup.add(exitItem);

        trayIcon.setPopupMenu(popup);

        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
            return;
        }

        trayIcon.setImageAutoSize(true);

        trayIcon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "This dialog box is run from System Tray");
            }
        });
        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "This dialog box is run from the About menu item");
            }
        });

        cb1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int cb1Id = e.getStateChange();
                if (cb1Id == ItemEvent.SELECTED) {
                    trayIcon.setImageAutoSize(true);
                } else {
                    trayIcon.setImageAutoSize(false);
                }
            }
        });

        cb2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int cb2Id = e.getStateChange();
                if (cb2Id == ItemEvent.SELECTED) {
                    trayIcon.setToolTip("Sun TrayIcon");
                } else {
                    trayIcon.setToolTip(null);
                }
            }
        });

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuItem item = (MenuItem) e.getSource();
                //TrayIcon.MessageType type = null;
                System.out.println(item.getLabel());
                if ("Error".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.ERROR;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is an error message", TrayIcon.MessageType.ERROR);

                } else if ("Warning".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.WARNING;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is a warning message", TrayIcon.MessageType.WARNING);

                } else if ("Info".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.INFO;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is an info message", TrayIcon.MessageType.INFO);

                } else if ("None".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.NONE;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is an ordinary message", TrayIcon.MessageType.NONE);
                }
            }
        };

        errorItem.addActionListener(listener);
        warningItem.addActionListener(listener);
        infoItem.addActionListener(listener);
        noneItem.addActionListener(listener);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tray.remove(trayIcon);
                System.exit(0);
            }
        });

    }
    
    //Obtain the image URL
    protected static Image createImage(String path, String description) {
        URL imageURL = ExecutaImpressao.class.getResource(path);

        if (imageURL == null) {
            System.err.println("Resource not found: " + path);
            return null;
        } else {
            return (new ImageIcon(imageURL, description)).getImage();
        }
    }

   
}
