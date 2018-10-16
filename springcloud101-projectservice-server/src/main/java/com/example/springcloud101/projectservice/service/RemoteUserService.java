package com.example.springcloud101.projectservice.service;

import com.example.springcloud101.userservice.api.User;
import com.example.springcloud101.userservice.api.UserService;
import java.math.BigDecimal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(value = "userservice",fallback = RemoteUserService.Fallback.class)
public interface RemoteUserService extends UserService {
  @Component
  class Fallback implements RemoteUserService {

    @Override
    public User getUser(long id) throws Exception {
      return null;
    }

    @Override
    public BigDecimal consumeMoney(long investorId, BigDecimal amount) throws Exception {
      return null;
    }

    @Override
    public BigDecimal lendpayMoney(long investorId, long borrowerId, BigDecimal amount)
        throws Exception {
      return null;
    }
  }
}
