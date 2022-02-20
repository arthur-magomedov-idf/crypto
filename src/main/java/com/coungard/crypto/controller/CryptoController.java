package com.coungard.crypto.controller;

import com.coungard.crypto.model.TickerRequest;
import com.coungard.crypto.model.TickerResponse;
import com.coungard.crypto.service.CryptoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crypto")
public class CryptoController {

  @Autowired
  private CryptoService cryptoService;

  @PostMapping("/ticker")
  public List<TickerResponse> ticker(@RequestBody TickerRequest tickerRequest) {
    return cryptoService.getTickerInfo(tickerRequest.getId());
  }
}
