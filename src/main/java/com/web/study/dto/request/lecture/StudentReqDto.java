package com.web.study.dto.request.lecture;

import java.time.LocalDate;

import com.web.study.domain.entity.Student;

import lombok.Setter;

@Setter
public class StudentReqDto {
	private String name;
	private LocalDate birthDate;
	
	public Student toEntity() {
		return Student.builder()
				.name(name)
				.birth_date(birthDate)
				.build();
	}
}
