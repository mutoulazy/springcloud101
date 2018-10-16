package com.example.springcloud101.investservice.server;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface InvestRepository extends CrudRepository<InvestEntity, Long> {
  List<InvestEntity> findByProjectIdAndStatus(long projectId, int status);
}
