package com.web.study.repository;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Lecture;
import com.web.study.domain.entity.LectureRegiste;
import com.web.study.domain.entity.Lecturer;
import com.web.study.domain.entity.Student;
import com.web.study.dto.request.lecture.LectureRegisteReqDto;
import com.web.study.dto.request.lecture.StudentReqDto;

@Mapper
public interface LectureRepository {
	public int registe(Lecture lecture);
	
	public int registeLecturer(Lecturer lecturer);
	
	public int registeStudent(Student student);
	
	public int registeLectureRegiste(LectureRegiste lectureRegiste);
}