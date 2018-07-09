import api.KrakenApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Ticker;
import dto.TickerPair;

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
        //TODO - implement this method!

        Map<String, String> input = new HashMap<>();
        String response = "";
        input.put("pair", "XBTUSD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        System.out.println(response);

        return response;
    }

    public Ticker getBtcUsdTicker() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Ticker bitcoin = mapper.readValue(getBtcUsdPriceResponse(),Ticker.class);


        return bitcoin;
    }

    public String getBtcUsdPrice() throws IOException {
        //TODO - implement this method!

        ObjectMapper mapper = new ObjectMapper();
        Ticker bitcoin = mapper.readValue(getBtcUsdPriceResponse(),Ticker.class);

        return bitcoin.getResult().getPair().getO();
    }
    public String getBtcCadPriceResponse() throws IOException {
        //TODO - implement this method!

        Map<String, String> input = new HashMap<>();
        String response = "";
        input.put("pair", "XBTCAD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        System.out.println(response);

        return response;

    }

    public Ticker getBtcCadTicker() throws IOException {
        //TODO - implement this method!
        ObjectMapper mapper = new ObjectMapper();
        Ticker bitcoin = mapper.readValue(getBtcCadPriceResponse(),Ticker.class);


        return bitcoin;
    }

    public String getBtcCadPrice() throws IOException {
        //TODO - implement this method!
        ObjectMapper mapper = new ObjectMapper();
        Ticker bitcoin = mapper.readValue(getBtcCadPriceResponse(),Ticker.class);

        return bitcoin.getResult().getPair().getO();
    }

    public String getBtcJpyPriceResponse() throws IOException {
        //TODO - implement this method!
        Map<String, String> input = new HashMap<>();
        String response = "";
        input.put("pair", "XBTJPY");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        System.out.println(response);

        return response;
    }

    public Ticker getBtcJpyTicker() throws IOException {
        //TODO - implement this method!
        ObjectMapper mapper = new ObjectMapper();
        Ticker bitcoin = mapper.readValue(getBtcJpyPriceResponse(),Ticker.class);


        return bitcoin;
    }

    public String getBtcJpyPrice() throws IOException {
        //TODO - implement this method!
        ObjectMapper mapper = new ObjectMapper();
        Ticker bitcoin = mapper.readValue(getBtcJpyPriceResponse(),Ticker.class);

        return bitcoin.getResult().getPair().getO();
    }

    public static void main (String[] args) throws IOException {

        /**
         * FOR EXPERIMENTATION ONLY!
         */




        BtcPrice btc = new BtcPrice();
        btc.getBtcUsdPriceResponse();
    }

}
