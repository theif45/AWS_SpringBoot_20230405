package com.web.study.service;

import java.util.List;

import com.web.study.dto.request.Course.CourseReqDto;
import com.web.study.dto.response.course.CourseRespDto;

public interface CourseService {
	public void registeCourse(CourseReqDto courseReqDto);
	public List<CourseRespDto> getCourseAll();
	public List<CourseRespDto> searchCourse(int type, String searchValue);
}
