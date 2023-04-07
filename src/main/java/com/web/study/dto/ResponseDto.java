package com.web.study.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

//jackson이 가져와서 데이터를 json으로 변환해야하기 때문에 getter 필요
@Data
@RequiredArgsConstructor
public class ResponseDto {
	private final boolean success;
	private final int code;
	private final String message;
	
	public static ResponseDto ofDefault() {
		return new ResponseDto(true, 200, "Successfully");
	}
	
	public static ResponseDto of(boolean success, int code, String message) {
		return new ResponseDto(success, code, message);
	}
}
