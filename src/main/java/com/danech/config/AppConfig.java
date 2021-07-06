package com.danech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.danech.model.Student;

@Configuration
public class AppConfig {
	
	// create Redis Connection Factory
	@Bean
	public RedisConnectionFactory cf() {
		return new LettuceConnectionFactory();
	}
	// Redis template
	@Bean
	public RedisTemplate<String,Student> rt(){
		RedisTemplate<String, Student> rt = new RedisTemplate<>();
		rt.setConnectionFactory(cf());
		return rt;
	}
	
}
