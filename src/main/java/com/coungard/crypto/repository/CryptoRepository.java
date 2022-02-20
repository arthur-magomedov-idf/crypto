package com.coungard.crypto.repository;

import com.coungard.crypto.entity.Ticker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptoRepository extends JpaRepository<Ticker, Long> {

}
