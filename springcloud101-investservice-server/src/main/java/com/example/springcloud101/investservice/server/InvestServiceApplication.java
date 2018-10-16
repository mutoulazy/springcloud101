package com.example.springcloud101.investservice.server;

import java.util.Arrays;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableJpaAuditing
@EnableHystrix
@EnableCircuitBreaker
public class InvestServiceApplication implements CommandLineRunner {
  @Autowired
  ApplicationContext applicationContext;

  public static void main(String[] args) {
    SpringApplication.run(InvestServiceApplication.class, args);
  }

  /**
   * 输出Spring中的Bean上定义的和Spring Cloud相关的注解
   * @param args
   * @throws Exception
   */
  @Override
  public void run(String... args) throws Exception {
    System.out.println("所有注解：");
    Stream.of(applicationContext.getBeanDefinitionNames())
        .map(applicationContext::getBean)
        .map(bean-> Arrays.asList(bean.getClass().getAnnotations()))
        .flatMap(a->a.stream())
        .filter(annotation -> annotation.annotationType().getName().startsWith("org.springframework.cloud"))
        .forEach(System.out::println);
  }
}
