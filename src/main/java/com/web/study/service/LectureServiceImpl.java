package com.web.study.service;

import org.springframework.stereotype.Service;

import com.web.study.domain.entity.Lecture;
import com.web.study.domain.entity.LectureRegiste;
import com.web.study.domain.entity.Lecturer;
import com.web.study.domain.entity.Student;
import com.web.study.dto.request.lecture.LectureRegisteReqDto;
import com.web.study.dto.request.lecture.LectureReqDto;
import com.web.study.dto.request.lecture.LecturerReqDto;
import com.web.study.dto.request.lecture.StudentReqDto;
import com.web.study.repository.LectureRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LectureServiceImpl implements LectureService{
	
	private final LectureRepository lectureRepository;

	@Override
	public void registeLecture(LectureReqDto lectureReqDto) {
		// DTO -> ENTITY로 변환
		//DTO는 클라이언트 쪽, ENTITY는 데이터베이스 쪽
		Lecture lecture = lectureReqDto.toEntity();
		System.out.println("변환: " + lecture);
		lectureRepository.registe(lecture);
	}

	@Override
	public void registeLecturer(LecturerReqDto lecturerReqDto) {
		Lecturer lecturer = lecturerReqDto.toEntity();
		lectureRepository.registeLecturer(lecturer);
	}

	@Override
	public void registeStudent(StudentReqDto studentReqDto) {
		Student student = studentReqDto.toEntity();
		lectureRepository.registeStudent(student);
		
	}

	@Override
	public void registeLectureRegiste(LectureRegisteReqDto lectureRegisteReqDto) {
		LectureRegiste lectureRegiste = lectureRegisteReqDto.toEntity();
		lectureRepository.registeLectureRegiste(lectureRegiste);
		
	}

}
