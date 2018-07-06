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

        String responseEthUsdPrice;
        Map<String, String> EthUsdPrice = new HashMap();

        EthUsdPrice.put("pair", "ETHUSD");
        responseEthUsdPrice = api.queryPublic(KrakenApi.Method.TICKER, EthUsdPrice);
        System.out.println(responseEthUsdPrice);

        return responseEthUsdPrice;
    }

    public Ticker getEthUsdTicker() throws IOException {

        ObjectMapper MapEthUsdTicker = new ObjectMapper();
        Ticker EthUsdTicker = MapEthUsdTicker.readValue(this.getEthUsdPriceResponse(),Ticker.class);

        return EthUsdTicker;
    }

    public String getEthUsdPrice() throws IOException {

        ObjectMapper MapEthUsdPrice = new ObjectMapper();
        Ticker EthUsdPrice = MapEthUsdPrice.readValue(getEthUsdPriceResponse(),Ticker.class);

        return EthUsdPrice.getResult().getPair().getO();
    }

    public String getEthCadPriceResponse() throws IOException {

        String responseEthCadPrice;
        Map<String, String> EthCadPrice = new HashMap();

        EthCadPrice.put("pair", "ETHCAD");
        responseEthCadPrice = api.queryPublic(KrakenApi.Method.TICKER, EthCadPrice);
        System.out.println(responseEthCadPrice);

        return responseEthCadPrice;
    }

    public Ticker getEthCadTicker() throws IOException {

        ObjectMapper MapEthCadTicker = new ObjectMapper();
        Ticker EthCadTicker = MapEthCadTicker.readValue(this.getEthCadPriceResponse(),Ticker.class);

        return EthCadTicker;
    }

    public String getEthCadPrice() throws IOException {

        ObjectMapper MapEthCadPrice = new ObjectMapper();
        Ticker EthCadPrice = MapEthCadPrice.readValue(getEthCadPriceResponse(),Ticker.class);

        return EthCadPrice.getResult().getPair().getO();
    }

    public String getEthJpyPriceResponse() throws IOException {

        String responseEthJpyPrice;
        Map<String, String> EthJpyPrice = new HashMap();

        EthJpyPrice.put("pair", "ETHJPY");
        responseEthJpyPrice = api.queryPublic(KrakenApi.Method.TICKER, EthJpyPrice);
        System.out.println(responseEthJpyPrice);

        return responseEthJpyPrice;
    }

    public Ticker getEthJpyTicker() throws IOException {

        ObjectMapper MapEthJpyTicker = new ObjectMapper();
        Ticker EthJpyTicker = MapEthJpyTicker.readValue(this.getEthJpyPriceResponse(),Ticker.class);

        return EthJpyTicker;
    }

    public String getEthJpyPrice() throws IOException {

        ObjectMapper MapEthJpyPrice = new ObjectMapper();
        Ticker EthJpyPrice = MapEthJpyPrice.readValue(getEthJpyPriceResponse(),Ticker.class);

        return EthJpyPrice.getResult().getPair().getO();
    }

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }
}

////07.06.18 Coding Fin ><(((('>