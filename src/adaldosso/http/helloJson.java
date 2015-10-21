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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Alberto Dal Dosso
 */
public class helloJson {

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
        System.out.println(result);
        JSONObject obj;
        try {
            obj = new JSONObject(result.toString());
            JSONArray arr = obj.getJSONObject("metaData").getJSONArray("fields");
            for (int i = 0; i < arr.length(); i++) {
                String type = arr.getJSONObject(i).getString("type");
                System.out.println("type: " + type);
            }
        } catch (JSONException ex) {
            Logger.getLogger(helloJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
