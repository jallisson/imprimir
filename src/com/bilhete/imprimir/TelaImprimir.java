/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bilhete.imprimir;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author jallisson
 */
public final class TelaImprimir extends javax.swing.JFrame {

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

    /**
     * Creates new form TelaImprimir
     */
    //TrayIconDemo t = new TrayIconDemo();
    TrayClass t = new TrayClass();
    
    public TelaImprimir() {
        initComponents();
       try {
            //executaTudo();
            excluiArquivo();
        } catch (InterruptedException ex) {
            Logger.getLogger(TelaImprimir.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public void ImprimirBilhete(List lista) {

        String caminhoRelJasper = "/com/bilhete/imprimir/bilheteteste.jasper";

        InputStream relJasper = getClass().getResourceAsStream(caminhoRelJasper);
        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lista);

        Map parametros = new HashMap();
        JasperPrint impressao = null;
        //parametros.put("CAMINHO_IMAGEM", System.getProperty("user.dir") + "\\imagem\\logocidade.jpg");
    
        try {
            //parametros.put("CAMINHO_IMAGEM", System.getProperty("user.dir") + "\\imprimir\\barra.jpeg");
            //*para funcionario abrir os relatorio dentro do pacote tem q configurar o parametros no ireport como InputScream
            InputStream caminhoImagemBrasao = getClass().getResourceAsStream("/com/bilhete/imagens/barra.jpeg");
            parametros.put("CAMINHO_IMAGEM", caminhoImagemBrasao);
            InputStream is = getClass().getResourceAsStream("/com/bilhete/imprimir/bilheteteste.jasper");
            impressao = JasperFillManager.fillReport(is, parametros, ds);
            //impressao = JasperFillManager.fillReport(relJasper, parametros, ds);
            //JasperViewer viewer = new JasperViewer(impressao, true);
            //*aparece o relatorio na tela
            //*JasperViewer.viewReport(impressao, false);
            //viewer.setVisible(true);
            //manda direto pra impressora padrao
            JasperPrintManager.printPage(impressao, 0, false);

        } catch (JRException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e, "Erro Ireport", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private List registraBilhete() {

        List lista = new ArrayList();
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
    
    public void excluiArquivo() throws InterruptedException{
        Path destination = Paths.get("C:\\dist\\teste.txt");
        int i = 0;
               /* if (destination.toFile().exists()) {
                    executaTudo();
                    destination.toFile().delete();
                }*/
             while (i != 1 ) {
                   if(destination.toFile().exists()){
                       executaTudo();
                       destination.toFile().delete();
                   }
                   new Thread().sleep(5000);  
                    i=0;
                }
        
    }
    
    public void executaTudo(){
         try {
            lerArquivo4();
            List dados = registraBilhete();
            ImprimirBilhete(dados);
            //excluiArquivo();
            //System.exit(0);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaImprimir.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex, "Erro Leitura do txt", JOptionPane.INFORMATION_MESSAGE);
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bilhetagem");
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bilhete/imagens/PRINTER_128x128.png"))); // NOI18N
        jButton1.setText("IMPRIMIR ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Imprimir", jButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.ipady = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 67, 27, 56);
        getContentPane().add(jTabbedPane1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            lerArquivo4();
            /*String origemt = origem;
            String destinot = destino;
            String data_viagemt = data_viagem;
            String hora_viagemt = hora_viagem;
            String poltronat = poltrona;
            String tarifat = tarifa;
            String passageirot = passageiro;
            String documentot = documento;
            String data_vendat = data_venda;
            String hora_vendat = hora_venda;
            String num_sistemat = num_sistema;
            String icmst = icms;*/
            List dados = registraBilhete();
            ImprimirBilhete(dados);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaImprimir.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex, "Erro Leitura do txt", JOptionPane.INFORMATION_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaImprimir.class.getName()).log(Level.SEVERE, null, ex);
        }
          UIManager.put("swing.boldMetal", Boolean.FALSE);
        /* try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
        javax.swing.UIManager.setLookAndFeel(info.getClassName());
        break;
        }
        }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(TelaImprimir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaImprimir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaImprimir().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
