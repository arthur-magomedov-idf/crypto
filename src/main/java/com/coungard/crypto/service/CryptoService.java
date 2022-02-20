package com.coungard.crypto.service;

import com.coungard.crypto.model.TickerResponse;
import com.coungard.crypto.entity.Ticker;
import java.util.List;

public interface CryptoService {

  List<TickerResponse> getTickerInfo(Long id);

  void saveTickerInfo(Ticker tickerDto);
}
