package com.coungard.crypto.service;

import com.coungard.crypto.connector.CoinLoreConnector;
import com.coungard.crypto.model.TickerDto;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DefaultCryptoService implements CryptoService {

  private CoinLoreConnector coinLoreConnector = CoinLoreConnector.connect();

  @Override
  public List<TickerDto> getTickerInfo(Long id) {
    if (id == null) {
      throw new IllegalArgumentException("id can not be null");
    }
    return coinLoreConnector.coinTicker(id);
  }
}
