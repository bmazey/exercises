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
        //TODO - implement this method!
        Map<String, String> input = new HashMap<>();
        String response = "";
        input.put("pair", "ETHUSD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        System.out.println(response);

        return response;

    }

    public Ticker getEthUsdTicker() throws IOException {
        //TODO - implement this method!
        ObjectMapper mapper = new ObjectMapper();
        Ticker bitcoin = mapper.readValue(getEthUsdPriceResponse(),Ticker.class);


        return bitcoin;
    }

    public String getEthUsdPrice() throws IOException {
        //TODO - implement this method!

        ObjectMapper mapper = new ObjectMapper();
        Ticker bitcoin = mapper.readValue(getEthUsdPriceResponse(),Ticker.class);

        return bitcoin.getResult().getPair().getO();

    }

    public String getEthCadPriceResponse() throws IOException {
        //TODO - implement this method!
        Map<String, String> input = new HashMap<>();
        String response = "";
        input.put("pair", "ETHCAD");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        System.out.println(response);

        return response;
    }

    public Ticker getEthCadTicker() throws IOException {
        //TODO - implement this method!
        ObjectMapper mapper = new ObjectMapper();
        Ticker bitcoin = mapper.readValue(getEthCadPriceResponse(),Ticker.class);


        return bitcoin;

    }

    public String getEthCadPrice() throws IOException {
        //TODO - implement this method!
        ObjectMapper mapper = new ObjectMapper();
        Ticker bitcoin = mapper.readValue(getEthCadPriceResponse(),Ticker.class);

        return bitcoin.getResult().getPair().getO();
    }

    public String getEthJpyPriceResponse() throws IOException {
        //TODO - implement this method!
        Map<String, String> input = new HashMap<>();
        String response = "";
        input.put("pair", "ETHJPY");
        response = api.queryPublic(KrakenApi.Method.TICKER, input);
        System.out.println(response);

        return response;
    }

    public Ticker getEthJpyTicker() throws IOException {
        //TODO - implement this method!
        ObjectMapper mapper = new ObjectMapper();
        Ticker bitcoin = mapper.readValue(getEthJpyPriceResponse(),Ticker.class);


        return bitcoin;
    }

    public String getEthJpyPrice() throws IOException {
        //TODO - implement this method!
        ObjectMapper mapper = new ObjectMapper();
        Ticker bitcoin = mapper.readValue(getEthJpyPriceResponse(),Ticker.class);

        return bitcoin.getResult().getPair().getO();
    }

    public static void main (String[] args) throws IOException{

        /**
         * FOR EXPERIMENTATION ONLY!
         */

        EthPrice eth = new EthPrice();
        eth.getEthUsdPriceResponse();
    }
}
