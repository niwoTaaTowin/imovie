package com.imovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;


@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class IMovieStartGateWay {
	public static void main(String[] args){
		SpringApplication.run(IMovieStartGateWay.class, args);
	}
}
