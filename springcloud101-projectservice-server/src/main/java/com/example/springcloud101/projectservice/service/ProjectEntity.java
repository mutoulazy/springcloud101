package com.example.springcloud101.projectservice.service;

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
@Table(name = "project")
@EntityListeners(AuditingEntityListener.class)
public class ProjectEntity {
  @Id
  @GeneratedValue
  private Long id;
  private BigDecimal totalAmount;
  private BigDecimal remainAmount;
  private String name;
  private String reason;
  private long borrowerId;
  private int status;
  @CreatedDate
  private Date createdAt;
  @LastModifiedDate
  private Date updatedAt;
}
