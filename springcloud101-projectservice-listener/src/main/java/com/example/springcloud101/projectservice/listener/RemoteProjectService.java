package com.example.springcloud101.projectservice.listener;

import com.example.springcloud101.projectservice.api.Project;
import com.example.springcloud101.projectservice.api.ProjectService;
import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(value = "projectservice", fallback = RemoteProjectService.Fallback.class)
public interface RemoteProjectService extends ProjectService {

  @Slf4j
  @Component
  class Fallback implements RemoteProjectService {

    @Override
    public Project getProject(long id) throws Exception {
      log.warn("getProject fallback");
      return null;
    }

    @Override
    public BigDecimal gotInvested(long id, BigDecimal amount) throws Exception {
      log.warn("gotInvested fallback");
      return null;
    }

    @Override
    public BigDecimal lendpay(long id) throws Exception {
      log.warn("lendpay fallback");
      return null;
    }
  }
}
