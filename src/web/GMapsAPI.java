package web;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GMapsAPI extends JFrame{
		int zoom = 12;
		String local = "";
		private javax.swing.JLabel mapaLabel;
    	
	    
		//método construtor
	    public GMapsAPI() {
	        super("AC Intelligence");
	        desenhaJanela();
	        atualizarMapa();
	    }

	    //método de criação da janela
	    public void desenhaJanela() {
	    	getContentPane().setLayout(null);
	        
	        mapaLabel = new JLabel();
	        
	        JLabel lblBuscarLocal = new JLabel("Buscar Local");
	        lblBuscarLocal.setBounds(10, 11, 59, 14);
	        getContentPane().add(lblBuscarLocal);
	        
	        JTextField textFieldBuscar;
	        textFieldBuscar = new JTextField();
	        textFieldBuscar.setBounds(79, 8, 126, 20);
	        getContentPane().add(textFieldBuscar);
	        textFieldBuscar.setColumns(10);
	        
	        JButton btnBuscar = new JButton("Buscar");
	        btnBuscar.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		
	        	}
	        });
	        btnBuscar.setBounds(215, 7, 70, 23);
	        getContentPane().add(btnBuscar);
	        
	        JButton btnMais = new JButton("+");
	        btnMais.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	        		zoom++;
	        		atualizarMapa();
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
	        		atualizarMapa();
	        	}
	        });
	        
	        btnMenos.setBounds(555, 7, 43, 23);
	        getContentPane().add(btnMenos);
	        
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
	        					.addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
	        					.addComponent(lblZoom)
	        					.addPreferredGap(ComponentPlacement.RELATED)
	        					.addComponent(btnMais)
	        					.addPreferredGap(ComponentPlacement.RELATED)
	        					.addComponent(btnMenos, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
	        					.addGap(66))
	        				.addGroup(layout.createSequentialGroup()
	        					.addComponent(mapaLabel, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
	        					.addContainerGap())))
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(lblZoom)
	        				.addComponent(btnMais)
	        				.addComponent(btnMenos)
	        				.addComponent(btnBuscar)
	        				.addComponent(textFieldBuscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(lblBuscarLocal))
	        			.addGap(18)
	        			.addComponent(mapaLabel, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE))
	        );
	        getContentPane().setLayout(layout);
	        pack();
	        
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
		            java.util.logging.Logger.getLogger(GMapsAPI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(GMapsAPI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(GMapsAPI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(GMapsAPI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
	    	
	    	java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new GMapsAPI().setVisible(true);
	            }
	        });

	    }
	    
	    
	    private void atualizarMapa() {
	        
	        String chave="AIzaSyDfTYJZVmCdT5Hart3mtwa5HrQzAf_Z_NM";
	        
	        String endereco = "http://maps.googleapis.com/maps/api/staticmap?center=Ceagriii-8.016218,-34.945221&zoom=" + zoom + "&size=640x640&markers=color:blue%7Clabel:%7C-8.017631,-34.944363&maptype=roadmap&key="+chave+"&sensor=false&format=jpg";
	        java.awt.image.BufferedImage img = null;

	        try {
	            URL url = new URL(endereco);
	            HttpURLConnection con = (HttpURLConnection) url.openConnection();
	            img = ImageIO.read(con.getInputStream());
	        } catch (MalformedURLException ex) {
	            Logger.getLogger(GMapsAPI.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (IOException ex) {
	            Logger.getLogger(GMapsAPI.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        if (img != null) {
	            ImageIcon mapa = new ImageIcon(img);
	            mapaLabel.setIcon(mapa);
	        }
	        
	    }
}
