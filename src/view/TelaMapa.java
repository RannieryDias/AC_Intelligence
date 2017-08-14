package view;


import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import web.ConexaoGMapsAPI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMapa extends JFrame{
	
			int zoom = 12;
			private String local = "";
			public String localSalvo = "";
			private javax.swing.JLabel mapaLabel;
	    	
			ConexaoGMapsAPI conexao = new ConexaoGMapsAPI();
		    
			
			//m�todo construtor
		    public TelaMapa() {
		        super("AC Intelligence");
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        desenhaJanela();
		        mapaLabel.setIcon(conexao.atualizarMapa(local, zoom));
		    }

		    //m�todo de cria��o da janela
		    public void desenhaJanela() {
		    	getContentPane().setLayout(null);
		        
		        mapaLabel = new JLabel();
		        
		        JLabel lblBuscarLocal = new JLabel("Buscar Local");
		        lblBuscarLocal.setBounds(10, 11, 59, 14);
		        getContentPane().add(lblBuscarLocal);
		        
		        
		        JTextField textFieldBuscar = new JTextField();
		        textFieldBuscar.setBounds(79, 8, 126, 20);
		        getContentPane().add(textFieldBuscar);
		        textFieldBuscar.setColumns(10);
		        
		        JButton btnBuscar = new JButton("Buscar");
		        btnBuscar.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		local = textFieldBuscar.getText();
		        		local = local.replaceAll("\\s", "+");
		        		System.out.println(local);
		        		mapaLabel.setIcon(conexao.atualizarMapa(local, zoom));
		        	}
		        });
		        btnBuscar.setBounds(215, 7, 70, 23);
		        getContentPane().add(btnBuscar);
		        
		        JButton btnMais = new JButton("+");
		        btnMais.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent arg0) {
		        		zoom++;
		        		mapaLabel.setIcon(conexao.atualizarMapa(local, zoom));
		        	}
		        });
		        btnMais.setBounds(502, 7, 43, 23);
		        getContentPane().add(btnMais);
		        
		        JLabel lblZoom = new JLabel("Zoom");
		        lblZoom.setBounds(460, 11, 32, 14);
		        getContentPane().add(lblZoom);
		        
		        JButton btnMenos = new JButton("-");
		        btnMenos.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent arg0) {
		        		zoom--;
		        		mapaLabel.setIcon(conexao.atualizarMapa(local, zoom));
		        	}
		        });
		        
		        btnMenos.setBounds(555, 7, 43, 23);
		        getContentPane().add(btnMenos);
		        
		        JButton btnSalvarLocal = new JButton("Salvar Local");
		        btnSalvarLocal.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent arg0) {
		        		localSalvo = textFieldBuscar.getText();
		        		dispose();
		        	}
		        });
		        
		        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		        layout.setHorizontalGroup(
		        	layout.createParallelGroup(Alignment.LEADING)
		        		.addGroup(layout.createSequentialGroup()
		        			.addContainerGap()
		        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
		        				.addGroup(layout.createSequentialGroup()
		        					.addGap(6)
		        					.addComponent(lblBuscarLocal)
		        					.addPreferredGap(ComponentPlacement.UNRELATED)
		        					.addComponent(textFieldBuscar, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
		        					.addPreferredGap(ComponentPlacement.RELATED)
		        					.addComponent(btnBuscar)
		        					.addGap(18)
		        					.addComponent(lblZoom)
		        					.addPreferredGap(ComponentPlacement.UNRELATED)
		        					.addComponent(btnMais)
		        					.addPreferredGap(ComponentPlacement.UNRELATED)
		        					.addComponent(btnMenos, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
		        					.addGap(18)
		        					.addComponent(btnSalvarLocal))
		        				.addComponent(mapaLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		        			.addContainerGap())
		        );
		        layout.setVerticalGroup(
		        	layout.createParallelGroup(Alignment.TRAILING)
		        		.addGroup(layout.createSequentialGroup()
		        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
		        				.addComponent(btnBuscar)
		        				.addComponent(textFieldBuscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		        				.addComponent(lblBuscarLocal)
		        				.addComponent(lblZoom)
		        				.addComponent(btnMais)
		        				.addComponent(btnMenos)
		        				.addComponent(btnSalvarLocal))
		        			.addGap(18)
		        			.addComponent(mapaLabel, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE))
		        );
		        getContentPane().setLayout(layout);
		        pack();
		        
		    }
		    
		    public String getLocal() {
		    	
		    	return this.localSalvo;
		    }		    
		    
		    @SuppressWarnings("unchecked")

		    public static void main(String args[]) {
		    	 
		    	//magia
		    	try {
			            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
			                if ("Nimbus".equals(info.getName())) {
			                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
			                    break;
			                }
			            }
			        } catch (ClassNotFoundException ex) {
			            java.util.logging.Logger.getLogger(TelaMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			        } catch (InstantiationException ex) {
			            java.util.logging.Logger.getLogger(TelaMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			        } catch (IllegalAccessException ex) {
			            java.util.logging.Logger.getLogger(TelaMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
			            java.util.logging.Logger.getLogger(TelaMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			        }
		    	
		    	java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                new TelaMapa().setVisible(true);
		            }
		        });

		    }
		    

}


