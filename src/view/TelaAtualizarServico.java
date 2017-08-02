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
import model.dados.RepositorioServico;
import model.negocio.beans.Servico;

/**
 *
 * @author Kira
 */
public class TelaAtualizarServico extends javax.swing.JFrame {
   ConexaoBD conex = new ConexaoBD();
   RepositorioServico control = new RepositorioServico();
   Servico servico = new Servico();
    private Timer timer;
    
    
    public TelaAtualizarServico() {
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

        jPanel1 = new javax.swing.JPanel();
        btPesquisarServico = new javax.swing.JButton();
        btVoltarAtualizarCliente = new javax.swing.JButton();
        btAtualizarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfSolicitador = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfData = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        tfHorario = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfPesquisarServico = new javax.swing.JTextField();
        btSairAtualizarCliente1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbSegundos = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbMinutos = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbHoras = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        btPesquisarServico.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarServico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btPesquisarServico.setText("ID DO SERVIÃ‡O");
        btPesquisarServico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btPesquisarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarServicoActionPerformed(evt);
            }
        });
        jPanel1.add(btPesquisarServico);
        btPesquisarServico.setBounds(470, 40, 120, 19);

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
        btVoltarAtualizarCliente.setBounds(390, 270, 60, 60);

        btAtualizarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btAtualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/SalvarServico.png"))); // NOI18N
        btAtualizarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAtualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btAtualizarCliente);
        btAtualizarCliente.setBounds(490, 270, 60, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENDEREÃ‡O");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 160, 80, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HORARIO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 320, 80, 10);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SOLICITADOR");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 120, 80, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOME");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 80, 40, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 40, 60, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TELEFONE");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 240, 80, 10);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DATA");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 280, 70, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("VALOR");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 200, 70, 10);

        tfValor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfValorKeyTyped(evt);
            }
        });
        jPanel1.add(tfValor);
        tfValor.setBounds(120, 190, 220, 30);

        tfEndereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEnderecoKeyTyped(evt);
            }
        });
        jPanel1.add(tfEndereco);
        tfEndereco.setBounds(120, 150, 220, 30);

        tfSolicitador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfSolicitador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSolicitadorKeyTyped(evt);
            }
        });
        jPanel1.add(tfSolicitador);
        tfSolicitador.setBounds(120, 110, 220, 30);

        tfNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeKeyTyped(evt);
            }
        });
        jPanel1.add(tfNome);
        tfNome.setBounds(120, 70, 220, 30);

        tfData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDataKeyTyped(evt);
            }
        });
        jPanel1.add(tfData);
        tfData.setBounds(120, 270, 220, 30);

        tfId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIdKeyTyped(evt);
            }
        });
        jPanel1.add(tfId);
        tfId.setBounds(120, 30, 220, 30);

        tfHorario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfHorarioKeyTyped(evt);
            }
        });
        jPanel1.add(tfHorario);
        tfHorario.setBounds(120, 310, 220, 30);

        tfTelefone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefoneKeyTyped(evt);
            }
        });
        jPanel1.add(tfTelefone);
        tfTelefone.setBounds(120, 230, 220, 30);

        tfPesquisarServico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfPesquisarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarServicoActionPerformed(evt);
            }
        });
        tfPesquisarServico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPesquisarServicoKeyTyped(evt);
            }
        });
        jPanel1.add(tfPesquisarServico);
        tfPesquisarServico.setBounds(430, 80, 200, 30);

        btSairAtualizarCliente1.setBackground(new java.awt.Color(255, 255, 255));
        btSairAtualizarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Sair.png"))); // NOI18N
        btSairAtualizarCliente1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSairAtualizarCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSairAtualizarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairAtualizarCliente1ActionPerformed(evt);
            }
        });
        jPanel1.add(btSairAtualizarCliente1);
        btSairAtualizarCliente1.setBounds(580, 270, 60, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        lbSegundos.setText("00");
        jPanel2.add(lbSegundos);
        lbSegundos.setBounds(70, 0, 30, 30);

        jLabel13.setText(":");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(60, 0, 10, 30);

        lbMinutos.setText("00");
        jPanel2.add(lbMinutos);
        lbMinutos.setBounds(40, 0, 40, 30);

        jLabel14.setText(":");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(30, 0, 10, 30);

        lbHoras.setText("00");
        jPanel2.add(lbHoras);
        lbHoras.setBounds(10, 0, 30, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(480, 170, 90, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/thumb2-abstract-background-black-wave-stock-wallpaper.jpg"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 670, 370);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 40, 670, 370);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ATUALIZAR SERVICO");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 7, 160, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/papel-de-parede-3d-7.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 740, 460);

        setSize(new java.awt.Dimension(730, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarClienteActionPerformed
        
     if(tfPesquisarServico.getText().equals("")){
        JOptionPane.showMessageDialog(null,"O CAMPO ID ESTÃ� VAZIO");  
     return;
     }
        
        servico.setId(tfId.getText());
        servico.setNome(tfNome.getText());
        servico.setSolicitador(tfSolicitador.getText());
        servico.setEndereco(tfEndereco.getText());
        servico.setTelefone(tfTelefone.getText());
        servico.setValor(tfValor.getText());
        servico.setData(tfData.getText());
        servico.setHorario(tfHorario.getText());
        control.editar(servico);
        tfNome.setText(" ");
        tfId.setText(" ");
        tfSolicitador.setText(" ");
        tfEndereco.setText(" ");
        tfTelefone.setText(" ");
        tfValor.setText(" ");
        tfData.setText(" ");
        tfHorario.setText(" ");
        tfPesquisarServico.setText("");
        
    }//GEN-LAST:event_btAtualizarClienteActionPerformed

    private void btVoltarAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarAtualizarClienteActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarAtualizarClienteActionPerformed

    private void btSairAtualizarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairAtualizarCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairAtualizarCliente1ActionPerformed

    private void tfPesquisarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarServicoActionPerformed
        
    }//GEN-LAST:event_tfPesquisarServicoActionPerformed

    private void btPesquisarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarServicoActionPerformed
        
        if(tfPesquisarServico.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DIGITE UM ID VÃ�LIDO !!!");
            return;
        }
        
        servico.setPesquisa(tfPesquisarServico.getText());
        Servico model = control.buscar(servico);
        tfNome.setText(model.getNome());
        tfId.setText(model.getId());
        tfSolicitador.setText(model.getSolicitador());
        tfEndereco.setText(model.getEndereco());
        tfTelefone.setText(model.getTelefone());
        tfValor.setText(model.getValor());
        tfData.setText(model.getData());
        tfHorario.setText(model.getHorario());
    }//GEN-LAST:event_btPesquisarServicoActionPerformed

    private void tfIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdKeyTyped
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_tfIdKeyTyped

    private void tfValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorKeyTyped
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_tfValorKeyTyped

    private void tfTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefoneKeyTyped
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_tfTelefoneKeyTyped

    private void tfDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDataKeyTyped
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_tfDataKeyTyped

    private void tfHorarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHorarioKeyTyped
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_tfHorarioKeyTyped

    private void tfPesquisarServicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarServicoKeyTyped
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_tfPesquisarServicoKeyTyped

    private void tfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c!=(char)KeyEvent.VK_BACK_SPACE) && (c!=(char)KeyEvent.VK_SPACE)){ 
            evt.consume();
            JOptionPane.showMessageDialog(null,"ADMITE APENAS TEXTO","", JOptionPane.INFORMATION_MESSAGE);
        }    }//GEN-LAST:event_tfNomeKeyTyped

    private void tfSolicitadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSolicitadorKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c!=(char)KeyEvent.VK_BACK_SPACE) && (c!=(char)KeyEvent.VK_SPACE)){ 
            evt.consume();
            JOptionPane.showMessageDialog(null,"ADMITE APENAS TEXTO","", JOptionPane.INFORMATION_MESSAGE);
        }    }//GEN-LAST:event_tfSolicitadorKeyTyped

    private void tfEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEnderecoKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_tfEnderecoKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer = new Timer(1000,new TelaAtualizarServico.cron());
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
            java.util.logging.Logger.getLogger(TelaAtualizarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaAtualizarServico().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarCliente;
    private javax.swing.JButton btPesquisarServico;
    private javax.swing.JButton btSairAtualizarCliente1;
    private javax.swing.JButton btVoltarAtualizarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel lbHoras;
    private javax.swing.JLabel lbMinutos;
    private javax.swing.JLabel lbSegundos;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfHorario;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisarServico;
    private javax.swing.JTextField tfSolicitador;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
