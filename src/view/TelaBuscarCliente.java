/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import conexao.ConexaoBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.JTableHeader;
import model.dados.RepositorioCliente;
import model.negocio.beans.Cliente;


/**
 *
 * @author Kira
 */
public class TelaBuscarCliente extends javax.swing.JFrame {

    ConexaoBD conex = new ConexaoBD();
    RepositorioCliente control = new RepositorioCliente();
    Cliente cliente = new Cliente();
    private JTableHeader tableHeader;
    private Timer timer;
   
  
  

    /**
     * Creates new form TelaBuscarCliente
     */
    public TelaBuscarCliente() {
        initComponents();
    }
     public class cron implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            GregorianCalendar tempo = new GregorianCalendar();
            int hora,minutos,segundos;
            hora=tempo.get(Calendar.HOUR);
            minutos=tempo.get(Calendar.MINUTE);
            segundos=tempo.get(Calendar.SECOND);
            
            lbHoras.setText(String.valueOf(hora));
            lbMinutos.setText(String.valueOf(minutos));
            lbSegundos.setText(String.valueOf(segundos));
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

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btVoltarBuscarCliente = new javax.swing.JButton();
        btPesquisaCliente = new javax.swing.JButton();
        btSairBuscarCliente = new javax.swing.JButton();
        tfPesquisaCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtEndereco = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jtCpf = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbSegundos = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbMinutos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbHoras = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PESQUISAR CLIENTE");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 10, 130, 20);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF DO CLIENTE");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(220, 10, 130, 21);

        btVoltarBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btVoltarBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/back.png"))); // NOI18N
        btVoltarBuscarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVoltarBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltarBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarBuscarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btVoltarBuscarCliente);
        btVoltarBuscarCliente.setBounds(30, 240, 70, 70);

        btPesquisaCliente.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/search-employee-icon-19449707.jpg"))); // NOI18N
        btPesquisaCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btPesquisaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisaCliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                btPesquisaClienteAncestorRemoved(evt);
            }
        });
        btPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btPesquisaCliente);
        btPesquisaCliente.setBounds(260, 230, 80, 80);

        btSairBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btSairBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Sair.png"))); // NOI18N
        btSairBuscarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSairBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSairBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairBuscarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btSairBuscarCliente);
        btSairBuscarCliente.setBounds(480, 240, 70, 70);

        tfPesquisaCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfPesquisaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisaClienteActionPerformed(evt);
            }
        });
        tfPesquisaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPesquisaClienteKeyTyped(evt);
            }
        });
        jPanel2.add(tfPesquisaCliente);
        tfPesquisaCliente.setBounds(150, 40, 250, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EMAIL");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(300, 140, 40, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 130, 60, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TELEFONE");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 160, 80, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOME");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 90, 40, 14);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ENDEREÇO");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(300, 90, 80, 14);

        jtEndereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEnderecoActionPerformed(evt);
            }
        });
        jtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtEnderecoKeyTyped(evt);
            }
        });
        jPanel2.add(jtEndereco);
        jtEndereco.setBounds(370, 80, 190, 30);

        jtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });
        jPanel2.add(jtEmail);
        jtEmail.setBounds(370, 130, 190, 30);

        jtTelefone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefoneActionPerformed(evt);
            }
        });
        jtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefoneKeyTyped(evt);
            }
        });
        jPanel2.add(jtTelefone);
        jtTelefone.setBounds(100, 160, 190, 30);

        jtCpf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCpfActionPerformed(evt);
            }
        });
        jtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCpfKeyTyped(evt);
            }
        });
        jPanel2.add(jtCpf);
        jtCpf.setBounds(100, 120, 190, 30);

        jtNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });
        jtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNomeKeyTyped(evt);
            }
        });
        jPanel2.add(jtNome);
        jtNome.setBounds(100, 80, 190, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        lbSegundos.setText("00");
        jPanel1.add(lbSegundos);
        lbSegundos.setBounds(70, 0, 30, 30);

        jLabel10.setText(":");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 0, 10, 30);

        lbMinutos.setText("00");
        jPanel1.add(lbMinutos);
        lbMinutos.setBounds(40, 0, 40, 30);

        jLabel11.setText(":");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 0, 10, 30);

        lbHoras.setText("00");
        jPanel1.add(lbHoras);
        lbHoras.setBounds(10, 0, 30, 30);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(470, 10, 90, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/papel-de-parede-3d-7.jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 0, 570, 330);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 40, 570, 330);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/thumb2-abstract-background-black-wave-stock-wallpaper.jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -20, 830, 490);

        setSize(new java.awt.Dimension(642, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisaClienteActionPerformed

    private void btPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaClienteActionPerformed
        
        if(tfPesquisaCliente.getText().equals("")){
        JOptionPane.showMessageDialog(null,"O CAMPO CPF ESTÁ VAZIO");  
            return;
        }
        
        cliente.setPesquisa(tfPesquisaCliente.getText());
        Cliente model = control.buscar(cliente); //BUSCA O VALOR E SETA ABAIXO
        jtNome.setText(model.getNome());
        jtCpf.setText(model.getCpf());
        jtEndereco.setText(model.getEndereco());
        jtTelefone.setText(model.getTelefone());
        jtEmail.setText(model.getEmail());
       
    }//GEN-LAST:event_btPesquisaClienteActionPerformed

    private void btVoltarBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarBuscarClienteActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarBuscarClienteActionPerformed

    private void btSairBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairBuscarClienteActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairBuscarClienteActionPerformed

    private void jtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEnderecoActionPerformed

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed

    private void jtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefoneActionPerformed

    private void jtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCpfActionPerformed

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    private void btPesquisaClienteAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btPesquisaClienteAncestorRemoved
         
    }//GEN-LAST:event_btPesquisaClienteAncestorRemoved

    private void tfPesquisaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaClienteKeyTyped
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_tfPesquisaClienteKeyTyped

    private void jtCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCpfKeyTyped
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jtCpfKeyTyped

    private void jtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefoneKeyTyped
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jtTelefoneKeyTyped

    private void jtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c!=(char)KeyEvent.VK_BACK_SPACE) && (c!=(char)KeyEvent.VK_SPACE)){ 
            evt.consume();
            JOptionPane.showMessageDialog(null,"ADMITE APENAS TEXTO","", JOptionPane.INFORMATION_MESSAGE);
        }    }//GEN-LAST:event_jtNomeKeyTyped

    private void jtEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEnderecoKeyTyped

    }//GEN-LAST:event_jtEnderecoKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer = new Timer(1000,new TelaBuscarCliente.cron());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaBuscarCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisaCliente;
    private javax.swing.JButton btSairBuscarCliente;
    private javax.swing.JButton btVoltarBuscarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtCpf;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtTelefone;
    private javax.swing.JLabel lbHoras;
    private javax.swing.JLabel lbMinutos;
    private javax.swing.JLabel lbSegundos;
    private javax.swing.JTextField tfPesquisaCliente;
    // End of variables declaration//GEN-END:variables
}
