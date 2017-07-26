/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kira
 */
public class ConexaoBD {
    
   public Statement stm;     //REALIZA PESQUISA
   public ResultSet rs;      //ARMAZENA O RESULTADO DA PESQUISA
   private String driver = "org.postgresql.Driver";    //IDENTIFICA O SERVIÇO
   private String caminho = "jdbc:postgresql://localhost:5432/projetoGerenciamento";   //DIZ QUAL O CAMINHO
   private String usuario = "postgres";   //USUARIO DO BANCO
   private String senha = "info123456789";     //SENHA DO BANCO
   public Connection con;   //RESPONSÁVEL PELA CONEXÃO
   
   public void conexao(){ //REALIZA A CONEXÃO COM O BANCO DE DADOS
     
       try {
            System.setProperty("jdbc.Drivers", driver); //SETA O DRIVE DE CONEXÃO
           con=DriverManager.getConnection(caminho, usuario, senha);
           //JOptionPane.showMessageDialog(null, "CONEXÃO EFETUADA!!!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "\n ERRO DE CONEXÃO!!! \n" + ex.getMessage());
       }
   }
   
   public void executaSql(String sql){
       try {
           stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY); //PERCORRE O BANCO TANTO DE CIMA PARA BAIXO COMO DE BAIXO PARA CIMA
           rs = stm.executeQuery(sql);
       } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "\n ERRO NA EXECUÇÃO DO SQL!!! \n" + ex.getMessage());
       }
   }
   
   public void desconectar(){  //REALIZA O FECHAMENTO DO BANCO DE DADOS
       try {
           con.close();
          // JOptionPane.showMessageDialog(null, "DESCONECTADO COM SUCESOO!!! \n");
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "ERRO AO DESCONECTAR!!! \n" + ex.getMessage());
       }
   }
    
}
