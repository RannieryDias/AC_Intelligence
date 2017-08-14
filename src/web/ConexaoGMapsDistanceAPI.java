package web;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexaoGMapsDistanceAPI {
public String comparaDistancia(String local1, String local2) {
		String distancia="";
	
        String chave="AIzaSyBTn1J5U4hoYBcA2-Tn9AMOlpN5I75n9c4";
        
        String endereco = "https://maps.googleapis.com/maps/api/distancematrix/json?units=metric&origins="+ local1 +"&destinations="+ local2 +"&mode=driving&language=pt-BR&key=" + chave;
        
        System.out.println(endereco);
        //teste 

        try {
            URL url = new URL(endereco);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
                        
        } catch (MalformedURLException ex) {
            Logger.getLogger(ConexaoGMapsAPI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConexaoGMapsAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return distancia;
    }
}
