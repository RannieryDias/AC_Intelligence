package web;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class GMapsAPI extends JFrame{
		int zoom = 12;
		private JTextField textField;
	    
	    public GMapsAPI() {
	        super("AC Intelligence");
	        getContentPane().setLayout(null);
	        
	        JPanel panel = new JPanel();
	        panel.setBounds(10, 36, 684, 520);
	        getContentPane().add(panel);
	        
	        JLabel lblBuscarLocal = new JLabel("Buscar Local");
	        lblBuscarLocal.setBounds(10, 11, 59, 14);
	        getContentPane().add(lblBuscarLocal);
	        
	        textField = new JTextField();
	        textField.setBounds(79, 8, 126, 20);
	        getContentPane().add(textField);
	        textField.setColumns(10);
	        
	        JButton btnBuscar = new JButton("Buscar");
	        btnBuscar.setBounds(215, 7, 70, 23);
	        getContentPane().add(btnBuscar);
	        
	        JButton btnMais = new JButton("+");
	        btnMais.setBounds(502, 7, 43, 23);
	        getContentPane().add(btnMais);
	        
	        JLabel lblZoom = new JLabel("Zoom");
	        lblZoom.setBounds(460, 11, 32, 14);
	        getContentPane().add(lblZoom);
	        
	        JButton btnMenos = new JButton("-");
	        btnMenos.setBounds(555, 7, 43, 23);
	        getContentPane().add(btnMenos);
	        atualizarMapa();
	    }

	    @SuppressWarnings("unchecked")

	    
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

	    }
}
