package com.web.study.dto.request.lecture;

import java.time.LocalDate;

import com.web.study.domain.entity.Lecturer;

import lombok.Setter;

@Setter
public class LecturerReqDto {
	private String name;
	private LocalDate birthDate;
	
	public Lecturer toEntity() {
		return Lecturer.builder()
				.name(name)
				.birth_date(birthDate)
				.build();
	}
}
