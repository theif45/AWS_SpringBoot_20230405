package com.web.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.web.study.IocAndDi.TestC;

@Configuration
public class BeanConfig {
	//라이브러리에서 가져온것들은 어노테이션을 등록이 안되기 때문에 여기 가져와서 등록
	@Bean
	public TestC testC() {
		return new TestC();
	}
}
