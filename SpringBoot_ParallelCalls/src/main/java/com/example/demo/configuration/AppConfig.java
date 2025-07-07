package com.example.demo.configuration;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class AppConfig {
	
	
	@Bean(name="createThreadPool")
	public Executor createThreadPool()
	{
		ThreadPoolTaskExecutor threadPool=new ThreadPoolTaskExecutor();
		
		threadPool.setMaxPoolSize(4);
		threadPool.setThreadNamePrefix("Shekhar");
		threadPool.setCorePoolSize(4);
		threadPool.setQueueCapacity(10);
		return threadPool;	
	}

}
