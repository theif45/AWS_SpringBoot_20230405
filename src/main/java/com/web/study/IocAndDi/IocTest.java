package com.web.study.IocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//componet 어노테이션을 사용한 것은 ioc컨테이너에 객체들을 넣고 bean이라고 부름
@Component
public class IocTest {
	
	@Qualifier("t1")
	@Autowired
	private Test test;
	
	// DI로 외부로부터 test를 받아서 옴
//	public IocTest(Test test) {
//		this.test = test;
//	}
	
	public void run() {
		test.printTest();
		System.out.println("IoCTest 출력!");
	}
}
