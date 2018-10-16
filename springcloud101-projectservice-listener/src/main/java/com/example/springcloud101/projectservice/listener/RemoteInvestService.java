package com.example.springcloud101.projectservice.listener;

import com.example.springcloud101.investservice.api.Invest;
import com.example.springcloud101.investservice.api.InvestService;
import java.math.BigDecimal;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(value = "investservice", fallback = RemoteInvestService.Fallback.class)
public interface RemoteInvestService extends InvestService {

  @Slf4j
  @Component
  class Fallback implements RemoteInvestService {

    @Override
    public Invest createOrder(long userId, long projectId, BigDecimal amount) throws Exception {
      log.warn("createOrder fallback");
      return null;
    }

    @Override
    public List<Invest> getOrders(long projectId) throws Exception {
      log.warn("getOrders fallback");
      return null;
    }
  }
}
