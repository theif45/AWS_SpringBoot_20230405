package com.web.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.study.IocAndDi.IocTest;
import com.web.study.IocAndDi.TestB;

@SpringBootApplication
public class StudyApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
//		iocAndDiTest();
	}
	
//	public static void iocAndDiTest() {
//		//IoC컨테이너 내부에 부품들을 만들어 놓으면 스프링에서 알아서 조립을 해줌
//		//Inversion Of Control
//		//스프링이 개발자가 만든 부품들을 알아서 제어함
//		IocTest iocTest = new IocTest(new TestB());
//		iocTest.run();
//	}

}
