package com.web.study.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.ShopMenuDto;

@RestController
public class BasicRestController2 {

	@GetMapping("/a")
	public ResponseEntity<? extends ResponseDto> a(@RequestParam("message") String message) {
		return ResponseEntity.ok().body(DataResponseDto.of(message));
	}

	@GetMapping("/b")
	public ResponseEntity<? extends ResponseDto> b(String notice, String name, int time) {
		String alarm = notice + "," + name + "," + time + "시";
		return ResponseEntity.ok().body(DataResponseDto.of(alarm));
	}

	@GetMapping("/c")
	public ResponseEntity<? extends ResponseDto> c(ShopMenuDto shopMenuDto) {
		String menu = shopMenuDto.getShopName() + "의" + shopMenuDto.getMenu();
		return ResponseEntity.ok().body(DataResponseDto.of(menu));
	}

	@PostMapping("/d")
	public ResponseEntity<? extends ResponseDto> d(ShopMenuDto shopMenuDto){
		String menu = shopMenuDto.getShopName() + "의" + shopMenuDto.getMenu();
		return ResponseEntity.created(null).body(DataResponseDto.of(menu));
	}
	
	@PostMapping("/e")
	public ResponseEntity<? extends ResponseDto> e(@RequestBody ShopMenuDto shopMenuDto){
		String menu = shopMenuDto.getShopName() + "의" + shopMenuDto.getMenu();
		return ResponseEntity.created(null).body(DataResponseDto.of(menu));
	}
}
