package com.coungard.crypto.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class TickerResponse {

  private long id;
  private String symbol;
  private String name;
  @SerializedName("nameid")
  private String nameId;
  private int rank;
  @SerializedName("price_usd")
  private String priceUsd;
}
