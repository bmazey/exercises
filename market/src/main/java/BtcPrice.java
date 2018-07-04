import api.KrakenApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Ticker;
import jdk.nashorn.api.scripting.URLReader;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class BtcPrice {

    /**
     * Look for usage examples at ...
     * https://github.com/nyg/kraken-api-java
     * author: nyg
     */

    private KrakenApi api;

    public BtcPrice() {
        this.api = new KrakenApi();
        this.api.setKey("oenG97umzj5IrnldcxqGSt9SQ/xuGIA2xLtnoAiYCPUDkQ5KYBgQTP+N");
        this.api.setSecret("LjHtZKrY9WOnVnUnM0d5KT8Y57DFHkexYTlMokXj0qx/VTijsN9N0YEA2ttI3axFNhuoUV6Hcgx4O0uk75bcyw==");
    }

    public String getBtcUsdPriceResponse() throws IOException {

        Map<String, String> input = new HashMap<>();
        input.put("pair", "XBTUSD");
       String response = api.queryPublic(KrakenApi.Method.TICKER, input);

       System.out.println(response);
        //TODO - implement this method!
        return response ;
    }

    public Ticker getBtcUsdTicker() throws IOException {
         ObjectMapper mapper = new ObjectMapper();
         String jsonInString = "{ 'result' : 'XXBTZUSD'}";
         Ticker obj = mapper.readValue(new URL("https://api.kraken.com/0/public/Ticker?pair=XBTUSD"), Ticker.class);

        //TODO - implement this method!
        return obj;
    }

    public String getBtcUsdPrice() throws IOException {
        //TODO - implement this method!
        return new String();
    }

    public String getBtcCadPriceResponse() throws IOException {
        Map<String, String> input = new HashMap<>();
        input.put("pair", "XBTCAD");
        String response = api.queryPublic(KrakenApi.Method.TICKER, input);

        System.out.println(response);
        //TODO - implement this method!
        return response ;
    }

    public Ticker getBtcCadTicker() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{ 'result' : 'XXBTZCAD'}";
        Ticker obj2 = mapper.readValue(new URL("https://api.kraken.com/0/public/Ticker?pair=XBTCAD"), Ticker.class);

        //TODO - implement this method!
        return obj2;
    }

    public String getBtcCadPrice() throws IOException {
        //TODO - implement this method!
        return new String();
    }

    public String getBtcJpyPriceResponse() throws IOException {
        Map<String, String> input = new HashMap<>();
        input.put("pair", "XBTJPY");
        String response = api.queryPublic(KrakenApi.Method.TICKER, input);

        System.out.println(response);
        //TODO - implement this method!
        return response ;
    }

    public Ticker getBtcJpyTicker() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{ 'result' : 'XXBTZJPY'}";
        Ticker obj2 = mapper.readValue(new URL("https://api.kraken.com/0/public/Ticker?pair=XBTJPY"), Ticker.class);

        //TODO - implement this method!
        return obj2;
    }

    public String getBtcJpyPrice() throws IOException {
        //TODO - implement this method!
        return new String();
    }

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }

}
