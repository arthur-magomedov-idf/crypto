package com.coungard.crypto.connector;

import com.coungard.crypto.model.TickerDto;
import feign.Feign;
import feign.Logger;
import feign.Param;
import feign.RequestLine;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import java.util.List;

public interface CoinLoreConnector {

  static CoinLoreConnector connect() {
    return Feign.builder()
        .client(new OkHttpClient())
        .encoder(new GsonEncoder())
        .decoder(new GsonDecoder())
        .logger(new Slf4jLogger(CoinLoreConnector.class))
        .logLevel(Logger.Level.FULL)
        .target(CoinLoreConnector.class, "https://api.coinlore.net/api");
  }

  @RequestLine("GET /ticker?id={id}")
  List<TickerDto> coinTicker(@Param("id") Long id);
}
