import api.KrakenApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Ticker;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EthPrice {

    private KrakenApi api;

    public EthPrice() {
        this.api = new KrakenApi();
        this.api.setKey("oenG97umzj5IrnldcxqGSt9SQ/xuGIA2xLtnoAiYCPUDkQ5KYBgQTP+N");
        this.api.setSecret("LjHtZKrY9WOnVnUnM0d5KT8Y57DFHkexYTlMokXj0qx/VTijsN9N0YEA2ttI3axFNhuoUV6Hcgx4O0uk75bcyw==");
    }

    public String getEthUsdPriceResponse() throws IOException {
        //TODO - implement this method!
        return new String();
    }

    public Ticker getEthUsdTicker() throws IOException {
        //TODO - implement this method!
        return new Ticker();
    }

    public String getEthUsdPrice() throws IOException {
        //TODO - implement this method!
        return new String();
    }

    public String getEthCadPriceResponse() throws IOException {
        //TODO - implement this method!
        return new String();
    }

    public Ticker getEthCadTicker() throws IOException {
        //TODO - implement this method!
        return new Ticker();
    }

    public String getEthCadPrice() throws IOException {
        //TODO - implement this method!
        return new String();
    }

    public String getEthJpyPriceResponse() throws IOException {
        //TODO - implement this method!
        return new String();
    }

    public Ticker getEthJpyTicker() throws IOException {
        //TODO - implement this method!
        return new Ticker();
    }

    public String getEthJpyPrice() throws IOException {
        //TODO - implement this method!
        return new String();
    }

    public static void main (String[] args) {

        /**
         * FOR EXPERIMENTATION ONLY!
         */

    }
}
