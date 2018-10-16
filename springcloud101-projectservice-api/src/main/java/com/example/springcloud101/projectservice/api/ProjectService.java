package com.example.springcloud101.projectservice.api;


import java.math.BigDecimal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface ProjectService {

  /**
   * 获取募捐项目信息
   * @param id
   * @return
   * @throws Exception
   */
  @GetMapping("getProject")
  Project getProject(@RequestParam("id") long id) throws Exception;

  /**
   * 进行募捐
   * @param id
   * @param amount
   * @return 交易成功的金额
   * @throws Exception
   */
  @PostMapping("gotInvested")
  BigDecimal gotInvested(@RequestParam("id") long id,
      @RequestParam("amount") BigDecimal amount) throws Exception;

  /**
   * 提取募捐款
   * @param id
   * @return 交易成功的金额
   * @throws Exception
   */
  @PostMapping("lendpay")
  BigDecimal lendpay(@RequestParam("id") long id) throws Exception;
}
