package com.web.study.dto.request.Course;

import java.time.LocalDate;

import com.web.study.domain.entity.Course;

import lombok.Setter;

@Setter
public class CourseReqDto {
	private int lectureId;
	private int studentId;
	private LocalDate registeDate;
	
	public Course toEntity() {
		return Course.builder()
				.ltm_id(lectureId)
				.sdm_id(studentId)
				.registe_date(registeDate)
				.build();
	}
}
