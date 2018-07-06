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

        String responseBtcUsdPrice;
        Map<String, String> BtcUsdPrice = new HashMap();

        BtcUsdPrice.put("pair", "XBTUSD");
        responseBtcUsdPrice = api.queryPublic(KrakenApi.Method.TICKER, BtcUsdPrice);
        System.out.println(responseBtcUsdPrice);

        return responseBtcUsdPrice;
    }

    public Ticker getBtcUsdTicker() throws IOException {

        ObjectMapper MapBtcUsdTicker = new ObjectMapper();
        Ticker BtcUsdTicker = MapBtcUsdTicker.readValue(this.getBtcUsdPriceResponse(),Ticker.class);

        return BtcUsdTicker;
    }

    public String getBtcUsdPrice() throws IOException {

        ObjectMapper MapBtcUsdPrice = new ObjectMapper();
        Ticker BtcUsdPrice = MapBtcUsdPrice.readValue(getBtcUsdPriceResponse(),Ticker.class);

        return BtcUsdPrice.getResult().getPair().getO();
    }

    public String getBtcCadPriceResponse() throws IOException {

        String responseBtcCadPrice;
        Map<String, String> BtcCadPrice = new HashMap();

        BtcCadPrice.put("pair", "XBTCAD");
        responseBtcCadPrice = api.queryPublic(KrakenApi.Method.TICKER, BtcCadPrice);
        System.out.println(responseBtcCadPrice);

        return responseBtcCadPrice;
    }

    public Ticker getBtcCadTicker() throws IOException {

        ObjectMapper MapBtcCadTicker = new ObjectMapper();
        Ticker BtcCadTicker = MapBtcCadTicker.readValue(this.getBtcCadPriceResponse(),Ticker.class);

        return BtcCadTicker;
    }

    public String getBtcCadPrice() throws IOException {

        ObjectMapper MapBtcCadPrice = new ObjectMapper();
        Ticker BtcCadPrice = MapBtcCadPrice.readValue(getBtcCadPriceResponse(),Ticker.class);

        return BtcCadPrice.getResult().getPair().getO();
    }

    public String getBtcJpyPriceResponse() throws IOException {

        String responseBtcJpyPrice;
        Map<String, String> BtcJpyPrice = new HashMap();

        BtcJpyPrice.put("pair", "XBTJPY");
        responseBtcJpyPrice = api.queryPublic(KrakenApi.Method.TICKER, BtcJpyPrice);
        System.out.println(responseBtcJpyPrice);

        return responseBtcJpyPrice;
    }

    public Ticker getBtcJpyTicker() throws IOException {

        ObjectMapper MapBtcJpyTicker = new ObjectMapper();
        Ticker BtcJpyTicker = MapBtcJpyTicker.readValue(this.getBtcJpyPriceResponse(),Ticker.class);

        return BtcJpyTicker;
    }

    public String getBtcJpyPrice() throws IOException {

        ObjectMapper MapBtcJpyPrice = new ObjectMapper();
        Ticker BtcJpyPrice = MapBtcJpyPrice.readValue(getBtcJpyPriceResponse(),Ticker.class);

        return BtcJpyPrice.getResult().getPair().getO();
    }

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }

}

//07.06.18 Coding Fin ><(((('>