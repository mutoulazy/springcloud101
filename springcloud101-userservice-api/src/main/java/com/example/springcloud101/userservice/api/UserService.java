package com.example.springcloud101.userservice.api;

import java.math.BigDecimal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {

  /**
   * 获取用户信息
   * @param id
   * @return
   * @throws Exception
   */
  @GetMapping("getUser")
  User getUser(@RequestParam("id") long id) throws Exception;

  /**
   * 投资人进行投资时，把投资金额从可用余额转为冻结余额
   * @param investorId
   * @param amount
   * @return 交易成功金额
   * @throws Exception
   */
  @PostMapping("consumeMoney")
  BigDecimal consumeMoney(@RequestParam("investorId") long investorId,
      @RequestParam("amount") BigDecimal amount) throws Exception;

  /**
   * 项目募集资金时，把投资人的钱从其冻结余额转入被投资人的余额
   * @param investorId
   * @param borrowerId
   * @param amount
   * @return 交易成功金额
   * @throws Exception
   */
  @PostMapping("lendpayMoney")
  BigDecimal lendpayMoney(@RequestParam("investorId") long investorId,
      @RequestParam("borrowerId") long borrowerId,
      @RequestParam("amount") BigDecimal amount) throws Exception;

}
