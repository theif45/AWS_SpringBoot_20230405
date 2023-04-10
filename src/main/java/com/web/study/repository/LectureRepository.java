package com.web.study.repository;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Lecture;
import com.web.study.domain.entity.Course;
import com.web.study.domain.entity.Lecturer;
import com.web.study.domain.entity.Student;
import com.web.study.dto.request.Course.CourseReqDto;
import com.web.study.dto.request.student.StudentReqDto;

@Mapper
public interface LectureRepository {
	public int registe(Lecture lecture);
}