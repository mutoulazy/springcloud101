package com.example.springcloud101.userservice.server;

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
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
public class UserEntity {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private BigDecimal availableBalance;
  private BigDecimal frozenBalance;
  @CreatedDate
  private Date createdAt;
  @LastModifiedDate
  private Date updatedAt;
}
