# springcloud101
参考于 https://juejin.im/post/5bc013f45188255c3050156b#heading-11 实现

项目包含
  1. Spring Cloud Netflix Zuul网关服务器
  2. Spring Cloud Netflix Eureka发现服务器
  3. Spring Cloud Netflix Turbine断路器监控
  4. Spring Cloud Sleuth + Zipkin服务调用监控
  5. Sping Cloud Stream + RabbitMQ做异步消息
  6. Spring Data JPA做数据访问
  
记一下我遇到的小坑：
  1. 这个项目需要使用的mavne仓库最好不要使用国内阿里的镜像仓库
  2. 此项目需要配合自己启动redis 和 rabbitMQ
  3. 可能是因为自己笔记本的原因 微服务之间的请求很容易超时，需要对部分项目的配置文件进行修改
