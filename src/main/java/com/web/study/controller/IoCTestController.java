package com.web.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.IocAndDi.IocTest;
import com.web.study.IocAndDi.IocTest2;

import lombok.RequiredArgsConstructor;

@RestController
//@RequiredArgsConstructor
// 변수의 양이 많을 경우 RequiredArgsConstructor를 사용하여 
public class IoCTestController {

	@Autowired
	private IocTest iocTest;
	@Autowired
	private IocTest2 iocTest2;
	
	//@Autowired와 같은 역할
//	private final IocTest iocTest;
//	private final IocTest2 iocTest2;
//	public IoCTestController(IocTest iocTest, IocTest2 iocTest2){
//		this.iocTest = iocTest;
//		this.iocTest2 = iocTest2;
//	}
	
	@GetMapping("/ioc/test")
	public Object test() {
		iocTest.run();
		iocTest2.run();
		return null;
	}
}
