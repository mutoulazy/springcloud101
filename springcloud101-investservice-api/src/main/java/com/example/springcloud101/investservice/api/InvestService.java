package com.example.springcloud101.investservice.api;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface InvestService {

  /**
   * 进行募捐项目
   * @param userId
   * @param projectId
   * @param amount
   * @return
   * @throws Exception
   */
  @PostMapping("createInvest")
  Invest createOrder(@RequestParam("userId") long userId,
      @RequestParam("projectId") long projectId,
      @RequestParam("amount") BigDecimal amount) throws Exception;

  /**
   * 获取正在募捐的项目列表
   * @param projectId
   * @return
   * @throws Exception
   */
  @GetMapping("getOrders")
  List<Invest> getOrders(@RequestParam("projectId") long projectId) throws Exception;
}
