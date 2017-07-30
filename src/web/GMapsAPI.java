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
	    
	    public GMapsAPI() {
	        super("AC Intelligence");
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
