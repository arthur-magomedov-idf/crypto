package com.coungard.crypto.service;

import com.coungard.crypto.model.TickerDto;
import java.util.List;

public interface CryptoService {

  List<TickerDto> getTickerInfo(Long id);
}
