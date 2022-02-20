package com.coungard.crypto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Ticker {

  @Id
  private long id;
  @Column(name = "symbol")
  private String symbol;
  @Column(name = "name")
  private String name;
  @Column(name = "name_id")
  private String nameId;
  @Column(name = "rank")
  private int rank;
  @Column(name = "price_usd")
  private String priceUsd;
}
