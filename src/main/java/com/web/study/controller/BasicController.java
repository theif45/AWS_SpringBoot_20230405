package com.web.study.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ErrorResponseDto;
import com.web.study.dto.ResponseDto;

//@Controller
@RestController
public class BasicController {
	
//	응답 인터페이스
//	고정된 형식에 내용만 바꿔서 보냄
//	@RequestMapping(value = "/view/test", method = RequestMethod.GET)
//	@ResponseBody
	@GetMapping("/view/test")
	public ResponseEntity<? extends ResponseDto> view() {
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		
		if (strList.contains("e")) {
			try {
				throw new RuntimeException("오류");
			} catch (Exception e) {
				return ResponseEntity.badRequest().body(ErrorResponseDto.of(HttpStatus.INTERNAL_SERVER_ERROR, e));
			}
		}
		
		return ResponseEntity.ok().body(DataResponseDto.of(strList));
	}
}
// String일 때만 text로 응답이 오고 나머지는 JSON으로 응답이 옴
// RestController는 무조건 데이터를 리턴, view로 리턴하는 방법 없음
// Controller는 view를 리턴, ResponseBody를 쓰면 RestController와 같이 데이터를 리턴