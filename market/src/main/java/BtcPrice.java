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

        String responseUsdPrice;
        Map<String, String> UsdPrice = new HashMap();

        UsdPrice.put("pair", "XBTUSD");
        responseUsdPrice = api.queryPublic(KrakenApi.Method.TICKER, UsdPrice);
        System.out.println(responseUsdPrice);

        return responseUsdPrice;
    }

    public Ticker getBtcUsdTicker() throws IOException {

        ObjectMapper MapUsdTicker = new ObjectMapper();
        Ticker UsdTicker = MapUsdTicker.readValue(this.getBtcUsdPriceResponse(),Ticker.class);

        return UsdTicker;
    }

    public String getBtcUsdPrice() throws IOException {

        ObjectMapper MapUsdPrice = new ObjectMapper();
        Ticker UsdPrice = MapUsdPrice.readValue(getBtcUsdPriceResponse(),Ticker.class);

        return UsdPrice.getResult().getPair().getO();
    }

    public String getBtcCadPriceResponse() throws IOException {

        String responseCadPrice;
        Map<String, String> CadPrice = new HashMap();

        CadPrice.put("pair", "XBTCAD");
        responseCadPrice = api.queryPublic(KrakenApi.Method.TICKER, CadPrice);
        System.out.println(responseCadPrice);

        return responseCadPrice;
    }

    public Ticker getBtcCadTicker() throws IOException {

        ObjectMapper MapCadTicker = new ObjectMapper();
        Ticker CadTicker = MapCadTicker.readValue(this.getBtcCadPriceResponse(),Ticker.class);

        return CadTicker;
    }

    public String getBtcCadPrice() throws IOException {

        ObjectMapper MapCadPrice = new ObjectMapper();
        Ticker CadPrice = MapCadPrice.readValue(getBtcCadPriceResponse(),Ticker.class);

        return CadPrice.getResult().getPair().getO();
    }

    public String getBtcJpyPriceResponse() throws IOException {

        String responseJpyPrice;
        Map<String, String> JpyPrice = new HashMap();

        JpyPrice.put("pair", "XBTJPY");
        responseJpyPrice = api.queryPublic(KrakenApi.Method.TICKER, JpyPrice);
        System.out.println(responseJpyPrice);

        return responseJpyPrice;
    }

    public Ticker getBtcJpyTicker() throws IOException {

        ObjectMapper MapJpyTicker = new ObjectMapper();
        Ticker JpyTicker = MapJpyTicker.readValue(this.getBtcJpyPriceResponse(),Ticker.class);

        return JpyTicker;
    }

    public String getBtcJpyPrice() throws IOException {

        ObjectMapper MapJpyPrice = new ObjectMapper();
        Ticker JpyPrice = MapJpyPrice.readValue(getBtcJpyPriceResponse(),Ticker.class);

        return JpyPrice.getResult().getPair().getO();
    }

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }

}
