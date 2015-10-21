package adaldosso.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alberto Dal Dosso
 */
public class helloGet {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        URL url;
        try {
            url = new URL("http://www.adaldosso.com/quantospendi/srv/categorie.php");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = bufferRead.readLine()) != null) {
                result.append(line);
            }
            bufferRead.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(helloGet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProtocolException ex) {
            Logger.getLogger(helloGet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(helloGet.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print(result);
    }

}
