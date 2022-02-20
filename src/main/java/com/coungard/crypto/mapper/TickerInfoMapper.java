package com.coungard.crypto.mapper;

import com.coungard.crypto.model.TickerResponse;
import com.coungard.crypto.entity.Ticker;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TickerInfoMapper {

  TickerInfoMapper INSTANCE = Mappers.getMapper(TickerInfoMapper.class);

  List<Ticker> toTickerList(List<TickerResponse> tickerResponseList);
}
