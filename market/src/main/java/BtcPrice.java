import api.KrakenApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Ticker;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BtcPrice {

    /**
     * Look for usage examples at ...
     * https://github.com/nyg/kraken-api-java
     */

    private KrakenApi api;

    public BtcPrice() {
        this.api = new KrakenApi();
        this.api.setKey("oenG97umzj5IrnldcxqGSt9SQ/xuGIA2xLtnoAiYCPUDkQ5KYBgQTP+N");
        this.api.setSecret("LjHtZKrY9WOnVnUnM0d5KT8Y57DFHkexYTlMokXj0qx/VTijsN9N0YEA2ttI3axFNhuoUV6Hcgx4O0uk75bcyw==");
    }

    public String getBtcUsdPriceResponse() throws IOException {


        Map <String, String> input = new HashMap<>();
        input.put("pair", "XBTUSD");
        String response = api.queryPublic(KrakenApi.Method.TICKER, input);


        //TODO - implement this method!
        return response;
    }

    public Ticker getBtcUsdTicker() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker myTicker =   mapper.readValue(this.getBtcUsdPriceResponse(), Ticker.class);

        //TODO - implement this method!
        return myTicker;
    }

    public String getBtcUsdPrice() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker myTicker =   mapper.readValue(this.getBtcUsdPriceResponse(), Ticker.class);
        String price = myTicker.getResult().getPair().getO();
        //TODO - implement this method!

        return price;
    }

    public String getBtcCadPriceResponse() throws IOException {

        Map <String, String> input = new HashMap<>();
        input.put("pair", "XBTCAD");
        String response = api.queryPublic(KrakenApi.Method.TICKER, input);

        //TODO - implement this method!
        return response;
    }

    public Ticker getBtcCadTicker() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker myTicker =   mapper.readValue(this.getBtcCadPriceResponse(), Ticker.class);


        //TODO - implement this method!
        return myTicker;
    }

    public String getBtcCadPrice() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker myTicker =   mapper.readValue(this.getBtcCadPriceResponse(), Ticker.class);
        String price = myTicker.getResult().getPair().getO();


        //TODO - implement this method!
        return price;
    }

    public String getBtcJpyPriceResponse() throws IOException {

        Map <String, String> input = new HashMap<>();
        input.put("pair", "XBTJPY");
        String response = api.queryPublic(KrakenApi.Method.TICKER, input);

        //TODO - implement this method!
        return response;
    }

    public Ticker getBtcJpyTicker() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker myTicker =   mapper.readValue(this.getBtcJpyPriceResponse(), Ticker.class);


        //TODO - implement this method!
        return myTicker;
    }

    public String getBtcJpyPrice() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker myTicker =   mapper.readValue(this.getBtcJpyPriceResponse(), Ticker.class);
        String price = myTicker.getResult().getPair().getO();

        //TODO - implement this method!
        return price;
    }

    public static void main (String[] args) throws IOException {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

        BtcPrice btc = new BtcPrice();
        System.out.println(btc.getBtcJpyPrice());
    }

}
