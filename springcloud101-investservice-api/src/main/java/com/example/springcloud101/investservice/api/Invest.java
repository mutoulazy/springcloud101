package com.example.springcloud101.investservice.api;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Invest {
  private Long id;
  private long investorId;
  private long borrowerId;
  private long projectId;
  private int status;
  private BigDecimal amount;
  private Date createdAt;
  private Date updatedAt;
}
