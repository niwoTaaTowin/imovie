package com.imovie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.imovie.usermovie.mapper")
public class StarterUserMovieService {
	public static void main(String[] args) {
		SpringApplication.run(StarterUserMovieService.class, args);
	}
	//准备一个负载均衡访问的客户端对象
	//RestTemplate @Bean 注解实现一个对象由框架维护
	@Bean
	@LoadBalanced//ribbon 客户端扫描的负载均衡
	public RestTemplate initRestTemplate(){
		return new RestTemplate();
	}
	//修改自定义的随机负载均衡逻辑
	@Bean
	public IRule initRule(){
		return new RandomRule();
	}
}
