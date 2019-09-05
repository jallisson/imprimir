/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilhete.acessobd;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author T2Ti
 */
public class AcessoBD {

    Connection con;
    public Statement statement;
    public ResultSet resultset;

    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/vendas?user=root&password=root");//endereço aonde esta localizado o banco de dados
        } catch (SQLException ex) {
            Logger.getLogger(AcessoBD.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AcessoBD.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex);
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
    }
        return con;
    }
    
   public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AcessoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
