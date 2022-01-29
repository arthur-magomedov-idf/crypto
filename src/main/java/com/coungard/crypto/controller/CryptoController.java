package com.coungard.crypto.controller;

import com.coungard.crypto.model.TickerDto;
import com.coungard.crypto.service.CryptoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crypto")
public class CryptoController {

  @Autowired
  private CryptoService cryptoService;

  @GetMapping("/ticker")
  public List<TickerDto> getTicker(@RequestParam Long id) {
    return cryptoService.getTickerInfo(id);
  }
}
