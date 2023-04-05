package com.web.study.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 요청과 응답을 받을 수 있는 컨트롤러로 변경해줌
@RestController
public class HelloController {
	
//	get요청
	@GetMapping("/hello")
	public Map<String, String> hello(String name) {
		
		Map<String, String> testMap = new HashMap<>();
		testMap.put("name", name);
		testMap.put("age", "32");
		testMap.put("address", "부산 부산진구 부전동");
		return testMap;
	}
}
