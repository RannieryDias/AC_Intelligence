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
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Kira
 */
public class CadastroServico extends javax.swing.JFrame {
      ConexaoBD conex = new ConexaoBD();
      RepositorioServico control = new RepositorioServico();
      Servico servico = new Servico();
      private Timer timer;
   
   
    public CadastroServico() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfTelefone = new javax.swing.JTextField();
        tfSolicitador = new javax.swing.JTextField();
        btVoltarTelaPrincipal = new javax.swing.JButton();
        btSalvarServico = new javax.swing.JButton();
        btFecharCadastroServico = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tfHorario = new javax.swing.JFormattedTextField();
        tfData = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        lbSegundos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbMinutos = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbHoras = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfOculta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel1.setText("HORÃ�RIO");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 230, 60, 14);

        jLabel2.setText("ENDEREÃ‡O");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 80, 70, 14);

        jLabel3.setText("TELEFONE");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 110, 60, 14);

        jLabel4.setText("DATA");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 140, 27, 14);

        jLabel5.setText("NOME");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 20, 29, 14);

        jLabel6.setText("VALOR");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 170, 50, 14);

        jLabel7.setText("ID");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 50, 34, 14);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(90, 10, 220, 30);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField8);
        jTextField8.setBounds(90, 50, 220, 30);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField9);
        jTextField9.setBounds(90, 90, 220, 30);

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField10);
        jTextField10.setBounds(90, 130, 220, 30);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField11);
        jTextField11.setBounds(90, 170, 220, 30);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField12);
        jTextField12.setBounds(90, 210, 220, 30);

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField13);
        jTextField13.setBounds(90, 250, 220, 30);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(-20, -40, 630, 350);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 40, 590, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 33, 0, 0);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        tfTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefoneKeyTyped(evt);
            }
        });
        jPanel4.add(tfTelefone);
        tfTelefone.setBounds(90, 170, 240, 30);

        tfSolicitador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSolicitadorActionPerformed(evt);
            }
        });
        tfSolicitador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSolicitadorKeyTyped(evt);
            }
        });
        jPanel4.add(tfSolicitador);
        tfSolicitador.setBounds(90, 50, 240, 30);

        btVoltarTelaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        btVoltarTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/back.png"))); // NOI18N
        btVoltarTelaPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVoltarTelaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltarTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaPrincipalActionPerformed(evt);
            }
        });
        jPanel4.add(btVoltarTelaPrincipal);
        btVoltarTelaPrincipal.setBounds(20, 270, 60, 55);

        btSalvarServico.setBackground(new java.awt.Color(255, 255, 255));
        btSalvarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/SalvarServico.png"))); // NOI18N
        btSalvarServico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSalvarServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarServicoActionPerformed(evt);
            }
        });
        jPanel4.add(btSalvarServico);
        btSalvarServico.setBounds(260, 270, 60, 60);

        btFecharCadastroServico.setBackground(new java.awt.Color(255, 255, 255));
        btFecharCadastroServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Sair.png"))); // NOI18N
        btFecharCadastroServico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btFecharCadastroServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFecharCadastroServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharCadastroServicoActionPerformed(evt);
            }
        });
        jPanel4.add(btFecharCadastroServico);
        btFecharCadastroServico.setBounds(570, 270, 60, 60);

        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeKeyTyped(evt);
            }
        });
        jPanel4.add(tfNome);
        tfNome.setBounds(90, 90, 240, 30);

        tfEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEnderecoKeyTyped(evt);
            }
        });
        jPanel4.add(tfEndereco);
        tfEndereco.setBounds(90, 130, 240, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("SOLICITADOR");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(10, 60, 80, 13);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("NOME");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(10, 100, 40, 13);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("ENDERE\u00C7O");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(10, 140, 60, 13);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("TELEFONE");
        jPanel4.add(jLabel22);
        jLabel22.setBounds(10, 180, 60, 13);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("VALOR");
        jPanel4.add(jLabel23);
        jLabel23.setBounds(340, 60, 40, 13);

        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });
        tfValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfValorKeyTyped(evt);
            }
        });
        jPanel4.add(tfValor);
        tfValor.setBounds(400, 50, 240, 30);

        tfId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIdKeyTyped(evt);
            }
        });
        jPanel4.add(tfId);
        tfId.setBounds(400, 170, 240, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ID");
        jPanel4.add(jLabel24);
        jLabel24.setBounds(340, 180, 20, 13);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("DATA");
        jPanel4.add(jLabel25);
        jLabel25.setBounds(340, 100, 40, 13);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("HORARIO");
        jPanel4.add(jLabel26);
        jLabel26.setBounds(340, 140, 60, 13);

        tfHorario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            tfHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfHorario.setMaximumSize(new java.awt.Dimension(23, 60));
        tfHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHorarioActionPerformed(evt);
            }
        });
        tfHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfHorarioKeyTyped(evt);
            }
        });
        
        lblLocalizao = new JLabel("LOCALIZA\u00C7\u00C3O");
        lblLocalizao.setFont(new Font("Tahoma", Font.BOLD, 10));
        lblLocalizao.setForeground(Color.WHITE);
        lblLocalizao.setBounds(10, 218, 80, 14);
        jPanel4.add(lblLocalizao);
        jPanel4.add(tfHorario);
        tfHorario.setBounds(400, 130, 240, 30);

        tfData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            tfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataActionPerformed(evt);
            }
        });
        tfData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDataKeyTyped(evt);
            }
        });
        jPanel4.add(tfData);
        tfData.setBounds(400, 90, 240, 30);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(null);

        lbSegundos.setText("00");
        jPanel5.add(lbSegundos);
        lbSegundos.setBounds(70, 0, 30, 30);

        jLabel11.setText(":");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(60, 0, 10, 30);

        lbMinutos.setText("00");
        jPanel5.add(lbMinutos);
        lbMinutos.setBounds(40, 0, 40, 30);

        jLabel12.setText(":");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(30, 0, 10, 30);

        lbHoras.setText("00");
        lbHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbHorasKeyTyped(evt);
            }
        });
        jPanel5.add(lbHoras);
        lbHoras.setBounds(10, 0, 30, 30);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(270, 10, 90, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/thumb2-abstract-background-black-wave-stock-wallpaper.jpg"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel10);
        jLabel10.setBounds(0, 0, 650, 340);
        jPanel4.add(tfOculta);
        tfOculta.setBounds(380, 240, 120, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 40, 650, 340);

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CADASTRO SERVI\u00C7O");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 10, 160, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/papel-de-parede-3d-7.jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 710, 450);

        setSize(new java.awt.Dimension(713, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void btSalvarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarServicoActionPerformed

        
        
     if(tfId.getText().equals("") ||tfSolicitador.getText().equals("") || tfNome.getText().equals("") || tfEndereco.getText().equals("") || tfTelefone.getText().equals("") || tfValor.getText().equals("") || tfData.getText().equals("") || tfHorario.getText().equals("")){
         JOptionPane.showMessageDialog(null,"VERFIQUE SE ALGUM CAMPO ESTÃ� VAZIO !!!");
         return;
     }
        servico.setPesquisa(tfId.getText());
        Servico model = control.validar(servico);      
        tfOculta.setText(model.getId());
             
         if(tfId.getText().equals(tfOculta.getText())){ // se o valor setado em tfcpf for igual ao que estÃ¡ dentro do equals ele retorna uma mensagem
            JOptionPane.showMessageDialog(null,"ID JÃ� CADASTRADO !!!");
       
     }else{
        
        servico.setId(tfId.getText());
        servico.setSolicitador(tfSolicitador.getText());
        servico.setNome(tfNome.getText());
        servico.setEndereco(tfEndereco.getText());
        servico.setTelefone(tfTelefone.getText());
        servico.setValor(tfValor.getText());
        servico.setData(tfData.getText());
        servico.setHorario(tfHorario.getText());
        control.cadastrar(servico);
        //LIMPA OS CAMPOS APÃ“S SALVAR
        tfId.setText(" ");
        tfSolicitador.setText("");
        tfNome.setText(" ");
        tfEndereco.setText(" ");
        tfTelefone.setText(" ");
        tfValor.setText(" ");
        tfData.setText(" ");
        tfHorario.setText(" ");  
     
         }
        
    }//GEN-LAST:event_btSalvarServicoActionPerformed

    private void btVoltarTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaPrincipalActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarTelaPrincipalActionPerformed

    private void btFecharCadastroServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharCadastroServicoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btFecharCadastroServicoActionPerformed

    private void tfTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefoneKeyTyped
       char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c!=(char)KeyEvent.VK_BACK_SPACE)){ 
            evt.consume();
            JOptionPane.showMessageDialog(null,"ADMITE APENAS NÃšMEROS","", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tfTelefoneKeyTyped

    private void tfValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorKeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c!=(char)KeyEvent.VK_BACK_SPACE)){ 
            evt.consume();
            JOptionPane.showMessageDialog(null,"ADMITE APENAS NÃšMEROS","", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tfValorKeyTyped

    private void tfIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdKeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c!=(char)KeyEvent.VK_BACK_SPACE)){ 
            evt.consume();
            JOptionPane.showMessageDialog(null,"ADMITE APENAS NÃšMEROS","", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tfIdKeyTyped

    private void tfSolicitadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSolicitadorKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c!=(char)KeyEvent.VK_BACK_SPACE) && (c!=(char)KeyEvent.VK_SPACE)){ 
            evt.consume();
            JOptionPane.showMessageDialog(null,"ADMITE APENAS TEXTO");
        }
    }//GEN-LAST:event_tfSolicitadorKeyTyped

    private void tfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c!=(char)KeyEvent.VK_BACK_SPACE) && (c!=(char)KeyEvent.VK_SPACE)){ 
            evt.consume();
            JOptionPane.showMessageDialog(null,"|| ADMITE APENAS TEXTO!!! ||");
        }
    }//GEN-LAST:event_tfNomeKeyTyped

    private void tfEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEnderecoKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c!=(char)KeyEvent.VK_BACK_SPACE) && (c!=(char)KeyEvent.VK_SPACE)){ 
            evt.consume();
            JOptionPane.showMessageDialog(null,"|| ADMITE APENAS TEXTO!!! ||");
        }
        
   
    }//GEN-LAST:event_tfEnderecoKeyTyped

    private void tfSolicitadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSolicitadorActionPerformed
       
    }//GEN-LAST:event_tfSolicitadorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer = new Timer(1000,new CadastroServico.cron());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorActionPerformed

    private void tfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataActionPerformed
        
    }//GEN-LAST:event_tfDataActionPerformed

    private void tfHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHorarioActionPerformed

    private void lbHorasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbHorasKeyTyped
        
            
    }//GEN-LAST:event_lbHorasKeyTyped

    private void tfHorarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHorarioKeyTyped
       
    
    }//GEN-LAST:event_tfHorarioKeyTyped

    private void tfDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDataKeyTyped
            
        
    }//GEN-LAST:event_tfDataKeyTyped

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
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroServico().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFecharCadastroServico;
    private javax.swing.JButton btSalvarServico;
    private javax.swing.JButton btVoltarTelaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbHoras;
    private javax.swing.JLabel lbMinutos;
    private javax.swing.JLabel lbSegundos;
    private javax.swing.JFormattedTextField tfData;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JFormattedTextField tfHorario;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfOculta;
    private javax.swing.JTextField tfSolicitador;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfValor;
    private JLabel lblLocalizao;
    // End of variables declaration//GEN-END:variables
}
