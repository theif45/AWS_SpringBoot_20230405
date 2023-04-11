package com.web.study.domain.entity;

import com.web.study.dto.response.lecture.LectureRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Lecture {
	private int ltm_id;
	private String ltm_name;
	private int ltm_price;
	private int itm_id;
	private Instructor instructor;
	
	public LectureRespDto toDto() {
		String instructorName = null;
		
		if(instructor != null) {
			instructorName = instructor.getItm_name();
		}
		
		return LectureRespDto.builder()
				.lectureId(itm_id)
				.lectureName(ltm_name)
				.lecturePrice(itm_id)
				.instructorName(instructorName)
				.build();
	}
}
