package com.example.springcloud101.projectservice.service;

import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<ProjectEntity, Long> {

}
