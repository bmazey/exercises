import api.KrakenApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Ticker;

import java.io.IOException;
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

        Map <String, String> input = new HashMap<>();
        input.put("pair", "XETHZUSD");
        String response = api.queryPublic(KrakenApi.Method.TICKER, input);


        //TODO - implement this method!
        return response;
    }

    public Ticker getEthUsdTicker() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker myTicker =   mapper.readValue(this.getEthUsdPriceResponse(), Ticker.class);


        //TODO - implement this method!
        return myTicker;
    }

    public String getEthUsdPrice() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker myTicker =   mapper.readValue(this.getEthUsdPriceResponse(), Ticker.class);
        String price = myTicker.getResult().getPair().getO();

        //TODO - implement this method!
        return price;
    }

    public String getEthCadPriceResponse() throws IOException {

        Map <String, String> input = new HashMap<>();
        input.put("pair", "XETHZCAD");
        String response = api.queryPublic(KrakenApi.Method.TICKER, input);

        //TODO - implement this method!
        return response;
    }

    public Ticker getEthCadTicker() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker myTicker =   mapper.readValue(this.getEthCadPriceResponse(), Ticker.class);

        //TODO - implement this method!
        return myTicker;
    }

    public String getEthCadPrice() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker myTicker =   mapper.readValue(this.getEthCadPriceResponse(), Ticker.class);
        String price = myTicker.getResult().getPair().getO();

        //TODO - implement this method!
        return price;
    }

    public String getEthJpyPriceResponse() throws IOException {

        Map <String, String> input = new HashMap<>();
        input.put("pair", "XETHZJPY");
        String response = api.queryPublic(KrakenApi.Method.TICKER, input);

        //TODO - implement this method!
        return response;
    }

    public Ticker getEthJpyTicker() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker myTicker =   mapper.readValue(this.getEthJpyPriceResponse(), Ticker.class);

        //TODO - implement this method!
        return myTicker;
    }

    public String getEthJpyPrice() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker myTicker =   mapper.readValue(this.getEthJpyPriceResponse(), Ticker.class);
        String price = myTicker.getResult().getPair().getO();

        //TODO - implement this method!
        return price;
    }

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }
}