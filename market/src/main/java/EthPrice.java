import api.KrakenApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.PriceResult;
import dto.Ticker;
import dto.TickerPair;

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
        String response;
        Map<String, String> input = new HashMap<>();
        input.put("pair", "ETHUSD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        System.out.println(response);
        return response;
    }

    public Ticker getEthUsdTicker() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Ticker ticker=objectMapper.readValue(this.getEthUsdPriceResponse(),Ticker.class);
        return ticker;
    }

    public String getEthUsdPrice() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Ticker ticker0=objectMapper.readValue(getEthUsdPriceResponse(),Ticker.class);
        return ticker0.getResult().getPair().getO();
    }

    public String getEthCadPriceResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();
        input.put("pair", "ETHCAD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        System.out.println(response);
        return response;
    }

    public Ticker getEthCadTicker() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Ticker ticker=objectMapper.readValue(this.getEthCadPriceResponse(),Ticker.class);
        return ticker;
    }

    public String getEthCadPrice() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Ticker ticker0=objectMapper.readValue(getEthCadPriceResponse(),Ticker.class);
        return ticker0.getResult().getPair().getO();
    }

    public String getEthJpyPriceResponse() throws IOException {
        String response;
        Map<String, String> input = new HashMap<>();
        input.put("pair", "ETHJPY");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        System.out.println(response);
        return response;
    }

    public Ticker getEthJpyTicker() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Ticker ticker=objectMapper.readValue(this.getEthJpyPriceResponse(),Ticker.class);
        return ticker;
    }

    public String getEthJpyPrice() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Ticker ticker0=objectMapper.readValue(getEthJpyPriceResponse(),Ticker.class);
        return ticker0.getResult().getPair().getO();
    }

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }
}
