package web;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;



public class ConexaoGMapsAPI {
	
	public ImageIcon atualizarMapa(String local, int zoom) {
        
        String chave="AIzaSyDfTYJZVmCdT5Hart3mtwa5HrQzAf_Z_NM";
        
        String endereco = "http://maps.googleapis.com/maps/api/staticmap?center="+ local +"-8.016218,-34.945221&zoom=" + zoom + "&size=640x640&markers=color:blue%7Clabel:%7C" + local + "&maptype=roadmap&key="+chave+"&sensor=false&format=jpg";
        System.out.println(endereco);
        java.awt.image.BufferedImage img = null;

        try {
            URL url = new URL(endereco);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            img = ImageIO.read(con.getInputStream());
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ConexaoGMapsAPI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConexaoGMapsAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (img != null) {
            ImageIcon mapa = new ImageIcon(img);
            return mapa;
        }else {
        	return null;
        }
        
    }
		
}
