import api.KrakenApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Ticker;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class EthPrice {

    /**
     * Look for usage examples at ...
     * https://github.com/nyg/kraken-api-java
     */

    private KrakenApi api;

    public EthPrice() {
        this.api = new KrakenApi();
        this.api.setKey("oenG97umzj5IrnldcxqGSt9SQ/xuGIA2xLtnoAiYCPUDkQ5KYBgQTP+N");
        this.api.setSecret("LjHtZKrY9WOnVnUnM0d5KT8Y57DFHkexYTlMokXj0qx/VTijsN9N0YEA2ttI3axFNhuoUV6Hcgx4O0uk75bcyw==");
    }

    public String getEthUsdPriceResponse() throws IOException {
        Map<String, String> input = new HashMap<>();
        input.put("pair", "ETHUSD");
        String response = api.queryPublic(KrakenApi.Method.TICKER, input);

        System.out.println(response);
        //TODO - implement this method!
        return response ;
    }

    public Ticker getEthUsdTicker() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{ 'result' : 'XETHZUSD'}";
        Ticker obj = mapper.readValue(new URL("https://api.kraken.com/0/public/Ticker?pair=ETHUSD"), Ticker.class);

        //TODO - implement this method!
        return obj;
    }

    public String getEthUsdPrice() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{ 'result' : 'XETHZUSD'}";
        Ticker obj = mapper.readValue(new URL("https://api.kraken.com/0/public/Ticker?pair=ETHUSD"), Ticker.class);
        String price = obj.getResult().getPair().getO();

        //TODO - implement this method!
        return price;
    }

    public String getEthCadPriceResponse() throws IOException {
        Map<String, String> input = new HashMap<>();
        input.put("pair", "ETHCAD");
        String response = api.queryPublic(KrakenApi.Method.TICKER, input);

        System.out.println(response);
        //TODO - implement this method!
        return response ;
    }

    public Ticker getEthCadTicker() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{ 'result' : 'XETHZCAD'}";
        Ticker obj = mapper.readValue(new URL("https://api.kraken.com/0/public/Ticker?pair=ETHCAD"), Ticker.class);

        //TODO - implement this method!
        return obj;
    }

    public String getEthCadPrice() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{ 'result' : 'XETHZCAD'}";
        Ticker obj = mapper.readValue(new URL("https://api.kraken.com/0/public/Ticker?pair=ETHCAD"), Ticker.class);
        String price = obj.getResult().getPair().getO();

        //TODO - implement this method!
        return price;
    }

    public String getEthJpyPriceResponse() throws IOException {
        Map<String, String> input = new HashMap<>();
        input.put("pair", "ETHJPY");
        String response = api.queryPublic(KrakenApi.Method.TICKER, input);

        System.out.println(response);
        //TODO - implement this method!
        return response ;
    }

    public Ticker getEthJpyTicker() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{ 'result' : 'XETHZJPY'}";
        Ticker obj = mapper.readValue(new URL("https://api.kraken.com/0/public/Ticker?pair=ETHJPY"), Ticker.class);

        //TODO - implement this method!
        return obj;
    }

    public String getEthJpyPrice() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{ 'result' : 'XETHZJPY'}";
        Ticker obj = mapper.readValue(new URL("https://api.kraken.com/0/public/Ticker?pair=ETHJPY"), Ticker.class);
        String price = obj.getResult().getPair().getO();


        return price;
    }

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }
}
