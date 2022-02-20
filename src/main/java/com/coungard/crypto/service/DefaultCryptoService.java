package com.coungard.crypto.service;

import com.coungard.crypto.connector.CoinLoreConnector;
import com.coungard.crypto.mapper.TickerInfoMapper;
import com.coungard.crypto.model.TickerResponse;
import com.coungard.crypto.entity.Ticker;
import com.coungard.crypto.repository.CryptoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultCryptoService implements CryptoService {

  private static final CoinLoreConnector COIN_LORE_CONNECTOR = CoinLoreConnector.connect();

  @Autowired
  private CryptoRepository cryptoRepository;

  @Override
  public List<TickerResponse> getTickerInfo(Long id) {
    if (id == null) {
      throw new IllegalArgumentException("id can not be null");
    }
    List<TickerResponse> tickerResponses = COIN_LORE_CONNECTOR.coinTicker(id);
    List<Ticker> tickers = TickerInfoMapper.INSTANCE.toTickerList(tickerResponses);
    tickers.forEach(this::saveTickerInfo);

    return tickerResponses;
  }

  @Override
  public void saveTickerInfo(Ticker tickerDto) {
    cryptoRepository.save(tickerDto);
  }
}
