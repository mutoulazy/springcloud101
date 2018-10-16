package com.example.springcloud101.investservice.server;

import com.example.springcloud101.projectservice.api.Project;
import com.example.springcloud101.projectservice.api.ProjectService;
import java.math.BigDecimal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(value = "projectservice", fallback = RemoteProjectService.Fallback.class)
public interface RemoteProjectService extends ProjectService {
  @Component
  class Fallback implements RemoteProjectService {

    @Override
    public Project getProject(long id) throws Exception {
      return null;
    }

    @Override
    public BigDecimal gotInvested(long id, BigDecimal amount) throws Exception {
      return null;
    }

    @Override
    public BigDecimal lendpay(long id) throws Exception {
      return null;
    }
  }
}
