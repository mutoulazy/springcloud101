package com.example.springcloud101.investservice.server;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Entity
@Table(name = "invest")
@EntityListeners(AuditingEntityListener.class)
public class InvestEntity {
  @Id
  @GeneratedValue
  private Long id;
  private long investorId;
  private long borrowerId;
  private long projectId;
  private String investorName;
  private String borrowerName;
  private String projectName;
  private BigDecimal amount;
  private int status;
  @CreatedDate
  private Date createdAt;
  @LastModifiedDate
  private Date updatedAt;
}
