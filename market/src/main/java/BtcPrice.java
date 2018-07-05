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
        //TODO - implement this method!
        String response;
        Map<String, String> input = new HashMap<>();
        input.put("pair", "XBTUSD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        System.out.println(response);
        return response;
    }

    public Ticker getBtcUsdTicker() throws IOException {
        //TODO - implement this method!
        ObjectMapper objectMapper=new ObjectMapper();
        Ticker ticker=objectMapper.readValue(this.getBtcUsdPriceResponse(),Ticker.class);
        return ticker;
    }

    public String getBtcUsdPrice() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Ticker ticker0=objectMapper.readValue(getBtcUsdPriceResponse(),Ticker.class);
        return ticker0.getResult().getPair().getO();
    }

    public String getBtcCadPriceResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();
        input.put("pair", "XBTCAD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        System.out.println(response);
        return response;
    }

    public Ticker getBtcCadTicker() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Ticker ticker=objectMapper.readValue(this.getBtcCadPriceResponse(),Ticker.class);
        return ticker;
    }

    public String getBtcCadPrice() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Ticker ticker0=objectMapper.readValue(getBtcCadPriceResponse(),Ticker.class);
        return ticker0.getResult().getPair().getO();
    }

    public String getBtcJpyPriceResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();
        input.put("pair", "XBTJPY");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        System.out.println(response);
        return response;
    }

    public Ticker getBtcJpyTicker() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Ticker ticker=objectMapper.readValue(this.getBtcJpyPriceResponse(),Ticker.class);
        return ticker;
    }

    public String getBtcJpyPrice() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Ticker ticker0=objectMapper.readValue(getBtcJpyPriceResponse(),Ticker.class);
        return ticker0.getResult().getPair().getO();
    }

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }

}
