package com.web.study.service;

import java.util.List;

import com.web.study.dto.request.instructor.InstructorReqDto;
import com.web.study.dto.response.instructor.InstructorRespDto;

public interface InstructorService {
	public void registeInstructor(InstructorReqDto instructorReqDto);
	public List<InstructorRespDto> getInstructorAll();
	public InstructorRespDto findInstructorById(int id);
}
