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
import model.dados.RepositorioCliente;
import model.negocio.beans.Cliente;

/**
 *
 * @author Kira
 */
public class TelaAtualizar extends javax.swing.JFrame {
   ConexaoBD conex = new ConexaoBD();
   RepositorioCliente control = new RepositorioCliente();
   Cliente cliente = new Cliente();
    private Timer timer;
   
    public TelaAtualizar() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btSairAtualizarCliente = new javax.swing.JButton();
        btAtualizarCliente = new javax.swing.JButton();
        btVoltarAtualizarCliente = new javax.swing.JButton();
        btPesquisarCpf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfCpf = new javax.swing.JTextField();
        tfPesquisarCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbSegundos = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbMinutos = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbHoras = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        btSairAtualizarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btSairAtualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Sair.png"))); // NOI18N
        btSairAtualizarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSairAtualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSairAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairAtualizarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btSairAtualizarCliente);
        btSairAtualizarCliente.setBounds(500, 260, 60, 60);

        btAtualizarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btAtualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/AdicionarContato.png"))); // NOI18N
        btAtualizarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAtualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btAtualizarCliente);
        btAtualizarCliente.setBounds(250, 260, 60, 60);

        btVoltarAtualizarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btVoltarAtualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/back.png"))); // NOI18N
        btVoltarAtualizarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVoltarAtualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltarAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarAtualizarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btVoltarAtualizarCliente);
        btVoltarAtualizarCliente.setBounds(10, 260, 60, 60);

        btPesquisarCpf.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarCpf.setText("PESQUISAR CPF");
        btPesquisarCpf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btPesquisarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarCpfActionPerformed(evt);
            }
        });
        jPanel1.add(btPesquisarCpf);
        btPesquisarCpf.setBounds(400, 60, 130, 19);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EMAIL");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 190, 70, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENDERECO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 110, 80, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 70, 50, 15);

        tfEndereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEnderecoKeyTyped(evt);
            }
        });
        jPanel1.add(tfEndereco);
        tfEndereco.setBounds(120, 100, 220, 30);

        tfEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tfEmail);
        tfEmail.setBounds(120, 180, 220, 30);

        tfCpf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCpfKeyTyped(evt);
            }
        });
        jPanel1.add(tfCpf);
        tfCpf.setBounds(120, 60, 220, 30);

        tfPesquisarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarClienteActionPerformed(evt);
            }
        });
        tfPesquisarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPesquisarClienteKeyTyped(evt);
            }
        });
        jPanel1.add(tfPesquisarCliente);
        tfPesquisarCliente.setBounds(380, 100, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TELEFONE");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 140, 80, 20);

        tfTelefone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefoneKeyTyped(evt);
            }
        });
        jPanel1.add(tfTelefone);
        tfTelefone.setBounds(120, 140, 220, 30);

        tfNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeKeyTyped(evt);
            }
        });
        jPanel1.add(tfNome);
        tfNome.setBounds(120, 20, 220, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOME");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 30, 60, 10);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        lbSegundos.setText("00");
        jPanel3.add(lbSegundos);
        lbSegundos.setBounds(70, 0, 30, 30);

        jLabel9.setText(":");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(60, 0, 10, 30);

        lbMinutos.setText("00");
        jPanel3.add(lbMinutos);
        lbMinutos.setBounds(40, 0, 40, 30);

        jLabel10.setText(":");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(30, 0, 10, 30);

        lbHoras.setText("00");
        jPanel3.add(lbHoras);
        lbHoras.setBounds(10, 0, 30, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(420, 10, 90, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/papel-de-parede-3d-7.jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 570, 330);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 40, 570, 330);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ATUALIZAR CLIENTE");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 10, 160, 21);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/thumb2-abstract-background-black-wave-stock-wallpaper.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 620, 390);

        setSize(new java.awt.Dimension(634, 427));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairAtualizarClienteActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairAtualizarClienteActionPerformed

    private void btVoltarAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarAtualizarClienteActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarAtualizarClienteActionPerformed

    private void btAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarClienteActionPerformed
         
     if(tfPesquisarCliente.getText().equals("")){
        JOptionPane.showMessageDialog(null,"O CAMPO CPF ESTÁ VAZIO");  
     return;
     }
        
        cliente.setCpf(tfCpf.getText());
        cliente.setNome(tfNome.getText());
        cliente.setEndereco(tfEndereco.getText());
        cliente.setTelefone(tfTelefone.getText());
        cliente.setEmail(tfEmail.getText());
        control.editar(cliente);
        tfNome.setText(" ");
        tfCpf.setText(" ");
        tfEndereco.setText(" ");
        tfTelefone.setText(" ");
        tfEmail.setText(" ");
        tfPesquisarCliente.setText("");
     
                                    
    }//GEN-LAST:event_btAtualizarClienteActionPerformed

    private void btPesquisarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarCpfActionPerformed
        if(tfPesquisarCliente.getText().equals("")){
         JOptionPane.showMessageDialog(null,"O CAMPO PESQUISAR ESTÁ VAZIO !!!");
         return;
        }
        
        cliente.setPesquisa(tfPesquisarCliente.getText());
        Cliente model = control.buscar(cliente);
        tfNome.setText(model.getNome());
        tfCpf.setText(model.getCpf());
        tfEndereco.setText(model.getEndereco());
        tfTelefone.setText(model.getTelefone());
        tfEmail.setText(model.getEmail());

    }//GEN-LAST:event_btPesquisarCpfActionPerformed

    private void tfPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarClienteActionPerformed
        
    }//GEN-LAST:event_tfPesquisarClienteActionPerformed

    private void tfCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCpfKeyTyped
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_tfCpfKeyTyped

    private void tfTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefoneKeyTyped
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_tfTelefoneKeyTyped

    private void tfPesquisarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarClienteKeyTyped
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_tfPesquisarClienteKeyTyped

    private void tfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c!=(char)KeyEvent.VK_BACK_SPACE) && (c!=(char)KeyEvent.VK_SPACE)){ 
            evt.consume();
            JOptionPane.showMessageDialog(null,"ADMITE APENAS TEXTO","", JOptionPane.INFORMATION_MESSAGE);
        }    }//GEN-LAST:event_tfNomeKeyTyped

    private void tfEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEnderecoKeyTyped

    }//GEN-LAST:event_tfEnderecoKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer = new Timer(1000,new TelaAtualizar.cron());
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
            java.util.logging.Logger.getLogger(TelaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaAtualizar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarCliente;
    private javax.swing.JButton btPesquisarCpf;
    private javax.swing.JButton btSairAtualizarCliente;
    private javax.swing.JButton btVoltarAtualizarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbHoras;
    private javax.swing.JLabel lbMinutos;
    private javax.swing.JLabel lbSegundos;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisarCliente;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
